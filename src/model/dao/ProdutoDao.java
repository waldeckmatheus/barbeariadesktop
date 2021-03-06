/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Funcionario;
import model.bean.Produto;
import model.connection.ConnectionFactory;

/**
 *
 * @author Equipe barbearia
 */
public class ProdutoDao implements CrudDao<Produto> {

    private Connection con = new ConnectionFactory().getConection();
    private PreparedStatement pstm;
    private ResultSet rs;
    private String sql;
    private final String columns = "prodcod,proddatainsercao,proddataatualizacao,prodnome,proddescricao, prodvalorcompra,prodvalorvenda,prodfuncod";
    private ArrayList<Produto> listaTabela;

    private FuncionarioDao funcionarioDao;

    @Override
    public void salvar(Produto produto) {
        try {
            String columnsWithoutCod = columns.replace("prodcod,", "");
            String[] splitted = columnsWithoutCod.split(",");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < splitted.length; i++) {
                sb.append("?,");
            }
            String questionsChars = sb.toString();
            questionsChars = questionsChars.substring(0, questionsChars.length() - 1);
            sql = "insert into produto(" + columnsWithoutCod + ") values (" + questionsChars + ")";
            pstm = con.prepareStatement(sql);

            pstm.setDate(1, new java.sql.Date(produto.getProdDataInsercao().getTime()));
            pstm.setDate(2, null);
            pstm.setString(3, produto.getProdNome());
            pstm.setString(4, produto.getProdDescricao());
            pstm.setFloat(5, produto.getProdValorCompra());
            pstm.setFloat(6, produto.getProdValorVenda());
            pstm.setInt(7, produto.getProdFuncionario().getFunCod());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir o produto." + e.getMessage());
        }
    }

    @Override
    public void deletar(int cod) {

        try {
            sql = "delete from produto where prodcod=?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, cod);

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso.");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "erro alterarPreparet" + e.getMessage());
        }
    }

    @Override
    public List<Produto> listar() {
        this.listaTabela = new ArrayList<>();
        try {
            sql = "select " + columns + " from produto";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setProdCod(rs.getInt(1));
                produto.setProdDataInsercao(rs.getTimestamp(2));
                produto.setProdDataAtualizacao(rs.getTimestamp(3));
                produto.setProdNome(rs.getString(4));
                produto.setProdDescricao(rs.getString(5));
                produto.setProdValorCompra(rs.getFloat(6));
                produto.setProdValorVenda(rs.getFloat(7));

                if (funcionarioDao == null) {
                    funcionarioDao = new FuncionarioDao();
                }

                Funcionario funcionario = funcionarioDao.consultarByCod(rs.getInt(8));
                produto.setProdFuncionario(funcionario);

                this.listaTabela.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os produtos! ." + e.getMessage());
        }
        return this.listaTabela;
    }

    @Override
    public void alterar(Produto produto) {
        try {
            sql = "update produto set proddataatualizacao = ?, prodnome= ?,proddescricao= ?, prodvalorcompra=?, prodvalorvenda=?, prodfuncod= ? where prodcod=?";
            pstm = con.prepareStatement(sql);

            pstm.setDate(1, new java.sql.Date(new Date().getTime()));
            pstm.setString(2, produto.getProdNome());
            pstm.setString(3, produto.getProdDescricao());
            pstm.setFloat(4, produto.getProdValorCompra());
            pstm.setFloat(5, produto.getProdValorVenda());
            pstm.setInt(6, produto.getProdFuncionario().getFunCod());
            pstm.setInt(7, produto.getProdCod());

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso.");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "erro alterar cliente" + e.getMessage());
        }
    }

    public ArrayList<Produto> filtrarPorNome(String nome) {
        this.listaTabela = new ArrayList<>();
        try {
            pstm = con.prepareStatement("select " + columns + " from produto where prodnome like ?");
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();

                mapAll(produto, rs);

                listaTabela.add(produto);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar por nome: " + e.getMessage());
        }
        return listaTabela;
    }

    public ArrayList<Produto> pesquisarPorCodigo(int cod) {
        this.listaTabela = new ArrayList<>();
        try {
            pstm = con.prepareStatement("select " + columns + " from produto where prodcod = '" + cod + "' ");

            rs = pstm.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                mapAll(produto, rs);

                listaTabela.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar por código: " + e.getMessage());
        }
        return listaTabela;
    }

    public void mapAll(Produto produto, ResultSet rs) throws SQLException {
        produto.setProdCod(rs.getInt(1));
        produto.setProdDataInsercao(rs.getTimestamp(2));
        produto.setProdDataAtualizacao(rs.getTimestamp(3));
        produto.setProdNome(rs.getString(4));
        produto.setProdDescricao(rs.getString(5));
        produto.setProdValorCompra(rs.getFloat(6));
        produto.setProdValorVenda(rs.getFloat(7));
    }
}

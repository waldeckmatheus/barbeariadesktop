/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Funcionario;
import model.connection.ConnectionFactory;

/**
 *
 * @author Equipe barbearia
 */
public class FuncionarioDao implements CrudDao<Funcionario> {

    private Connection con = new ConnectionFactory().getConection();
    private PreparedStatement pstm;
    private ResultSet rs;
    private String sql;

    @Override
    public void salvar(Funcionario entidade) {
        try {
            sql = "insert into funcionario(funnome,funlogin,funsenha,funcao,funpercent)values (?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, entidade.getFunNome());
            pstm.setString(2, entidade.getFunLogin());
            pstm.setString(3, entidade.getFunSenha());
            pstm.setString(4, entidade.getFuncao());
            pstm.setInt(5, entidade.getFunPercent());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "USUARIO NAO CADASTRADO ." + e.getMessage());
        }
    }

    @Override
    public void deletar(int cod) {

        try {
            sql = "delete from funcionario where funcod=?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, cod);

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro alterarPreparet" + e.getMessage());
        }
    }

    @Override
    public List<Funcionario> listar() {
        ArrayList<Funcionario> listaTabela = new ArrayList<Funcionario>();
        try {
            sql = "select * from funcionario";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            while (rs.next()) {
                Funcionario fun = new Funcionario();
                fun.setFunCod(rs.getInt(1));
                fun.setFunNome(rs.getString(2));
                fun.setFunLogin(rs.getString(3));
                fun.setFunSenha(rs.getString(4));
                fun.setFuncao(rs.getString(5));
                fun.setFunPercent(rs.getInt(6));

                listaTabela.add(fun);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar os funcionarios! ." + e.getMessage());
        }
        return listaTabela;
    }

    @Override
    public void alterar(Funcionario entidade) {
        try {
            sql = "update funcionario set funnome= ?,funlogin=?,funsenha=?,funcao=?,funpercent=?  where funcod=?";
            pstm = con.prepareStatement(sql);

            pstm.setString(1, entidade.getFunNome());
            pstm.setString(2, entidade.getFunLogin());
            pstm.setString(3, entidade.getFunSenha());
            pstm.setString(4, entidade.getFuncao());
            pstm.setInt(5, entidade.getFunPercent());
            pstm.setInt(6, entidade.getFunCod());

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro alterar cliente" + e.getMessage());
        }
    }

    public ArrayList<Funcionario> filtrarPorNome(String nome) {
        ArrayList<Funcionario> listaTabela = new ArrayList<Funcionario>();
        try {
            pstm = con.prepareStatement("select * from funcionario where funnome like ?");
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Funcionario fun = new Funcionario();
                fun.setFunCod((rs.getInt(1)));
                fun.setFunNome(rs.getString(2));
                fun.setFunLogin(rs.getString(3));
                fun.setFunSenha(rs.getString(4));
                fun.setFuncao(rs.getString(5));
                fun.setFunPercent(rs.getInt(6));
                listaTabela.add(fun);

            }
        } catch (Exception erro) {

        }
        return listaTabela;
    }

    public void alterarSenhaFuncionario(Funcionario fun) {
        try {
            sql = "update funcionario set funsenha = ? where funcod = ?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, fun.getFunSenha());
            pstm.setInt(2, fun.getFunCod());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro alterar senha funcionario" + e.getMessage());
        }

    }

    public ArrayList<Funcionario> pesquisarPorCodigo(int cod) {
        ArrayList<Funcionario> listaTabela = new ArrayList<Funcionario>();
        try {
            pstm = con.prepareStatement("select * from funcionario where funcod = '" + cod + "' ");

            rs = pstm.executeQuery();
            while (rs.next()) {

                Funcionario fun = new Funcionario();
                fun.setFunCod(rs.getInt(1));
                fun.setFunNome(rs.getString(2));
                fun.setFunLogin(rs.getString(3));
                fun.setFunSenha(rs.getString(4));
                fun.setFuncao(rs.getString(5));
                fun.setFunPercent(rs.getInt(6));
                listaTabela.add(fun);

                listaTabela.add(fun);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro listar por codigo" + erro.getMessage());
        }
        return listaTabela;
    }

    public Funcionario consultarByLoginSenha(String login, String senha) throws SQLException {
        Funcionario funcionario = null;

        pstm = con.prepareStatement("select funcod, funnome,funlogin,funsenha,funcao,funpercent from funcionario where funlogin = ? and funsenha = ?");
        pstm.setString(1, login);
        pstm.setString(2, senha);
        rs = pstm.executeQuery();
        if (rs.first()) {
            funcionario = new Funcionario();
            funcionario.setFunCod((rs.getInt(1)));
            funcionario.setFunNome(rs.getString(2));
            funcionario.setFunLogin(rs.getString(3));
            funcionario.setFunSenha(rs.getString(4));
            funcionario.setFuncao(rs.getString(5));
            funcionario.setFunPercent(rs.getInt(6));
        }
        rs.close();
        pstm.close();
        return funcionario;
    }

    /**
     * O método consulta os dados do funcionário sem apresentar login e senha
     *
     * @param cod
     *
     * @throws SQLException
     */
    public Funcionario consultarByCod(int cod) throws SQLException {
        Funcionario funcionario = null;

        pstm = con.prepareStatement("select funcod, funnome,funcao,funpercent from funcionario where funcod = ?");
        pstm.setInt(1, cod);
        rs = pstm.executeQuery();
        if (rs.first()) {
            funcionario = new Funcionario();
            funcionario.setFunCod((rs.getInt(1)));
            funcionario.setFunNome(rs.getString(2));
            funcionario.setFuncao(rs.getString(3));
            funcionario.setFunPercent(rs.getInt(4));
        }
        rs.close();
        pstm.close();
        return funcionario;
    }

}

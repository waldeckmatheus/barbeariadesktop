/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 */
public class ConnectionFactory {

    public static Connection getConection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/barbearia";
            String login = "root";
            String senha = "121334";
            con = DriverManager.getConnection(url, login, senha);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão" + erro.getMessage());

        }
        return con;

    }

}

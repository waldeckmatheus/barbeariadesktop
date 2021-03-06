/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.bean.Funcionario;
import model.dao.FuncionarioDao;
import utilitarios.KeyMappingUtil;

/**
 *
 * @author Equipe barbearia
 */
public class Login extends javax.swing.JFrame {

    private final FuncionarioDao funcionarioDAO;

    /**
     * Creates new form Login
     */
    public Login() {
        this.funcionarioDAO = new FuncionarioDao();
        
        initComponents();
        this.ajustarLayout();
    }

    private void ajustarLayout() {
        jPanel1.setBackground(new Color(0, 0, 0, 150));
        //jPanel3.setBackground(new Color(0, 0, 0, 140));
        jPanel2.setBackground(new Color(0, 0, 0, 140));
    }
    public String getPassword(){
        StringBuilder sb = new StringBuilder();
        for (char c: txtsenha.getPassword()){
            sb.append(String.valueOf(c));
        }
        return sb.toString();
    }
    public void realizarLogin() {
        String login, senha;
        login = txtlogin.getText();
        senha = getPassword();

        try {
            Funcionario funcionario = funcionarioDAO.consultarByLoginSenha(login, senha);

            if (funcionario != null) {
                inicializarTelaPrincipal(funcionario);
                this.dispose();
                System.out.println("Login realizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Acesso negado, senha incorreta");
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro, por favor contatar o administrador");
        }
    }

    public void inicializarTelaPrincipal(Funcionario funcionario) throws SQLException {
        ViewTelaPrincipal l = new ViewTelaPrincipal(funcionario);
        l.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon=new ImageIcon(getClass().getResource("/imagens/barbeiro2.jpg")); Image image = icon.getImage();
        jPanel4 = new javax.swing.JPanel(){  public void paintComponent(Graphics g){ g.drawImage(image,0,0,getWidth(),getHeight(),this); }  };
        jPanel2 = new javax.swing.JPanel();
        lbtitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsenha = 
        new utilitarios.JPassWordFieldHint(new JPasswordField(),"icons8-senha-48 (1)"," Digite sua Senha.");
        txtlogin = 

        new utilitarios.JTextFieldHint(new JTextField(),"icons8-usuário-40 (1)" ,"Digite o seu Login.");
        btRealizarLogin = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 410));
        setPreferredSize(new java.awt.Dimension(400, 410));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(36, 47, 65));
        jPanel4.setLayout(null);

        jPanel2.setLayout(null);

        lbtitulo.setBackground(new java.awt.Color(255, 255, 255));
        lbtitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbtitulo.setText("BARBEARIA JL");
        jPanel2.add(lbtitulo);
        lbtitulo.setBounds(30, 10, 281, 43);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(100, 60, 440, 80);

        jPanel1.setBackground(new java.awt.Color(104, 175, 245));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(15, 215, 70, 30);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(13, 260, 78, 40);

        txtsenha.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });
        txtsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsenhaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsenhaKeyReleased(evt);
            }
        });
        jPanel1.add(txtsenha);
        txtsenha.setBounds(90, 260, 260, 40);

        txtlogin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
            }
        });
        jPanel1.add(txtlogin);
        txtlogin.setBounds(90, 209, 260, 40);

        btRealizarLogin.setBackground(new java.awt.Color(0, 153, 51));
        btRealizarLogin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btRealizarLogin.setForeground(new java.awt.Color(255, 255, 255));
        btRealizarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-mais-80 (1) (2).png"))); // NOI18N
        btRealizarLogin.setText("Entrar");
        btRealizarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRealizarLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btRealizarLogin);
        btRealizarLogin.setBounds(50, 320, 140, 40);

        btcancel.setBackground(new java.awt.Color(204, 0, 0));
        btcancel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btcancel.setForeground(new java.awt.Color(255, 255, 255));
        btcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cancelar-64 (1).png"))); // NOI18N
        btcancel.setText("Sair");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });
        jPanel1.add(btcancel);
        btcancel.setBounds(200, 320, 140, 40);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(350, 0, 390, 540);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login (3).jpg"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(40, 200, 200, 270);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(-1, 0, 740, 540);

        setSize(new java.awt.Dimension(741, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btcancelActionPerformed

    private void btRealizarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRealizarLoginActionPerformed
        this.realizarLogin();
    }//GEN-LAST:event_btRealizarLoginActionPerformed

    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhaActionPerformed

    }//GEN-LAST:event_txtsenhaActionPerformed

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed
        // TODO add your handling code here:
        System.out.println("asd");
    }//GEN-LAST:event_txtloginActionPerformed

    private void txtsenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsenhaKeyTyped

    }//GEN-LAST:event_txtsenhaKeyTyped

    private void txtsenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsenhaKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyMappingUtil.KEY_ENTER) {
            this.realizarLogin();
        }
    }//GEN-LAST:event_txtsenhaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRealizarLogin;
    private javax.swing.JButton btcancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbtitulo;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}

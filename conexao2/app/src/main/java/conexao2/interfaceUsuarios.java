/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conexao2;

import java.sql.Connection;
import javax.swing.JScrollPane;

/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class interfaceUsuarios extends javax.swing.JFrame {

     private ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
     private Connection conexao = conexaoSQLite.conectar();
    /**
     * Creates new form interfaceUsuarios
     */
    public interfaceUsuarios() {
        initComponents();
        
        if(conexao != null){
            CriarTabela.criarTabelaUsuarios(conexao);
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        botaoAdd = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        inserirID = new javax.swing.JTextField();
        inserirNome = new javax.swing.JTextField();
        inserirEmail = new javax.swing.JTextField();
        botaoDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDeTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel.setBackground(new java.awt.Color(204, 204, 204));

        botaoAdd.setText("Adicionar");
        botaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        inserirID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inserirID.setText("Insira o ID");
        inserirID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inserirIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inserirIDFocusLost(evt);
            }
        });

        inserirNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inserirNome.setText("Insira o nome");
        inserirNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inserirNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inserirNomeFocusLost(evt);
            }
        });
        inserirNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirNomeActionPerformed(evt);
            }
        });

        inserirEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inserirEmail.setText("Insira o email");
        inserirEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inserirEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inserirEmailFocusLost(evt);
            }
        });
        inserirEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirEmailActionPerformed(evt);
            }
        });

        botaoDeletar.setText("Deletar");

        areaDeTexto.setColumns(20);
        areaDeTexto.setRows(5);
        jScrollPane1.setViewportView(areaDeTexto);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelLayout.createSequentialGroup()
                        .addComponent(botaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inserirEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inserirNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inserirID, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inserirID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inserirNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inserirEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddActionPerformed
        InserirUsuario.inserirUsuario(conexao, inserirNome.getText(), inserirEmail.getText());
        areaDeTexto.setText(ListarUsuarios.listarUsuarios(conexao));
    }//GEN-LAST:event_botaoAddActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void inserirNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserirNomeActionPerformed

    private void inserirEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserirEmailActionPerformed

    private void inserirIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inserirIDFocusGained
        if(inserirID.getText().equals("Insira o ID")){
            inserirID.setText("");
        }
        
    }//GEN-LAST:event_inserirIDFocusGained

    private void inserirIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inserirIDFocusLost
        if(inserirID.getText().equals("")){
            inserirID.setText("Insira o ID");
        }
    }//GEN-LAST:event_inserirIDFocusLost

    private void inserirNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inserirNomeFocusGained
        if(inserirNome.getText().equals("Insira o nome")){
            inserirNome.setText("");
        }
    }//GEN-LAST:event_inserirNomeFocusGained

    private void inserirNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inserirNomeFocusLost
        if(inserirNome.getText().equals("")){
            inserirNome.setText("Insira o nome");
        }
    }//GEN-LAST:event_inserirNomeFocusLost

    private void inserirEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inserirEmailFocusGained
        if(inserirEmail.getText().equals("Insira o email")){
            inserirEmail.setText("");
        }
    }//GEN-LAST:event_inserirEmailFocusGained

    private void inserirEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inserirEmailFocusLost
        if(inserirEmail.getText().equals("")){
            inserirEmail.setText("Insira o email");
        }
    }//GEN-LAST:event_inserirEmailFocusLost

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaceUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDeTexto;
    private javax.swing.JButton botaoAdd;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JTextField inserirEmail;
    private javax.swing.JTextField inserirID;
    private javax.swing.JTextField inserirNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}

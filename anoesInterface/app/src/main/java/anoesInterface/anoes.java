/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package anoesInterface;
import javax.swing.ImageIcon;
/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class anoes extends javax.swing.JFrame {

    /**
     * Creates new form anoes
     */
    public anoes() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imageAnao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tipoJardim = new javax.swing.JToggleButton();
        tipoReal = new javax.swing.JToggleButton();
        pesoMedio = new javax.swing.JToggleButton();
        pesoForte = new javax.swing.JToggleButton();
        corBranco = new javax.swing.JToggleButton();
        corNegro = new javax.swing.JToggleButton();
        idadeJovem = new javax.swing.JToggleButton();
        idadeVelho = new javax.swing.JToggleButton();
        humorFeliz = new javax.swing.JToggleButton();
        humorBrabo = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setText("Selecione o tipo do anão");

        jLabel3.setText("Selecione o shape do anão");

        jLabel4.setText("Selecione a idade do anão");

        jLabel5.setText("Selecione a cor do anão");

        jLabel6.setText("Selecione o humor do anão");

        tipoJardim.setSelected(true);
        tipoJardim.setText("De jardim");
        tipoJardim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoJardimActionPerformed(evt);
            }
        });

        tipoReal.setText("Real");
        tipoReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoRealActionPerformed(evt);
            }
        });

        pesoMedio.setSelected(true);
        pesoMedio.setText("Normal");
        pesoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoMedioActionPerformed(evt);
            }
        });

        pesoForte.setText("No meu nível");
        pesoForte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoForteActionPerformed(evt);
            }
        });

        corBranco.setSelected(true);
        corBranco.setText("Branco");
        corBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corBrancoActionPerformed(evt);
            }
        });

        corNegro.setText("negro");
        corNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corNegroActionPerformed(evt);
            }
        });

        idadeJovem.setSelected(true);
        idadeJovem.setText("Jovem");
        idadeJovem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeJovemActionPerformed(evt);
            }
        });

        idadeVelho.setText("Velho");
        idadeVelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeVelhoActionPerformed(evt);
            }
        });

        humorFeliz.setSelected(true);
        humorFeliz.setText("Feliz");
        humorFeliz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humorFelizActionPerformed(evt);
            }
        });

        humorBrabo.setText("Raivoso");
        humorBrabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humorBraboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(corBranco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(corNegro))
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idadeJovem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idadeVelho, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(humorFeliz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(humorBrabo))
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pesoMedio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesoForte))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tipoJardim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoReal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(imageAnao, javax.swing.GroupLayout.PREFERRED_SIZE, 1345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoJardim)
                    .addComponent(tipoReal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoMedio)
                    .addComponent(pesoForte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corBranco)
                    .addComponent(corNegro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idadeJovem)
                    .addComponent(idadeVelho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(humorFeliz)
                    .addComponent(humorBrabo))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(imageAnao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        corBranco.getAccessibleContext().setAccessibleName("Branco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void trocarImagem(){
        String imageS = "anao";//String de escolhera a imagem selecionada
        if(tipoJardim.isSelected()){
            imageS += "Jardim";
        } else{
            imageS += "Real";
        }
        if(pesoMedio.isSelected()){
            imageS += "Medio";
        } else{
            imageS += "Forte";
        }
        if(corBranco.isSelected()){
            imageS += "Branco";
        } else{
            imageS += "Negro";
        }
        if(idadeJovem.isSelected()){
            imageS += "Jovem";
        } else {
            imageS += "Velho";
        }
        if(humorFeliz.isSelected()){
            imageS += "Feliz";
        } else{
            imageS += "Bravo";
        }
        
        imageS += ".jpg";
        
        System.out.println(imageS);
        ImageIcon imagemAnao = new ImageIcon(getClass().getResource(imageS));
        imageAnao.setIcon(imagemAnao);
    }
    private void tipoRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoRealActionPerformed
        tipoJardim.setSelected(false);
        trocarImagem();
    }//GEN-LAST:event_tipoRealActionPerformed

    private void tipoJardimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoJardimActionPerformed
        tipoReal.setSelected(false);
        trocarImagem();
    }//GEN-LAST:event_tipoJardimActionPerformed

    private void pesoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoMedioActionPerformed
        pesoForte.setSelected(false);
        trocarImagem();
    }//GEN-LAST:event_pesoMedioActionPerformed

    private void pesoForteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoForteActionPerformed
        pesoMedio.setSelected(false);
        trocarImagem();
    }//GEN-LAST:event_pesoForteActionPerformed

    private void corBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corBrancoActionPerformed
        corNegro.setSelected(false);
        trocarImagem();
    }//GEN-LAST:event_corBrancoActionPerformed

    private void corNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corNegroActionPerformed
        corBranco.setSelected(false);
        trocarImagem();
    }//GEN-LAST:event_corNegroActionPerformed

    private void idadeJovemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeJovemActionPerformed
        idadeVelho.setSelected(false);
        trocarImagem();
    }//GEN-LAST:event_idadeJovemActionPerformed

    private void idadeVelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeVelhoActionPerformed
        idadeJovem.setSelected(false);
        trocarImagem();
    }//GEN-LAST:event_idadeVelhoActionPerformed

    private void humorFelizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humorFelizActionPerformed
        humorBrabo.setSelected(false);
        trocarImagem();
    }//GEN-LAST:event_humorFelizActionPerformed

    private void humorBraboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humorBraboActionPerformed
        humorFeliz.setSelected(false);
        trocarImagem();
    }//GEN-LAST:event_humorBraboActionPerformed

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
            java.util.logging.Logger.getLogger(anoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton corBranco;
    private javax.swing.JToggleButton corNegro;
    private javax.swing.JToggleButton humorBrabo;
    private javax.swing.JToggleButton humorFeliz;
    private javax.swing.JToggleButton idadeJovem;
    private javax.swing.JToggleButton idadeVelho;
    private javax.swing.JLabel imageAnao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton pesoForte;
    private javax.swing.JToggleButton pesoMedio;
    private javax.swing.JToggleButton tipoJardim;
    private javax.swing.JToggleButton tipoReal;
    // End of variables declaration//GEN-END:variables
}

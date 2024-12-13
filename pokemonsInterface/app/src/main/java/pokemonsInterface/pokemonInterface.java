/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pokemonsInterface;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class pokemonInterface extends javax.swing.JFrame {

    private ArrayList<Pokemon> estoque = new ArrayList<>();
    private ArrayList<Pokemon> mochila = new ArrayList<>();
    
    private DefaultListModel<String> listModelMochila = new DefaultListModel<>();
    
        
    /**
     * Creates new form pokemonInterface
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoAdd = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEstoque = new javax.swing.JList<>();
        imagemPrincipal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        listMochila = new javax.swing.JList<>();
        botaoTrocar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        textoInfo = new javax.swing.JTextArea();
        botaoVerShreck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoAdd.setText("Adicionar a mochila");
        botaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddActionPerformed(evt);
            }
        });

        botaoRemover.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoRemover.setText("Remover da mochila");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        listEstoque.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        listEstoque.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pikachu | Elétrico", "Charizard | Fogo/Voador", "Gengar | Fantasma/Veneno", "Snorlax | Normal", "Lucario | Lutador/Metálico", "Eevee | Normal", "Gyarados | Água/Voador", "Alakazam | Psíquico", "Machamp | Lutador", "Bulbasaur | Planta/Veneno", "Jigglypuff | Normal/Fada", "Arcanine | Fogo" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listEstoque);

        imagemPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pikaxuPixel.png"))); // NOI18N

        jTextPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextPane1.setText("Estoque");
        jScrollPane2.setViewportView(jTextPane1);

        listMochila.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        listMochila.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Exemplo | Fogo | nv 12" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listMochila);

        botaoTrocar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoTrocar.setText("Trocar");

        jScrollPane4.setToolTipText("");

        jTextPane2.setBackground(new java.awt.Color(204, 204, 255));
        jTextPane2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextPane2.setText("Mochilha");
        jScrollPane4.setViewportView(jTextPane2);

        textoInfo.setColumns(20);
        textoInfo.setRows(5);
        textoInfo.setToolTipText("");
        jScrollPane5.setViewportView(textoInfo);

        botaoVerShreck.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoVerShreck.setText("Ver o Shreck");
        botaoVerShreck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerShreckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(704, 704, 704)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imagemPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(botaoAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoTrocar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(botaoVerShreck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imagemPrincipal)
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoVerShreck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoTrocar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoRemover)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public pokemonInterface() {
        initComponents();

        listMochila.setModel(listModelMochila);
        
        estoque.add(new Pokemon("Pikachu", "Elétrico", 1, "pikachu.png"));
        estoque.add(new Pokemon("Charizard", "Fogo/Voador", 1, "charizard.png"));
        estoque.add(new Pokemon("Gengar", "Fantasma/Veneno", 1, "gengar.png"));
        estoque.add(new Pokemon("Snorlax", "Normal", 1, "snorlax.png"));
        estoque.add(new Pokemon("Lucario", "Lutador/Metálico", 1, "lucario.png"));
        estoque.add(new Pokemon("Eevee", "Normal", 1, "eevee.png"));
        estoque.add(new Pokemon("Gyarados", "Água/Voador", 1, "gyarados.png"));
        estoque.add(new Pokemon("Alakazam", "Psíquico", 1, "alakazam.png"));
        estoque.add(new Pokemon("Machamp", "Lutador", 1, "machamp.png"));
        estoque.add(new Pokemon("Bulbasaur", "Planta/Veneno", 1, "bulbasaur.png"));
        estoque.add(new Pokemon("Jigglypuff", "Normal/Fada", 1, "jigglypuff.png"));
        estoque.add(new Pokemon("Arcanine", "Fogo", 1, "arcanine.png"));
        
        // Adicionar um listener para detectar seleções
        listEstoque.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Evitar que o evento seja disparado duas vezes (quando a seleção muda)
                if (!e.getValueIsAdjusting()) {
                    // Obter o item selecionado
                    String itemSelecionado = listEstoque.getSelectedValue();
                    if (itemSelecionado != null) {
                         for(int i = 0; i < estoque.size() ; i++){
                            if(estoque.get(i).getPokemonSimples().equals(itemSelecionado)){
                                imagemPrincipal.setIcon(new ImageIcon(getClass().getResource(estoque.get(i).imagem)));
                                
                                }   
                            }
                        }
                    }
                }
        });
    }
    
    private void atualizarMochila(){
        
    }
    

    
    private void botaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddActionPerformed
            for(int i = 0; i < estoque.size() ; i++){
                if(estoque.get(i).getPokemonSimples().equals(listEstoque.getSelectedValue())){
                    if(mochila.size() < 6){
                        mochila.add(estoque.get(i));
                        listModelMochila.addElement(estoque.get(i).getPokemon());
                    }
                
                }       
            }
    }//GEN-LAST:event_botaoAddActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        for(int i = 0; i < mochila.size(); i++){
            if(mochila.get(i).getPokemon().equals(listMochila.getSelectedValue())){
                listModelMochila.remove(i);
                mochila.remove(i);
            }
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoVerShreckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerShreckActionPerformed
        ImageIcon imagemSherk = new ImageIcon(getClass().getResource("shrek.jpg"));
        imagemPrincipal.setIcon(imagemSherk);
    }//GEN-LAST:event_botaoVerShreckActionPerformed

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
            java.util.logging.Logger.getLogger(pokemonInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pokemonInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pokemonInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pokemonInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pokemonInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdd;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoTrocar;
    private javax.swing.JButton botaoVerShreck;
    private javax.swing.JLabel imagemPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JList<String> listEstoque;
    private javax.swing.JList<String> listMochila;
    private javax.swing.JTextArea textoInfo;
    // End of variables declaration//GEN-END:variables
}

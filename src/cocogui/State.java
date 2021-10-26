/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocogui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class State extends javax.swing.JFrame {

    /**
     * Creates new form State
     */
    public State() {
        initComponents();
        
    }
    
    public void setInvisible(){
        secretText.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StateCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Redirect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        IRText = new javax.swing.JTextArea();
        fbCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        secretText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Foodbank Nearby Me");
        setMinimumSize(new java.awt.Dimension(390, 350));
        setPreferredSize(new java.awt.Dimension(390, 350));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StateCB.setBackground(new java.awt.Color(204, 204, 255));
        StateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Johor", "Kedah", "Kelantan", "Malacca", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Sabah", "Sarawak", "Selangor", "Terengganu", "Kuala Lumpur", "Labuan", "Putrajaya" }));
        StateCB.setSelectedIndex(-1);
        StateCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateCBActionPerformed(evt);
            }
        });
        getContentPane().add(StateCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lemon", 0, 11)); // NOI18N
        jLabel1.setText("Choose your state");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Redirect.setBackground(new java.awt.Color(0, 0, 0));
        Redirect.setFont(new java.awt.Font("Lemon", 0, 11)); // NOI18N
        Redirect.setForeground(new java.awt.Color(0, 204, 204));
        Redirect.setText("Redirect");
        Redirect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Redirect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedirectActionPerformed(evt);
            }
        });
        getContentPane().add(Redirect, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 100, -1));

        IRText.setBackground(new java.awt.Color(204, 204, 255));
        IRText.setColumns(20);
        IRText.setRows(5);
        jScrollPane1.setViewportView(IRText);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 210, 160));

        fbCombo.setBackground(new java.awt.Color(204, 255, 204));
        fbCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbComboActionPerformed(evt);
            }
        });
        fbCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fbComboKeyPressed(evt);
            }
        });
        getContentPane().add(fbCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 30, 140, -1));

        jLabel2.setFont(new java.awt.Font("Lemon", 0, 11)); // NOI18N
        jLabel2.setText("Foodbank list nearby");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 160, -1));

        searchButton.setBackground(new java.awt.Color(0, 0, 0));
        searchButton.setFont(new java.awt.Font("Lemon", 0, 11)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 204, 204));
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addImage/state.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -70, 400, 490));

        secretText.setText("jLabel4");
        getContentPane().add(secretText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StateCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateCBActionPerformed
        IRText.setText("");
        fbCombo.removeAllItems();
        String state=String.valueOf(StateCB.getSelectedItem()) ;
        tableMethod tm=new tableMethod();
        ArrayList<String> allData=tm.readTable("User");
        String[] data;
        int cnt=1;
        for(int i=0;i<allData.size();i++){
            data=allData.get(i).split("\t");
            if(data[4].equals(state)){
                
                if(tm.getStatus(data[6]).equals("1")){
                    fbCombo.addItem(cnt+"  "+data[1]+"  "+data[5]);
                    secretText.setText(secretText.getText()+allData.get(i)+"\n");
                    cnt++;
                }
            }
        }
        
        
    }//GEN-LAST:event_StateCBActionPerformed

    private void RedirectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedirectActionPerformed
        
        int a=fbCombo.getSelectedIndex();
        String[] dataArr=secretText.getText().split("\n")[a].split("\t");
        String targetUrl = "https://www.google.com/maps?q="+dataArr[3];

        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(targetUrl));
        } catch (IOException ex) {
            Logger.getLogger(State.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_RedirectActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        secretText.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void fbComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbComboActionPerformed
    }//GEN-LAST:event_fbComboActionPerformed

    private void fbComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fbComboKeyPressed

    }//GEN-LAST:event_fbComboKeyPressed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        IRText.setText("");
        int a=fbCombo.getSelectedIndex();
        String[] dataArr=secretText.getText().split("\n")[a].split("\t");
       
        IRText.append("Food Bank Info ");
        IRText.append("\nName: "+dataArr[1]);
        IRText.append("\nAddress: "+dataArr[3]);
        IRText.append("\nPhone Number: "+dataArr[5]);
        IRText.append("\nEmail: "+dataArr[6]+"\nStatus: Openning");
    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(State.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(State.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(State.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(State.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new State().setVisible(true);
                
            }
              
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea IRText;
    private javax.swing.JButton Redirect;
    private javax.swing.JComboBox<String> StateCB;
    private javax.swing.JComboBox<String> fbCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel secretText;
    // End of variables declaration//GEN-END:variables
}

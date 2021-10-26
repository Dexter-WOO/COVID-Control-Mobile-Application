/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocogui;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author winso
 */
public class IndividualReceiver extends javax.swing.JFrame {

    /**
     * Creates new form IndividualReceiver
     */
    public IndividualReceiver() {
        initComponents();
    }
    
    public void NewIndividualReceiver(String a) {
        note2.setText(a);
       
    }
    public void setInvisible(){
        SFBBut.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpRequest = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        SubmitHelpBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        HisFrame = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        IRText = new javax.swing.JTextArea();
        received = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        HisCB = new javax.swing.JComboBox<>();
        SearchBut = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        secretText = new javax.swing.JLabel();
        SFBBut = new javax.swing.JButton();
        helpBut = new javax.swing.JButton();
        HisBut = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        note2 = new javax.swing.JLabel();

        helpRequest.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        helpRequest.setTitle("help request");
        helpRequest.setMinimumSize(new java.awt.Dimension(320, 300));
        helpRequest.setPreferredSize(new java.awt.Dimension(320, 300));
        helpRequest.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lemon", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Note: ");
        helpRequest.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        SubmitHelpBut.setFont(new java.awt.Font("Lemon", 0, 11)); // NOI18N
        SubmitHelpBut.setText("Submit Help Request");
        SubmitHelpBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitHelpButActionPerformed(evt);
            }
        });
        helpRequest.getContentPane().add(SubmitHelpBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        TxtArea.setBackground(new java.awt.Color(204, 204, 255));
        TxtArea.setColumns(20);
        TxtArea.setRows(5);
        jScrollPane1.setViewportView(TxtArea);

        helpRequest.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 150));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addImage/help.jpg"))); // NOI18N
        helpRequest.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -150, 530, 460));

        HisFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        HisFrame.setTitle("Request History");
        HisFrame.setMinimumSize(new java.awt.Dimension(420, 450));
        HisFrame.setPreferredSize(new java.awt.Dimension(420, 450));
        HisFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                HisFrameWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                HisFrameWindowOpened(evt);
            }
        });
        HisFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IRText.setBackground(new java.awt.Color(204, 204, 255));
        IRText.setColumns(20);
        IRText.setRows(5);
        jScrollPane2.setViewportView(IRText);

        HisFrame.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 220, 230));

        received.setBackground(new java.awt.Color(0, 0, 0));
        received.setFont(new java.awt.Font("Lemon", 0, 11)); // NOI18N
        received.setForeground(new java.awt.Color(255, 204, 204));
        received.setText("Received!");
        received.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receivedActionPerformed(evt);
            }
        });
        HisFrame.getContentPane().add(received, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 110, 30));

        jLabel2.setFont(new java.awt.Font("Lemon", 0, 24)); // NOI18N
        jLabel2.setText("History");
        HisFrame.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 110, -1));

        HisCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                HisCBItemStateChanged(evt);
            }
        });
        HisCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HisCBActionPerformed(evt);
            }
        });
        HisFrame.getContentPane().add(HisCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 200, -1));

        SearchBut.setBackground(new java.awt.Color(0, 0, 0));
        SearchBut.setFont(new java.awt.Font("Lemon", 0, 11)); // NOI18N
        SearchBut.setForeground(new java.awt.Color(255, 204, 204));
        SearchBut.setText("Search");
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });
        HisFrame.getContentPane().add(SearchBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addImage/his.jpg"))); // NOI18N
        HisFrame.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 410, 520));

        secretText.setEnabled(false);
        HisFrame.getContentPane().add(secretText, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Receiver");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SFBBut.setBackground(new java.awt.Color(0, 0, 0));
        SFBBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SFBBut.setForeground(new java.awt.Color(255, 204, 0));
        SFBBut.setText("Search Foodbank");
        SFBBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SFBBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SFBButActionPerformed(evt);
            }
        });
        getContentPane().add(SFBBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 220, 30));

        helpBut.setBackground(new java.awt.Color(0, 0, 0));
        helpBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        helpBut.setForeground(new java.awt.Color(51, 51, 255));
        helpBut.setText("Create Help Request");
        helpBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButActionPerformed(evt);
            }
        });
        getContentPane().add(helpBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 220, 30));

        HisBut.setBackground(new java.awt.Color(0, 0, 0));
        HisBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HisBut.setForeground(new java.awt.Color(0, 204, 204));
        HisBut.setText("Request History");
        HisBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HisBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HisButActionPerformed(evt);
            }
        });
        getContentPane().add(HisBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 220, 30));

        jLabel4.setFont(new java.awt.Font("Lemon", 0, 12)); // NOI18N
        jLabel4.setText("---We are always here with you ----");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Selection Box: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addImage/whiteflag.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 460, 310));

        note2.setText("jLabel3");
        note2.setEnabled(false);
        getContentPane().add(note2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButActionPerformed
        helpRequest.setLocationRelativeTo(null);;
        helpRequest.setVisible(true);
    }//GEN-LAST:event_helpButActionPerformed

    private void SubmitHelpButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitHelpButActionPerformed
      
       
        tableMethod tm = new tableMethod();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd\tHH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        tm.appendData("Request",note2.getText() + "\t" + dtf.format(now) + "\t" +  TxtArea.getText() + "\t" + "0");
        JOptionPane.showMessageDialog(this, "Helped requested successfully");
        helpRequest.dispose();
       
    }//GEN-LAST:event_SubmitHelpButActionPerformed

    private void HisButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HisButActionPerformed
        IRText.setText("");
        HisCB.removeAllItems();
        SearchBut.setVisible(false);
        received.setVisible(false);
        tableMethod tm = new tableMethod();
        ArrayList<String> allData = tm.readTable("Request");
        String[] data;
        int cnt = 1;
        for(int i = 0; i< allData.size(); i++ )
        {
            data = allData.get(i).split("\t");
           
            if (data[0].equals(note2.getText()))
            {
               
                HisCB.addItem(String.valueOf(cnt) + ") " + data[1] + "  " + data[2]);
                cnt++;
            }
        }
        HisFrame.setLocationRelativeTo(null);
        HisFrame.setVisible(true);
    }//GEN-LAST:event_HisButActionPerformed

    private void HisFrameWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_HisFrameWindowOpened
       
    }//GEN-LAST:event_HisFrameWindowOpened

    private void HisCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HisCBActionPerformed
        IRText.setText("");
        String dateTime=String.valueOf(HisCB.getSelectedItem());
        
        String[] date=dateTime.split("  ");
        tableMethod tm = new tableMethod();
        ArrayList<String> allData = tm.readTable("Request");
        String[] data;
        boolean flag=false;
        int cnt=0;
        for(int i = 0; i< allData.size(); i++ )
        {
            data = allData.get(i).split("\t");
           
            if (data[2].equals(date[1]))
            {   
                secretText.setText(data[2]);
                        
                IRText.append("Email: "+data[0]);
                IRText.append("\nDate: "+data[1]);
                IRText.append("\nTime: "+data[2]);
                IRText.append("\nRemarks: "+data[3]+"\nStatus: ");
                IRText.append(data[4].equals("0")? "Ongoing":"Done");
                flag=true;
                cnt=i;
                break;
            }
        }
        data = allData.get(cnt).split("\t");
        if(flag==true){
            if(data[4].equals("0")){
                received.setVisible(true);
            }
        }
        else{
            IRText.append("No Receiving tickets found!");
        }
        
    }//GEN-LAST:event_HisCBActionPerformed

    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButActionPerformed
        IRText.setText("");
        String dateTime=String.valueOf(HisCB.getSelectedItem());
        
        String[] date=dateTime.split("  ");
        tableMethod tm = new tableMethod();
        ArrayList<String> allData = tm.readTable("Request");
        String[] data;
        boolean flag=false;
        int cnt=0;
        for(int i = 0; i< allData.size(); i++ )
        {
            data = allData.get(i).split("\t");
           
            if (data[2].equals(date[1]))
            {   
                secretText.setText(data[2]);
                        
                IRText.append("Email: "+data[0]);
                IRText.append("\nDate: "+data[1]);
                IRText.append("\nTime: "+data[2]);
                IRText.append("\nRemarks: "+data[3]+"\nStatus: ");
                IRText.append(data[4].equals("0")? "Ongoing":"Done");
                flag=true;
                cnt=i;
                break;
            }
        }
        data = allData.get(cnt).split("\t");
        if(flag==true){
            if(data[4].equals("0")){
                received.setVisible(true);
            }
        }
        else{
            IRText.append("No Receiving tickets found!");
        }
    }//GEN-LAST:event_SearchButActionPerformed

    private void receivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receivedActionPerformed
        received.enableInputMethods(false);
        String time=secretText.getText();
        tableMethod tm=new tableMethod();
        ArrayList<String> allData=tm.readTable("Request");
        String[] data;
        for(int i = 0; i< allData.size(); i++ ){
            data = allData.get(i).split("\t");
            if (data[2].equals(time)){
                data[4]="1";
                allData.set(i,data[0]+"\t"+data[1]+"\t"+data[2]+"\t"+data[3]+"\t"+data[4]);
            }
        }
        tm.deleteTable("Request");
        for(int i = 0; i< allData.size(); i++ ){
            tm.appendData("Request", allData.get(i));
        }
        JOptionPane.showMessageDialog(this, "Ticket Information Updated Successfully! ");
        received.setVisible(false);
        SearchBut.doClick();
    }//GEN-LAST:event_receivedActionPerformed

    private void HisFrameWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_HisFrameWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_HisFrameWindowActivated

    private void HisCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_HisCBItemStateChanged
        
    }//GEN-LAST:event_HisCBItemStateChanged

    private void SFBButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SFBButActionPerformed
        dispose();
        State s=new State();
        s.setLocationRelativeTo(null);
        s.setVisible(true);
        s.setInvisible();
    }//GEN-LAST:event_SFBButActionPerformed

    
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
            java.util.logging.Logger.getLogger(IndividualReceiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndividualReceiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndividualReceiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndividualReceiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndividualReceiver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HisBut;
    private javax.swing.JComboBox<String> HisCB;
    private javax.swing.JFrame HisFrame;
    private javax.swing.JTextArea IRText;
    private javax.swing.JButton SFBBut;
    private javax.swing.JButton SearchBut;
    private javax.swing.JButton SubmitHelpBut;
    private javax.swing.JTextArea TxtArea;
    private javax.swing.JButton helpBut;
    private javax.swing.JFrame helpRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel note2;
    private javax.swing.JButton received;
    private javax.swing.JLabel secretText;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.project;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class IssueBook extends javax.swing.JFrame {
    Connection con= Connect. Connection(); 
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
        SimpleDateFormat sfd=new SimpleDateFormat("dd/mm/yyyy");
        Date d =new Date();
        txtissue.setText(sfd.format(d));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbookid = new javax.swing.JTextField();
        txtstudentid = new javax.swing.JTextField();
        txtbook = new javax.swing.JTextField();
        txtissue = new javax.swing.JTextField();
        txtdue = new javax.swing.JTextField();
        btnissue = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Issue Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 29, 136, 43));

        btnclose.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\imagesproject\\close icon.png")); // NOI18N
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 142, 122, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Student ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 184, 122, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Book Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 229, 122, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Issue Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 279, 122, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Due Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 332, 122, -1));

        txtbookid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 143, 180, -1));

        txtstudentid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 185, 180, -1));

        txtbook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 230, 180, -1));

        txtissue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 280, 180, -1));

        txtdue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtdue, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 331, 180, -1));

        btnissue.setBackground(new java.awt.Color(255, 0, 0));
        btnissue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnissue.setForeground(new java.awt.Color(255, 255, 255));
        btnissue.setText("Issue");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });
        getContentPane().add(btnissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 406, -1, -1));

        btnsearch.setBackground(new java.awt.Color(255, 0, 51));
        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 143, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
        // TODO add your handling code here:
        if(txtbookid.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter book id and then search");
            txtbookid.requestFocus();
        }
        else{
            try {
                pst=con.prepareStatement("UPDATE BOOK SET STATUS=?,ISSUEDATE=?,DUEDATE=?,STUDENTID=?");
                pst.setString(1,"ISSUED");
                pst.setString(2, txtissue.getText());
                pst.setString(3, txtdue.getText());
                pst.setString(4, txtstudentid.getText());
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Book Isuued");
                txtbookid.setText("");
                txtbook.setText("");
                txtstudentid.setText("");
                txtissue.setText("");
                txtdue.setText("");
                
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnissueActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        if(txtbookid.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter book id and then search");
            txtbookid.requestFocus();
        }
        else{
            try {
                pst=con.prepareStatement("SELECT * FROM BOOK WHERE ID=?");
                pst.setString(1,txtbookid.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    txtbook.setText(rs.getString(2));
                }
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnsearchActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnissue;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtbook;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtdue;
    private javax.swing.JTextField txtissue;
    private javax.swing.JTextField txtstudentid;
    // End of variables declaration//GEN-END:variables
}

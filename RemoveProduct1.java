
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Nithi
 */
public class RemoveProduct1 extends javax.swing.JFrame {
    Connection con;
//    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form RemoveProduct
     */
    public RemoveProduct1() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,(int)dim.getWidth(), (int) dim.getHeight());
        Connect();
        FetchData();
    }
    public void Connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/helpingHandsDb";
            con = DriverManager.getConnection(url, "root" , "");
        }
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(null , "Not Connected");
        }
    }    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pcode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Product Code");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 640, -1, 47));

        pcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcodeActionPerformed(evt);
            }
        });
        getContentPane().add(pcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, 236, 38));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Remove Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 289, 50));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 15, 188, 51));

        data.setBackground(new java.awt.Color(0, 0, 0));
        data.setBorder(javax.swing.BorderFactory.createTitledBorder("USER ACCOUNT DETAILS"));
        data.setForeground(new java.awt.Color(255, 255, 204));
        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data.setDragEnabled(true);
        data.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(data);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 90, 1340, 555));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 15, 188, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hari\\Downloads\\My project.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -220, 1366, 1200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //int code = Integer.parseInt(pcode.getText());
        try {
            pst = con.prepareStatement("DELETE FROM post WHERE PID = " + pcode.getText());
            int status = pst.executeUpdate();
            if(status >0)
                JOptionPane.showMessageDialog(null , "DELETED SUCCESSFULLY");
            else
                JOptionPane.showMessageDialog(null , "PRODUCT NOT FOUND");
//        int pCode = Integer.parseInt(code)
        } catch (SQLException ex) {
            Logger.getLogger(RemoveProduct1.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Enter valid Product id");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Admin d2 = new Admin();
        d2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        data.setModel(new DefaultTableModel());
        FetchData();    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public void FetchData()
    {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/helpingHandsDb";
                Connection c = DriverManager.getConnection(url, "root" , "");
                Statement st = c.createStatement();
                String query = "SELECT * FROM post";
                ResultSet rs = st.executeQuery(query);
                ResultSetMetaData rm = rs.getMetaData();
                DefaultTableModel model = (DefaultTableModel)data.getModel();
                
                int cols = rm.getColumnCount()-1;
                String[] colName = new String[cols];
                for(int i=0; i<cols; i++)
                        colName[i] = rm.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                data.setShowHorizontalLines(true);
                data.setShowVerticalLines(true);
                data.setRowHeight(30);
                data.getColumnModel().getColumn(2).setPreferredWidth(150);
                
//                String fn , ln , email , pwd , city , state , mno , gender;
                String pName , pCode , pDesp , pPrice;
                while(rs.next())
                {
                    pName = rs.getString(2);
                    pCode = String.valueOf(rs.getString(1));
                    pPrice = String.valueOf(rs.getString(3));
                    pDesp = String.valueOf(rs.getString(4));
                    String[] row = {pCode, pName , pPrice , pDesp};
                    model.addRow(row);                }
                st.close();
                c.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Enter valid Product id");            }
    }
        
        
        
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
            java.util.logging.Logger.getLogger(RemoveProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveProduct1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pcode;
    // End of variables declaration//GEN-END:variables
}
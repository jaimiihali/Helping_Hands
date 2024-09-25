
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Nithi
 */
public class PostPage extends javax.swing.JFrame {

    /**
     * Creates new form ShopPage
     */
    
    public PostPage() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,(int)dim.getWidth(), (int) dim.getHeight());
        products.setLayout(new GridLayout(0,4,10,10));
//        JScrollPane jsp = new JScrollPane(products,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        this.add(jsp);
        try
            {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/helpingHandsDb";
            Connection c = DriverManager.getConnection(url, "root" , "");
            Statement st = c.createStatement();
            String com = "SELECT * FROM post";
            ResultSet rs = st.executeQuery(com);
            ArrayList<String> list = new ArrayList<String>();
            while(rs.next())
            {
                printProducts(rs);
                //products.select.addActionListener( evt ->{nextPage(str1);});
            }
/*                list.add(rs.getString("ProductName"));
                System.out.println(list);
            }
            int length = list.size();
            JButton currProduct = null;
            while(length-- >0)
            {
                currProduct = (JButton) products.add(new JButton(list.get(length)));
                System.out.println(list.get(length));
            }
            System.out.println(" Button : " + currProduct.getText());*/
            products.setVisible(true);
            }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public String log;
    /*public ShopPageTemp(Login.User o) {
        initComponents();
        Login.User u = o;
/*        if(!"__Admin2022@".equals(u.EmailID))
        {
            addProduct.setVisible(false);
            dbDetails.setVisible(false);
        }
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/vshopping";
            Connection c = DriverManager.getConnection(url, "root" , "");
            Statement st = c.createStatement();
            String com = "SELECT * FROM productdetails";
            ResultSet rs = st.executeQuery(com);
            JLabel j = new JLabel();
            String str = rs.getString("ProductName");
            j.setText(str);
            System.out.println(str);
            j.setVisible(true);
            products.add(j);
/*            while(rs.next())
            {        
                String s = rs.getString("ProductName");
                products.add("product1",j );
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Not connected to database");
            System.out.println("Exception"+e);
        }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        types = new javax.swing.JLayeredPane();
        Back = new javax.swing.JButton();
        logged = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        products = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        types.setBackground(new java.awt.Color(255, 102, 0));
        types.setForeground(new java.awt.Color(255, 255, 204));
        types.setLayout(new java.awt.GridLayout(0, 1));
        getContentPane().add(types, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 198, 574));

        Back.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1261, 67, -1, 24));

        logged.setText("jLabel1");
        getContentPane().add(logged, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 39, 97, -1));

        products.setBackground(new java.awt.Color(0, 0, 0));
        products.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        products.setIconifiable(true);
        products.setResizable(true);
        products.setToolTipText("");
        products.setVisible(true);
        products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productsMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout productsLayout = new javax.swing.GroupLayout(products.getContentPane());
        products.getContentPane().setLayout(productsLayout);
        productsLayout.setHorizontalGroup(
            productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1378, Short.MAX_VALUE)
        );
        productsLayout.setVerticalGroup(
            productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1212, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(products);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 82, 1160, 590));

        jLabel1.setText("logged in as");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1239, 39, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Catalogue");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 155, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hari\\Downloads\\My project-3.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1450, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        HelperHome o1=new HelperHome();
        
        o1.logged.setText(this.logged.getText());
        o1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void productsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseEntered
        // TODO add your handling code here:
        //products.setAutoscrolls(true);
        //        jScrollBar1.setAutoscrolls(true);
    }//GEN-LAST:event_productsMouseEntered
private void nextPage(String str1, int price){
        try 
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helpingHandsDb","root","");
            Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);     
            ResultSet  rs = stmt.executeQuery("select * FROM needydetails");
            int price1=0;
            while(rs.next())
            {
                String s1=rs.getString("Email");
                System.out.println(str1);
                if(str1.startsWith(s1))
                {
                    int p1 = rs.getInt("Money");
                    price1=price+p1;
                }
            }
            String str2 ="UPDATE needydetails SET Money='"+price1+"' WHERE Email ='"+str1+"'";
            stmt.executeUpdate(str2);
            Statement stmt1 = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);     
            ResultSet  rs1 = stmt1.executeQuery("select * FROM logindetails");
            int p2=0;
            while(rs1.next())
            {
                String s1=rs1.getString("Email");
                System.out.println(log);
                if(log.startsWith(s1))
                {
                    p2 = rs1.getInt("Money");
                    p2 = p2-price;
                }
            }
            
            String str3 ="UPDATE logindetails SET Money='"+p2+"' WHERE Email ='"+log+"'";

            
            stmt1.executeUpdate(str3);
            System.out.println("success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("success");
    }
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
            java.util.logging.Logger.getLogger(ShopPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostPage().setVisible(true);
            }
        });
    }
    public void  printProducts(ResultSet rs)
    {
        String name , desp = new String();
        int price;
        byte[] img;
        try 
        {
            name = rs.getString("PName");
            price = rs.getInt("MinPrice");
            desp = rs.getString("Description");
            img = rs.getBytes("Image");
            String code1=rs.getString("PID");
            String needy=rs.getString("Needy");
            ImageIcon ic = new ImageIcon();
            ic = new ImageIcon(img);
            Image i1 = ic.getImage();
            Image i2 = i1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon mainImg = new ImageIcon(i2);
            
            JLabel lname = new JLabel();
            lname.setText(name);
            lname.setVisible(true);
            products.add(lname);
            lname.setHorizontalAlignment(JLabel.RIGHT);
            
            JLabel lprice = new JLabel();
            lprice.setText("$"+Integer.toString(price));
            lprice.setVisible(true);
            products.add(lprice);
            lprice.setHorizontalAlignment(JLabel.RIGHT);
            
            JLabel limg = new JLabel();
            limg.setIcon(mainImg);
            limg.setVisible(true);
            products.add(limg);
            limg.setHorizontalAlignment(JLabel.RIGHT);

            JButton select = new JButton();
            select.setText("Pay to the post");
            select.setVisible(true);
            select.addActionListener( evt ->{nextPage(needy,price);});
            products.add(select);
            select.setHorizontalAlignment(JLabel.RIGHT);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(PostPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel logged;
    private javax.swing.JInternalFrame products;
    private javax.swing.JLayeredPane types;
    // End of variables declaration//GEN-END:variables
}
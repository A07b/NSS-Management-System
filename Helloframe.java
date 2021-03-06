import com.jtattoo.plaf.texture.TextureLookAndFeel;
import javax.swing.*;
import java.awt.*;
public class Helloframe extends javax.swing.JFrame {

    /**
     * Creates new form Helloframe
     */
    public Helloframe() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon myimg=new ImageIcon("C:\\Users\\LENOVO\\Desktop\\900px-NSS-symbol-removebg-preview.png");
        Image img1 = myimg.getImage();
        Image img2 = img1.getScaledInstance(Logolbl.getWidth(),Logolbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledimg =new ImageIcon(img2);
        Logolbl.setIcon(scaledimg);
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LENOVO\\Desktop\\final_icon_kZY_icon.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpanel = new javax.swing.JPanel();
        frontpan = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Logolbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABSA's NSS Management System 1.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setResizable(false);

        bgpanel.setBackground(new java.awt.Color(255, 255, 204));
        bgpanel.setOpaque(false);
        bgpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frontpan.setBackground(new java.awt.Color(255, 255, 204));
        frontpan.setOpaque(false);
        frontpan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        frontpan.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 130, 54));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please Click On The Following Button To Start The System");
        frontpan.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1510, 80));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome To The NSS Management System 1.0 ");
        frontpan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1510, 80));
        frontpan.add(Logolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 350, 350));

        bgpanel.add(frontpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("ABSA's NSS Management System 1.0");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Loginform l1= new Loginform();
        l1.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      /*  try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Helloframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Helloframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Helloframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Helloframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>*/
      try{
            UIManager.setLookAndFeel(new TextureLookAndFeel());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Helloframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logolbl;
    private javax.swing.JPanel bgpanel;
    private javax.swing.JPanel frontpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

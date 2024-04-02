        
package gui;

import java.awt.Color;


public class SplashScreen2 extends javax.swing.JFrame {

    public SplashScreen2() {
        initComponents();
        
        super.setLocationRelativeTo(null);
        jProgressBar1.setForeground(Color.blue);
        SplashScreen2.SplashThread obj=new SplashScreen2.SplashThread();
        obj.start();  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        lblLoading = new javax.swing.JLabel();
        lblPer = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setForeground(new java.awt.Color(0, 204, 255));
        jProgressBar1.setBorder(null);
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 560, 20));

        lblLoading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(255, 255, 255));
        lblLoading.setText("Loading...");
        jPanel1.add(lblLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        lblPer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPer.setForeground(new java.awt.Color(255, 255, 255));
        lblPer.setText("0  %");
        jPanel1.add(lblPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, -1, -1));

        lblBg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Pictures\\mainImg.jpg")); // NOI18N
        jPanel1.add(lblBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(SplashScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen2().setVisible(true);
            }
        });
    }
    class SplashThread extends Thread{
    public void run(){
        
        for(int i=0;i<=100;i++){
            
            lblPer.setText(i+" %");
            if(i==10){
                lblLoading.setText("Turning on modules...");
            }
             if(i==40){
                lblLoading.setText("Loding modules...");
            }
              if(i==70){
                lblLoading.setText("Connecting to DataBase...");
            }
              jProgressBar1.setValue(i);
            try{
                Thread.sleep(25);
            }catch(InterruptedException ex){
                System.out.println("Exception in SplashThread:"+ex);
            }
            
        }
        
        LogInFrame2 loginFrame=new LogInFrame2();
        loginFrame.setVisible(true);
        SplashScreen2.this.dispose();
        
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblPer;
    // End of variables declaration//GEN-END:variables
}

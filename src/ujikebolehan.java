
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANNAR
 */
public class ujikebolehan extends javax.swing.JFrame {

    String temp = "";
    double tinggi, berat, xxx;

    /**
     * Creates new form ujikebolehan
     */
    public ujikebolehan() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        tbNama = new javax.swing.JTextField();
        tbTinggi = new javax.swing.JTextField();
        tbBerat = new javax.swing.JTextField();
        rbPr = new javax.swing.JRadioButton();
        rbLk = new javax.swing.JRadioButton();
        tvHasil1 = new javax.swing.JTextField();
        tvHasil2 = new javax.swing.JTextField();
        tvHasil = new javax.swing.JTextField();
        bHitung = new javax.swing.JButton();
        bCobalagi = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(tbNama);
        tbNama.setBounds(160, 60, 210, 30);
        getContentPane().add(tbTinggi);
        tbTinggi.setBounds(160, 100, 60, 30);
        getContentPane().add(tbBerat);
        tbBerat.setBounds(160, 140, 60, 30);

        buttonGroup1.add(rbPr);
        rbPr.setText("Perempuan");
        rbPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrActionPerformed(evt);
            }
        });
        getContentPane().add(rbPr);
        rbPr.setBounds(160, 180, 93, 23);

        buttonGroup1.add(rbLk);
        rbLk.setText("Laki-laki");
        rbLk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLkActionPerformed(evt);
            }
        });
        getContentPane().add(rbLk);
        rbLk.setBounds(280, 180, 93, 23);
        getContentPane().add(tvHasil1);
        tvHasil1.setBounds(150, 310, 290, 30);
        getContentPane().add(tvHasil2);
        tvHasil2.setBounds(150, 350, 290, 30);
        getContentPane().add(tvHasil);
        tvHasil.setBounds(350, 260, 60, 30);

        bHitung.setText("Hitung");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });
        getContentPane().add(bHitung);
        bHitung.setBounds(100, 210, 90, 40);

        bCobalagi.setText("Coba Lagi");
        bCobalagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCobalagiActionPerformed(evt);
            }
        });
        getContentPane().add(bCobalagi);
        bCobalagi.setBounds(190, 210, 90, 40);

        bKeluar.setText("Keluar");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(bKeluar);
        bKeluar.setBounds(280, 210, 90, 40);

        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 20, 130, 30);

        jLabel2.setText("Tinggi");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 110, 50, 30);

        jLabel3.setText("Jenis Kelamin");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 180, 100, 30);

        jLabel4.setText("kg");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 260, 50, 30);

        jLabel5.setText("Berat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 150, 50, 30);

        jLabel6.setText("cm");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 110, 40, 30);

        jLabel7.setText("kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, 150, 30, 30);

        jLabel8.setText("Nama");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 70, 50, 30);

        jLabel9.setText("Hasil Diagnosa");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 290, 100, 30);

        jLabel10.setText("Berat badan ideal adalah");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(170, 260, 180, 30);

        setBounds(0, 0, 507, 432);
    }// </editor-fold>//GEN-END:initComponents

    private void rbPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrActionPerformed
        // TODO add your handling code here:
        rbPr.setSelected(false);
    }//GEN-LAST:event_rbPrActionPerformed

    private void rbLkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLkActionPerformed
        // TODO add your handling code here:
        rbLk.setSelected(false);
    }//GEN-LAST:event_rbLkActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        // TODO add your handling code here:
        if (tbNama.getText().equals("")||tbBerat.getText().equals("")||tbTinggi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data belu diisi semuanya");
        }else if(rbPr.isSelected()||rbLk.isSelected()){
            try{
                Proses();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Inputan ada yang salah");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Anda belum memilih jenis kelamin");
        }        
    }//GEN-LAST:event_bHitungActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bKeluarActionPerformed

    private void bCobalagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCobalagiActionPerformed
        // TODO add your handling code here:
        tbNama.setText("");
        tbTinggi.setText("");
        tbBerat.setText("");
        tvHasil.setText("");
        tvHasil.setText("");
        tvHasil2.setText("");
    }//GEN-LAST:event_bCobalagiActionPerformed

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
            java.util.logging.Logger.getLogger(ujikebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ujikebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ujikebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ujikebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ujikebolehan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCobalagi;
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bKeluar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbLk;
    private javax.swing.JRadioButton rbPr;
    private javax.swing.JTextField tbBerat;
    private javax.swing.JTextField tbNama;
    private javax.swing.JTextField tbTinggi;
    private javax.swing.JTextField tvHasil;
    private javax.swing.JTextField tvHasil1;
    private javax.swing.JTextField tvHasil2;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
      tinggi = Double.valueOf(tbTinggi.getText());
        berat = Double.valueOf(tbBerat.getText());
        
        if(rbPr.isSelected()){
            xxx = (tinggi - 100) * 1;
        }else if(rbLk.isSelected()){
            xxx = (tinggi - 104) * 1;
        }
        temp = xxx+"";
        
        if(xxx < berat){
            tvHasil.setText(temp);
            tvHasil1.setText("Maaf " + tbNama.getText() +", Sepertinya anda OverWeight : (");
            tvHasil2.setText("Perbanyak olahraga & hindari makan kolesterol");    
        }else if(xxx > berat){
            tvHasil.setText(temp);
            tvHasil1.setText("Maaf " + tbNama.getText() +", Sepertinya anda UnderWeight : (");
            tvHasil2.setText("Perbanyak makanan berkarbohidraat"); 
        }else{
            tvHasil.setText(temp);
            tvHasil1.setText("Selamat " + tbNama.getText() +", Sepertinya anda Ideal : (");
            tvHasil2.setText("Lanjutkan pola amakan teratur dan hidup sehat"); 
        }
    }
}

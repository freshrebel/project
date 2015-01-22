/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdesktop;

import Model.Cd;
import Model.Doos;
import Model.Nummer;

/**
 *
 * @author Arno
 */
public class FrmBekijkNummer extends javax.swing.JFrame
{
    
    public FrmBekijkNummer()
    {
        initComponents();
    }

    /**
     * Creates new form FrmBekijkNummer
     */
    public FrmBekijkNummer(Nummer nummer)
    {
        initComponents();
        
        txtArtiest.setText(nummer.getArtiest());
        
        txtBpm.setText("" + nummer.getBpm());
        if (!(nummer.getCd() == null))
        {
            Cd cd = nummer.getCd();
            Doos doos = cd.getDoos();
            txtCd.setText(cd.toString());
            txtDoos.setText(doos.toString());
        }
        
        txtGenres.setText(nummer.getGenres());
        txtLabels.setText(nummer.getLabels());
        txtMin.setText("" + nummer.getMinuten());
        txtSec.setText("" + nummer.getSeconden());
        txtTitel.setText(nummer.getTitel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        txtGenres = new javax.swing.JTextField();
        txtCd = new javax.swing.JTextField();
        lblLabels = new javax.swing.JLabel();
        txtLabels = new javax.swing.JTextField();
        lblTijd = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        lblMin = new javax.swing.JLabel();
        txtSec = new javax.swing.JTextField();
        lblSec = new javax.swing.JLabel();
        lblTitel = new javax.swing.JLabel();
        txtTitel = new javax.swing.JTextField();
        lblArtiest = new javax.swing.JLabel();
        txtArtiest = new javax.swing.JTextField();
        lblBpm = new javax.swing.JLabel();
        txtBpm = new javax.swing.JTextField();
        lblGenres = new javax.swing.JLabel();
        lblCd = new javax.swing.JLabel();
        lblDoos = new javax.swing.JLabel();
        txtDoos = new javax.swing.JTextField();
        btnSluit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtGenres.setEnabled(false);

        txtCd.setEnabled(false);

        lblLabels.setText("Labels: ");

        txtLabels.setEnabled(false);

        lblTijd.setText("Tijd: ");

        txtMin.setEnabled(false);

        lblMin.setText("min");

        txtSec.setEnabled(false);

        lblSec.setText("sec");

        lblTitel.setText("Titel: ");

        txtTitel.setEnabled(false);

        lblArtiest.setText("Artiest:");

        txtArtiest.setEnabled(false);

        lblBpm.setText("BPM: ");

        txtBpm.setEnabled(false);

        lblGenres.setText("Genres: ");

        lblCd.setText("Cd: ");

        lblDoos.setText("Doos: ");

        txtDoos.setEnabled(false);

        btnSluit.setText("Sluit");
        btnSluit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSluitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblArtiest)
                                    .addComponent(lblTitel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtArtiest)
                                    .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLabels)
                                            .addComponent(lblTijd)
                                            .addComponent(lblGenres))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBpm)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCd)
                                    .addComponent(txtBpm)
                                    .addComponent(txtGenres)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSec))
                                    .addComponent(txtLabels, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                                .addGap(1, 1, 1))
                            .addComponent(lblCd))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDoos)
                        .addGap(14, 14, 14)
                        .addComponent(txtDoos)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSluit)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitel)
                    .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArtiest)
                    .addComponent(txtArtiest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBpm)
                    .addComponent(txtBpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenres)
                    .addComponent(txtGenres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLabels)
                    .addComponent(txtLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTijd)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMin)
                    .addComponent(txtSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCd)
                    .addComponent(txtCd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoos)
                    .addComponent(txtDoos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSluit)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSluitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSluitActionPerformed
    {//GEN-HEADEREND:event_btnSluitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSluitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FrmBekijkNummer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FrmBekijkNummer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FrmBekijkNummer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FrmBekijkNummer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FrmBekijkNummer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSluit;
    private javax.swing.JLabel lblArtiest;
    private javax.swing.JLabel lblBpm;
    private javax.swing.JLabel lblCd;
    private javax.swing.JLabel lblDoos;
    private javax.swing.JLabel lblGenres;
    private javax.swing.JLabel lblLabels;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSec;
    private javax.swing.JLabel lblTijd;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JTextField txtArtiest;
    private javax.swing.JTextField txtBpm;
    private javax.swing.JTextField txtCd;
    private javax.swing.JTextField txtDoos;
    private javax.swing.JTextField txtGenres;
    private javax.swing.JTextField txtLabels;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtSec;
    private javax.swing.JTextField txtTitel;
    // End of variables declaration//GEN-END:variables
}

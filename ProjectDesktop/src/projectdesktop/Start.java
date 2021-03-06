/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdesktop;

import Model.Cd;
import Model.Nummer;
import Service.NummerService;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;

/**
 *
 * @author Arno
 */
public class Start extends javax.swing.JFrame
{

    List<Nummer> lijst;
    public static Cd cd;

    /**
     * Creates new form Start
     */
    public Start()
    {
        initComponents();
        lijst = NummerService.selectAll();
        lstNummers.setListData(lijst.toArray());
        cd = null;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstNummers = new javax.swing.JList();
        lblTitel = new javax.swing.JLabel();
        txtTitel = new javax.swing.JTextField();
        lblArtiest = new javax.swing.JLabel();
        txtArtiest = new javax.swing.JTextField();
        lblBpm = new javax.swing.JLabel();
        txtBpm = new javax.swing.JTextField();
        lblGenres = new javax.swing.JLabel();
        txtGenres = new javax.swing.JTextField();
        lblLabels = new javax.swing.JLabel();
        txtLabels = new javax.swing.JTextField();
        lblTijd = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        lblMin = new javax.swing.JLabel();
        txtSec = new javax.swing.JTextField();
        lblSec = new javax.swing.JLabel();
        btnBekijk = new javax.swing.JButton();
        btnZoek = new javax.swing.JButton();
        lblCd = new javax.swing.JLabel();
        txtCd = new javax.swing.JTextField();
        btnZoekCd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstNummers);

        lblTitel.setText("Titel: ");

        lblArtiest.setText("Artiest:");

        lblBpm.setText("BPM: ");

        lblGenres.setText("Genres: ");

        lblLabels.setText("Labels: ");

        lblTijd.setText("Tijd: ");

        lblMin.setText("min");

        lblSec.setText("sec");

        btnBekijk.setText("Bekijk");
        btnBekijk.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBekijkActionPerformed(evt);
            }
        });

        btnZoek.setText("Zoek");
        btnZoek.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnZoekActionPerformed(evt);
            }
        });

        lblCd.setText("Cd: ");

        txtCd.setEnabled(false);

        btnZoekCd.setText("zoekCd");
        btnZoekCd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnZoekCdActionPerformed(evt);
            }
        });

        btnReset.setText("reset");
        btnReset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBekijk)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArtiest)
                            .addComponent(lblTitel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtArtiest, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(txtTitel)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBpm, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addComponent(txtGenres)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSec))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(126, 126, 126)
                                    .addComponent(btnReset))
                                .addComponent(txtLabels))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnZoekCd))
                            .addComponent(btnZoek)))
                    .addComponent(lblCd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(txtCd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnZoekCd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnZoek)
                        .addGap(18, 18, 18)
                        .addComponent(btnBekijk))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZoekActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnZoekActionPerformed
    {//GEN-HEADEREND:event_btnZoekActionPerformed
        String titel = txtTitel.getText();
        String artiest = txtArtiest.getText();
        int min;
        if (txtMin.getText().equals(""))
        {
            min = 0;
        }
        else
        {
            min = Integer.parseInt(txtMin.getText());
        }

        int sec;
        if (txtSec.getText().equals(""))
        {
            sec = 0;
        }
        else
        {
            sec = Integer.parseInt(txtSec.getText());
        }

        int bpm;
        if (txtBpm.getText().equals(""))
        {
            bpm = 0;
        }
        else
        {
            bpm = Integer.parseInt(txtBpm.getText());
        }

        String genres = txtGenres.getText();
        String labels = txtLabels.getText();
        lijst = NummerService.selectWhere(titel, artiest, min, sec, bpm, genres, labels, cd);
        lstNummers.setListData(lijst.toArray());
    }//GEN-LAST:event_btnZoekActionPerformed

    private void btnZoekCdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnZoekCdActionPerformed
    {//GEN-HEADEREND:event_btnZoekCdActionPerformed
        FrmZoekCd frm = new FrmZoekCd();
        WindowListener listener = new WindowAdapter()
        {
            @Override
            public void windowClosed(WindowEvent w)
            {
                txtCd.setText(cd.toString());
            }
        };
        frm.addWindowListener(listener);
        frm.setVisible(true);
    }//GEN-LAST:event_btnZoekCdActionPerformed

    private void btnBekijkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBekijkActionPerformed
    {//GEN-HEADEREND:event_btnBekijkActionPerformed
        Nummer nummer = (Nummer) lstNummers.getSelectedValue();
        FrmBekijkNummer frm = new FrmBekijkNummer(nummer);              
        
        frm.setVisible(true);
    }//GEN-LAST:event_btnBekijkActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnResetActionPerformed
    {//GEN-HEADEREND:event_btnResetActionPerformed
        cd = null;
        txtCd.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBekijk;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnZoek;
    private javax.swing.JButton btnZoekCd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArtiest;
    private javax.swing.JLabel lblBpm;
    private javax.swing.JLabel lblCd;
    private javax.swing.JLabel lblGenres;
    private javax.swing.JLabel lblLabels;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSec;
    private javax.swing.JLabel lblTijd;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JList lstNummers;
    private javax.swing.JTextField txtArtiest;
    private javax.swing.JTextField txtBpm;
    private javax.swing.JTextField txtCd;
    private javax.swing.JTextField txtGenres;
    private javax.swing.JTextField txtLabels;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtSec;
    private javax.swing.JTextField txtTitel;
    // End of variables declaration//GEN-END:variables
}

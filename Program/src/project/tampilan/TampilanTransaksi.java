/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.tampilan;

import project.aksi.AksiTransaksi;
import project.input.InputTransaksi;
import project.data.Transaksi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fadhila
 */
public class TampilanTransaksi extends javax.swing.JFrame {
    List<Transaksi> record = new ArrayList<Transaksi>();
    AksiTransaksi trServis;
    int row;

    /**
     * Creates new form TampilanTransaksi
     */
    public TampilanTransaksi() {
        initComponents();
        trServis = new InputTransaksi();
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                row = jTable1.getSelectedRow();
                if (row != -1) {
                    isiText();
                }
            }
        });
        this.statusAwal();
    }

    void loadData() {
        try {
            record = trServis.getAll();
        } catch (SQLException ex) {
            Logger.getLogger(TampilanTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void isiTabel() {
        Object data[][] = new Object[record.size()][3];
        int x = 0;
        for (Transaksi tr : record) {
            data[x][0] = tr.getKode();
            data[x][1] = tr.getMerk();
            data[x][2] = tr.getStatus();
            x++;
        }
        String judul[] = { "Kode Transaksi", "Merk", "Status" };
        jTable1.setModel(new DefaultTableModel(data, judul));
        jScrollPane1.setViewportView(jTable1);
    }

    void isiText() {
        Transaksi tr = record.get(row);
        txtKode.setText(tr.getKode());
        txtMerk.setText(tr.getMerk());
        txtStatus.setText(tr.getStatus());
    }

    void kosongkanText() {
        txtKode.setText("");
        txtMerk.setText("");
        txtStatus.setText("");
        txtKode.requestFocus();
    }

    void statusAwal() {
        kosongkanText();
        loadData();
        isiTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbKode = new javax.swing.JLabel();
        lbMerk = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtMerk = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tampilan Transaksi");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbKode.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbKode.setText("Kode Transaksi");

        lbMerk.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbMerk.setText("Merk");

        lbStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbStatus.setText("Status");

        txtKode.setBackground(new java.awt.Color(240, 229, 173));
        txtKode.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        txtMerk.setBackground(new java.awt.Color(240, 229, 173));
        txtMerk.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        txtStatus.setBackground(new java.awt.Color(240, 229, 173));
        txtStatus.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jTable1.setBackground(new java.awt.Color(240, 229, 173));
        jTable1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTable1.setModel(
                new javax.swing.table.DefaultTableModel(
                        new Object[][] { { null, null, null, null }, { null, null, null, null },
                                { null, null, null, null }, { null, null, null, null } },
                        new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        jTable1.setSelectionBackground(new java.awt.Color(187, 252, 126));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        simpan.setBackground(new java.awt.Color(223, 252, 174));
        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/save.png"))); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        batal.setBackground(new java.awt.Color(223, 252, 174));
        batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/cancel.png"))); // NOI18N
        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(223, 252, 174));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/update.png"))); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(223, 252, 174));
        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/delete.png"))); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel1.setText("Created by Universitas Buana Perjuangan Karawang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(70, 70, 70).addComponent(simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(batal))
                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(56, 56, 56)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout
                                                .createSequentialGroup().addComponent(edit)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hapus))
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout
                                                        .createSequentialGroup().addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(lbKode).addComponent(lbMerk)
                                                                .addComponent(lbStatus))
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(txtMerk,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 171,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(txtKode).addComponent(txtStatus)))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 580,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(66, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbKode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbMerk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(batal).addComponent(simpan))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hapus).addComponent(edit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                javax.swing.GroupLayout.PREFERRED_SIZE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_simpanActionPerformed
        try {
            // TODO add your handling code here:
            Transaksi t = new Transaksi();
            t.setKode(txtKode.getText());
            t.setMerk(txtMerk.getText());
            t.setStatus(txtStatus.getText());
            trServis.insert(t);
            this.statusAwal();
            JOptionPane.showMessageDialog(this, "Data Tersimpan");
        } catch (SQLException ex) {
            Logger.getLogger(TampilanTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_simpanActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editActionPerformed
        try {
            // TODO add your handling code here:
            Transaksi t = new Transaksi();
            t.setKode(txtKode.getText());
            t.setMerk(txtMerk.getText());
            t.setStatus(txtStatus.getText());
            trServis.update(t);
            this.statusAwal();
            JOptionPane.showMessageDialog(this, "Data telah diubah");
        } catch (SQLException ex) {
            Logger.getLogger(TampilanTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_hapusActionPerformed
        try {
            // TODO add your handling code here:
            String Kode = txtKode.getText();
            trServis.delete(Kode);
            this.statusAwal();
            JOptionPane.showMessageDialog(this, "data berhasil dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(TampilanTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_hapusActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        txtKode.setText(null);
        txtMerk.setText(null);
        txtStatus.setText(null);
        txtKode.requestFocus();
    }// GEN-LAST:event_batalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TampilanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbKode;
    private javax.swing.JLabel lbMerk;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtMerk;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}

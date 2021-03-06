/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author ACER
 */
public class barangUser extends javax.swing.JFrame {
 PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form barangUser
     */
    public barangUser() {
        initComponents();
        fetchData();
    }
    public ArrayList<BarangList> barangList() {
        ArrayList<BarangList> barangList = new ArrayList<>();
        try {//SELECT REPLACE(worker.isAcc,'1','Diterima') from worker
            Connection con = koneksi.getKoneksi();
            String sql = "SELECT * FROM `barang`";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            BarangList barang;
            while (rs.next()) {
                barang = new BarangList(rs.getInt("id_barang"), rs.getInt("harga"), rs.getInt("stok"), rs.getString("nama_barang"), rs.getString("jenis"));
                barangList.add(barang);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return barangList;
    }
private void fetchData() {
        ArrayList<BarangList> list = barangList();
        DefaultTableModel model = (DefaultTableModel) dataBarang.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getId_barang();
            row[1] = list.get(i).getNama_barang();
            row[2] = list.get(i).getJenis_barang();
            row[3] = list.get(i).getHarga();
            row[4] = list.get(i).getStok();

            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataBarang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NamabarangTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JenisbarangTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        HargaTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        StokTxt = new javax.swing.JTextField();
        tambahBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        dataBarang.setForeground(new java.awt.Color(0, 0, 0));
        dataBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_barang", "Merk Sepatu", "Jenis Sepatu", "Harga", "Stok"
            }
        ));
        dataBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataBarang);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Merk Sepatu :");

        NamabarangTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Stok :");

        JenisbarangTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Jenis Sepatu :");

        HargaTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Harga :");

        StokTxt.setForeground(new java.awt.Color(0, 0, 0));

        tambahBtn.setForeground(new java.awt.Color(0, 0, 0));
        tambahBtn.setText("Tambah Barang");
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Data Sepatu ");

        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton4)
                .addGap(95, 95, 95)
                .addComponent(tambahBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(41, 41, 41)
                .addComponent(jButton3)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(326, 326, 326))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(67, 67, 67)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JenisbarangTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(NamabarangTxt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StokTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(HargaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                .addGap(61, 61, 61)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NamabarangTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JenisbarangTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(HargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(StokTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(tambahBtn)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataBarangMouseClicked
        // TODO add your handling code here:
        int i = dataBarang.getSelectedRow();
        TableModel model = dataBarang.getModel();
        NamabarangTxt.setText(model.getValueAt(i, 1).toString());
        JenisbarangTxt.setText(model.getValueAt(i, 2).toString());
        HargaTxt.setText(model.getValueAt(i, 3).toString());
        StokTxt.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_dataBarangMouseClicked

    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        // TODO add your handling code here:
        try {

            Connection con = koneksi.getKoneksi();
            //query insert data ke dalam database mysql
            pst = con.prepareStatement("INSERT INTO barang (nama_barang, jenis, harga, stok) VALUES(?,?,?,?)");
            //validasi ketika textField kosong

            if (NamabarangTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama Barang tidak boleh kosong");
            } else if (JenisbarangTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Jenis barang tidak boleh kosong");
            } else if (HargaTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harga tidak boleh kosong");
            } else if (StokTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Stok tidak boleh kosong");
            } else {
                //digunakan untuk memasukkan data ke masing2 variabel textfield seperti namaTxt, dll

                //misal bingung pst sama rs bisa diliat di variabel diatas
                pst.setString(1, NamabarangTxt.getText());
                pst.setString(2, JenisbarangTxt.getText());
                pst.setString(3, HargaTxt.getText());
                pst.setString(4, StokTxt.getText());
                pst.executeUpdate();

                //setelah nginput data kasih ini biar textfieldnya kosong lagi
                NamabarangTxt.setText("");
                JenisbarangTxt.setText("");
                HargaTxt.setText("");
                StokTxt.setText("");

                //setelah daftar muncul pop up dafatar berhasil dan akan tampil frame baru
                JOptionPane.showMessageDialog(null, "Barang berhasil ditambah");
                this.dispose();
                barang dashboard = new barang();
                dashboard.setVisible(true);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());

        }
    }//GEN-LAST:event_tambahBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {

            Connection con = koneksi.getKoneksi();
            int row = dataBarang.getSelectedRow();
            String value = (dataBarang.getModel().getValueAt(row, 0).toString());
            String sql = "UPDATE barang SET nama_barang =? , jenis =? , harga =? , stok=? WHERE id_barang=" + value;
            if (NamabarangTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama Sepatu tidak boleh kosong");
            } else if (JenisbarangTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Jenis sepatu tidak boleh kosong");
            } else if (HargaTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harga tidak boleh kosong");
            } else if (StokTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Stok tidak boleh kosong");
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, NamabarangTxt.getText());
                pst.setString(2, JenisbarangTxt.getText());
                pst.setString(3, HargaTxt.getText());
                pst.setString(4, StokTxt.getText());
                pst.executeUpdate();

                DefaultTableModel model = (DefaultTableModel) dataBarang.getModel();
                model.setRowCount(0);
                fetchData();
                NamabarangTxt.setText("");
                JenisbarangTxt.setText("");
                HargaTxt.setText("");
                StokTxt.setText("");
                JOptionPane.showMessageDialog(null, "Update Selesai");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            int pilihan = JOptionPane.showConfirmDialog(this, " Apakah anda yakin akan menghapus data ini ?", "Konfirmasi", JOptionPane.WARNING_MESSAGE);
            if (pilihan == JOptionPane.YES_OPTION) {
                Connection con = koneksi.getKoneksi();
                int row = dataBarang.getSelectedRow();
                String value = (dataBarang.getModel().getValueAt(row, 0).toString());
                String sql = "DELETE FROM barang WHERE id_barang=" + value;
                pst = con.prepareStatement(sql);
                pst.executeUpdate();
                NamabarangTxt.setText("");
                JenisbarangTxt.setText("");
                HargaTxt.setText("");
                StokTxt.setText("");
                DefaultTableModel model = (DefaultTableModel) dataBarang.getModel();
                model.setRowCount(0);
                fetchData();
                JOptionPane.showMessageDialog(rootPane, "Data Dihapus");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Pilih Baris Dulu");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        NamabarangTxt.setText("");
        JenisbarangTxt.setText("");
        HargaTxt.setText("");
        StokTxt.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login login = new login();
        Logout.logOut(this, login);
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(barangUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barangUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barangUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barangUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barangUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HargaTxt;
    private javax.swing.JTextField JenisbarangTxt;
    private javax.swing.JTextField NamabarangTxt;
    private javax.swing.JTextField StokTxt;
    private javax.swing.JTable dataBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tambahBtn;
    // End of variables declaration//GEN-END:variables
}

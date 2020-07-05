/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Panel;

import Controller.Provider.Control_providerList;
import View.Dialog.Provider.inputProvider;
import View.Dialog.Provider.updateProvider;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author MohamadEsa
 */
public class providerPanel extends javax.swing.JPanel {

  /**
   * Creates new form userPanel
   */
  Control_providerList c;
  public updateProvider ubah = null;
  
  public providerPanel() {
    initComponents();
    c = new Control_providerList(this);
    refresh();
  }

  public void refresh() {
    c.isiTable();
    
    btnAdd.setEnabled(true);
    btnDelete.setEnabled(false);
    btnEdit.setEnabled(false);
  }
  
  public JTable getTabelDataProvider() {
    return tabelDataProvider;
  }

  public JTextField getTxtCari() {
    return txtCari;
  }
  
  

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel5 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jPanel1 = new javax.swing.JPanel();
    btnAdd = new javax.swing.JButton();
    btnEdit = new javax.swing.JButton();
    btnDelete = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabelDataProvider = new javax.swing.JTable();
    txtCari = new javax.swing.JTextField();
    jButton4 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();

    setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

    jPanel5.setBackground(new java.awt.Color(99, 170, 227));

    jPanel3.setBackground(new java.awt.Color(181, 215, 242));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setOpaque(false);
    jPanel1.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

    btnAdd.setBackground(new java.awt.Color(0, 123, 255));
    btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/add.png"))); // NOI18N
    btnAdd.setPreferredSize(new java.awt.Dimension(75, 25));
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });
    jPanel1.add(btnAdd);

    btnEdit.setBackground(new java.awt.Color(255, 193, 7));
    btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/edit.png"))); // NOI18N
    btnEdit.setPreferredSize(new java.awt.Dimension(75, 25));
    btnEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditActionPerformed(evt);
      }
    });
    jPanel1.add(btnEdit);

    btnDelete.setBackground(new java.awt.Color(220, 53, 69));
    btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/delete.png"))); // NOI18N
    btnDelete.setPreferredSize(new java.awt.Dimension(75, 25));
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteActionPerformed(evt);
      }
    });
    jPanel1.add(btnDelete);

    tabelDataProvider.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    tabelDataProvider.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tabelDataProviderMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tabelDataProvider);

    txtCari.setPreferredSize(new java.awt.Dimension(6, 25));

    jButton4.setBackground(new java.awt.Color(0, 0, 0));
    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search.png"))); // NOI18N
    jButton4.setPreferredSize(new java.awt.Dimension(75, 25));
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtCari, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        .addContainerGap())
    );

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setText("KELOLA PROVIDER");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(684, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    add(jPanel5);
  }// </editor-fold>//GEN-END:initComponents

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    if(txtCari.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(null, "Pencarian Belum Ditentukan","Perhatian",JOptionPane.WARNING_MESSAGE);
    } else{
      c.search(this);
    }
  }//GEN-LAST:event_jButton4ActionPerformed

  private void tabelDataProviderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataProviderMouseClicked
    int tableData = tabelDataProvider.getSelectedRow();
    ubah = new updateProvider(this);
    
    ubah.id = tabelDataProvider.getValueAt(tableData, 0).toString();
    ubah.kategori = tabelDataProvider.getValueAt(tableData, 1).toString();
    ubah.nama = tabelDataProvider.getValueAt(tableData, 2).toString();
    ubah.dipilih();
    
    btnAdd.setEnabled(false);
    btnDelete.setEnabled(true);
    btnEdit.setEnabled(true);
  }//GEN-LAST:event_tabelDataProviderMouseClicked

  private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    if(tabelDataProvider.getSelectedRow()>=0){
      ubah.setVisible(true);
      refresh();
    } else{
      JOptionPane.showMessageDialog(this, "Pilih Data yang akan Diubah","Peringatan",JOptionPane.WARNING_MESSAGE);
    }
    
  }//GEN-LAST:event_btnEditActionPerformed

  private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    if(tabelDataProvider.getSelectedRow()>=0){
            int dialog = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data ini?","Konfirmasi", JOptionPane.WARNING_MESSAGE);
            if(dialog == JOptionPane.YES_OPTION){
                String id = tabelDataProvider.getValueAt(tabelDataProvider.getSelectedRow(), 0).toString();
                c.delete(id);
                refresh();
            }
        } else{
            JOptionPane.showMessageDialog(this, "Pilih Data yang akan Dihapus","Peringatan",JOptionPane.WARNING_MESSAGE);
        }
    
  }//GEN-LAST:event_btnDeleteActionPerformed

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    new inputProvider(this).setVisible(true);
    btnAdd.setEnabled(true);
    btnDelete.setEnabled(false);
    btnEdit.setEnabled(false);
  }//GEN-LAST:event_btnAddActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdd;
  private javax.swing.JButton btnDelete;
  private javax.swing.JButton btnEdit;
  private javax.swing.JButton jButton4;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tabelDataProvider;
  private javax.swing.JTextField txtCari;
  // End of variables declaration//GEN-END:variables

  
}

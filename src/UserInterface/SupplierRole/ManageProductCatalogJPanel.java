/*
 * ManageProductCatalogJPanel.java
 *
 * Created on September 24, 2008, 2:40 PM
 */
package UserInterface.SupplierRole;

import Business.Supplier.MedicalDevice;
import Business.Supplier.Supplier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Rushabh
 */
public class ManageProductCatalogJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Supplier supplier;  
    /** Creates new form ManageProductCatalogJPanel */
    public ManageProductCatalogJPanel(JPanel upc, Supplier s) {
        initComponents();
        userProcessContainer = upc;
        supplier = s;
        sNameTextField.setText(supplier.getSupplyName());
        refreshTable();
    }
    
    private void refreshTable() {
        int rowCount = productCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)productCatalog.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(MedicalDevice md : supplier.getProductCatalog().getProductCatalog()) {
            Object row[] = new Object[6];
            row[0] = md;
            row[1] = md.getDeviceID();
            row[2] = md.getDeviceType();
            row[3] = md.getPurchaseCost();
            row[4] = md.getAvailability();
            row[5] = md.getManufactureDate();
            model.addRow(row);
            }
        }

    
 

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productCatalog = new javax.swing.JTable();
        viewPButton = new javax.swing.JButton();
        createPButton = new javax.swing.JButton();
        backButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sNameTextField = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();
        delButton5 = new javax.swing.JButton();
        updatePButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Medical Device Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        productCatalog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Device Name", "ID", "Type", "Price", "Stock Availability", "Manufacture Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productCatalog);
        if (productCatalog.getColumnModel().getColumnCount() > 0) {
            productCatalog.getColumnModel().getColumn(0).setResizable(false);
            productCatalog.getColumnModel().getColumn(1).setResizable(false);
            productCatalog.getColumnModel().getColumn(2).setResizable(false);
            productCatalog.getColumnModel().getColumn(3).setResizable(false);
            productCatalog.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 610, 160));

        viewPButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewPButton.setText("View Product Detail >>");
        viewPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPButtonActionPerformed(evt);
            }
        });
        add(viewPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 220, -1));

        createPButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createPButton.setText("Create New Product >>");
        createPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPButtonActionPerformed(evt);
            }
        });
        add(createPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        backButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });
        add(backButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 170, -1));

        sNameTextField.setEditable(false);
        sNameTextField.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        sNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sNameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        add(sNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 150, 30));

        refreshButton.setText("Refresh");
        refreshButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        refreshButton.setMargin(new java.awt.Insets(2, 1, 2, 1));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, -1));

        delButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delButton5.setText("Delete Product(s)");
        delButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButton5ActionPerformed(evt);
            }
        });
        add(delButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 190, -1));

        updatePButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatePButton1.setText("Update >>");
        updatePButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePButton1ActionPerformed(evt);
            }
        });
        add(updatePButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 220, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void viewPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPButtonActionPerformed
        // TODO add your handling code here:
        int row = productCatalog.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "please select a product from product table");
            return;
        }
        
        MedicalDevice md = (MedicalDevice)productCatalog.getValueAt(row, 0);
        
        ViewProductDetailJPanel vpdjp = new ViewProductDetailJPanel(userProcessContainer, md);
        userProcessContainer.add("ViewProductDetailJPanelSupplier", vpdjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPButtonActionPerformed

    private void createPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPButtonActionPerformed
        CreateNewProductJPanel cnpjp = new CreateNewProductJPanel(userProcessContainer, supplier);
        userProcessContainer.add("SupplierWorkAreaJPanel",cnpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPButtonActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton4ActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        refreshTable();
}//GEN-LAST:event_refreshButtonActionPerformed

    private void delButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButton5ActionPerformed

        int row = productCatalog.getSelectedRow();
        if(row<0) {
            return;
        }
         MedicalDevice md1 = (MedicalDevice)productCatalog.getValueAt(row, 0);
        supplier.getProductCatalog().removeProduct(md1);
        JOptionPane.showMessageDialog(null, "Device Removed");
        refreshTable();
    }//GEN-LAST:event_delButton5ActionPerformed

    private void updatePButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePButton1ActionPerformed
         int row = productCatalog.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "please select a product from product table");
            return;
        }
        
        MedicalDevice md1 = (MedicalDevice)productCatalog.getValueAt(row, 0);
        
        updateDeviceJPanel cnpjp = new updateDeviceJPanel(userProcessContainer, supplier, md1);
        userProcessContainer.add("SupplierWorkAreaJPanel",cnpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updatePButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton4;
    private javax.swing.JButton createPButton;
    private javax.swing.JButton delButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productCatalog;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField sNameTextField;
    private javax.swing.JButton updatePButton1;
    private javax.swing.JButton viewPButton;
    // End of variables declaration//GEN-END:variables
}
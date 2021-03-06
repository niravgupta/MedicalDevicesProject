/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PHSlManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nirav gupta
 */
public class ViewOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrdersJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise; 
    Organization organization; 
    EcoSystem system; 

    
    public ViewOrdersJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.enterprise=enterprise;
        this.organization=organization;

        populateOrderTable();
    }

     public void populateOrderTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) orderjTable1.getModel();
        dtm.setRowCount(0);
        
        
        for (Order order2 : enterprise.getMasterOrderCatalog().getMasterOrderCatalog()){
            for (OrderItem oi : order2.getOrder()){
        
                                Object[] row = new Object[9];
                                row[0] = order2;
                                row[1] = oi.getMedicalDevice().getDeviceType();
                                row[2] = oi.getMedicalDevice().getModelNumber();
                                row[3] = oi.getMedicalDevice().getDeviceID();
                                row[4] = oi.getMedicalDevice().getManufactureDate();
                                row[5] = oi.getMedicalDevice().getAvailability();
                                row[6] = oi.getQuantity();
                                row[7] = oi.getMedicalDevice().getManufacturerName();
                                row[8] = oi.getMedicalDevice().getPurchaseCost() * oi.getQuantity();
                                dtm.addRow(row);
                                
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        orderjTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backjButton4 = new javax.swing.JButton();

        orderjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Device Name", "Type", "Model No", "ID", "Manufacture Date", "Quantity", "Supplier", "Order Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderjTable1);
        if (orderjTable1.getColumnModel().getColumnCount() > 0) {
            orderjTable1.getColumnModel().getColumn(0).setResizable(false);
            orderjTable1.getColumnModel().getColumn(1).setResizable(false);
            orderjTable1.getColumnModel().getColumn(2).setResizable(false);
            orderjTable1.getColumnModel().getColumn(3).setResizable(false);
            orderjTable1.getColumnModel().getColumn(4).setResizable(false);
            orderjTable1.getColumnModel().getColumn(5).setResizable(false);
            orderjTable1.getColumnModel().getColumn(6).setResizable(false);
            orderjTable1.getColumnModel().getColumn(7).setResizable(false);
            orderjTable1.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("VIEW ORDERS");

        backjButton4.setText("<<Back");
        backjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backjButton4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(backjButton4)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderjTable1;
    // End of variables declaration//GEN-END:variables
}

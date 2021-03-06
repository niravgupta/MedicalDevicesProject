/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.WareHouseManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CareTeamOrganization;
import Business.Organization.Organization;
import Business.Organization.WarehouseOrganization;
import Business.Schedule.DeviceBookingHistory;
import Business.Supplier.MedicalDevice;
import Business.WorkQueue.SurgeryOperationWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nirav gupta
 */
public class ViewDeviceProblemsHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDeviceProblemsHistoryJPanel
     */
        JPanel userProcessContainer; Enterprise enterprise; Organization organization; EcoSystem system;
    
    public ViewDeviceProblemsHistoryJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.enterprise=enterprise;
        this.organization=organization;
        populateDeviceTable();
    }

    
    public void populateDeviceTable(){
       
    DefaultTableModel dtm = (DefaultTableModel) devicejTable1.getModel();
    dtm.setRowCount(0);
        
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise2 : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (!enterprise2.getEnterpriseType().getValue().equalsIgnoreCase("Supplier")) {
                    for (Organization o : enterprise2.getOrganizationDirectory().getOrganizationList()) {
                        if (o.getName().equalsIgnoreCase("Warehouse Organization")) {
                            WarehouseOrganization whOrg = (WarehouseOrganization) o;
                            for (MedicalDevice md : whOrg.getMedicalDeviceCatalog().getProductCatalog()) {
                                Object[] row = new Object[6];
                                row[0] = md;
                                row[1] = md.getDeviceType();
                                row[2] = md.getCurrentLocation();
                                row[3] = md.getDeviceStatus();
                                row[4] = md.getDeviceUsageCount();
                                row[5] = md.getFailureCount();
                                dtm.addRow(row);
                            }
                        }
                        if (o.getName().equalsIgnoreCase("Care Team Organization")) {
                            CareTeamOrganization ctOrg = (CareTeamOrganization) o;
                            for (MedicalDevice md : ctOrg.getMedicalDeviceCatalog().getProductCatalog()) {
                                Object[] row = new Object[6];
                                row[0] = md;
                                row[1] = md.getDeviceType();
                                row[2] = md.getCurrentLocation();
                                row[3] = md.getDeviceStatus();
                                row[4] = md.getDeviceUsageCount();
                                row[5] = md.getFailureCount();
                                dtm.addRow(row);
                            }
                        }
                    }
                }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        devicejTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewProblemListjButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        failureReasonjTable1 = new javax.swing.JTable();
        backjButton4 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        devicejTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Device Name", "Type", "Current Location", "Device Status", "Usage Count", "Failure Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(devicejTable1);

        jLabel2.setText("VIEW DEVICE PROBLEM HISTORY");

        viewProblemListjButton1.setBackground(new java.awt.Color(102, 255, 204));
        viewProblemListjButton1.setText("View Problems List");
        viewProblemListjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProblemListjButton1ActionPerformed(evt);
            }
        });

        failureReasonjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fail Status", "Failure Reason", "Failure Location", "Failed Date", "Failure fixed Status", "Fix Comment"
            }
        ));
        jScrollPane2.setViewportView(failureReasonjTable1);

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
                        .addGap(238, 238, 238)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(viewProblemListjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(backjButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(viewProblemListjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(backjButton4)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewProblemListjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProblemListjButton1ActionPerformed
   
        int selectedDevice = devicejTable1.getSelectedRow();
        
        if ( selectedDevice < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from both request and device table");
            return;
        }
        
        MedicalDevice device = (MedicalDevice) devicejTable1.getValueAt(selectedDevice, 0);
        
        DefaultTableModel dtm = (DefaultTableModel) failureReasonjTable1.getModel();
        dtm.setRowCount(0);
                if (device.getBookingHistorylist()!=null){
                    for (DeviceBookingHistory dbh : device.getBookingHistorylist()) {
                                Object[] row = new Object[6];
                                row[0] = dbh.isFailureStatusValue();
                                row[1] = dbh.getFailureStatusReason();
                                row[2] = dbh.getPreviousBookingEnterprise();
                                row[3] = dbh.getPreviousScheduledBookingDate();
                                row[4] = dbh.isFailureFixedValue();
                                row[5] = dbh.getFailureFixedMessage();
                                dtm.addRow(row);
                            }
                }
    }//GEN-LAST:event_viewProblemListjButton1ActionPerformed

    private void backjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton4;
    private javax.swing.JTable devicejTable1;
    private javax.swing.JTable failureReasonjTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton viewProblemListjButton1;
    // End of variables declaration//GEN-END:variables
}

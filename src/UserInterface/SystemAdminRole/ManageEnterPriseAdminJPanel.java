/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SystemAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PHSorganization;
import Business.Organization.SupplierOrganization;
import Business.Organization.WarehouseOrganization;
import Business.Role.HospitalAdminRole;
import Business.Role.PHSmanagerRole;
import Business.Role.SupplierRole;
import Business.Role.WareHouseManagerRole;
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nirav gupta
 */
public class ManageEnterPriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterPriseAdminJPanel
     */
     JPanel userProcessContainer; EcoSystem system;
    public ManageEnterPriseAdminJPanel( JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        populateUserTable();
        populateComboBox();
    }

    public void populateUserTable(){
        DefaultTableModel dtm = (DefaultTableModel) userTablejTable1.getModel();
        dtm.setRowCount(0);
        
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {

                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();
                    dtm.addRow(row);
                }
            }
        }

    }
    
    public void populateComboBox(){
        networkjComboBox1.removeAllItems();
         for (Network network : system.getNetworkList()) {
             networkjComboBox1.addItem(network);
         }
        
        
    }
    
    
    public void populateEnterPrise(Network network){
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
        enterpriseTypejComboBox1.addItem(enterprise);
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
        enterpriseTypejComboBox1 = new javax.swing.JComboBox();
        CREATEjButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTablejTable1 = new javax.swing.JTable();
        networkjComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userNamejTextField1 = new javax.swing.JTextField();
        passwordjTextField2 = new javax.swing.JTextField();
        namejTextField3 = new javax.swing.JTextField();
        backjButton2 = new javax.swing.JButton();

        jLabel1.setText("NETWORK");

        enterpriseTypejComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypejComboBox1ActionPerformed(evt);
            }
        });

        CREATEjButton1.setText("CREATE");
        CREATEjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREATEjButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("ENTERPRISE TYPE");

        userTablejTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTablejTable1);

        networkjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkjComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("username");

        jLabel5.setText("password");

        jLabel6.setText("name");

        backjButton2.setText("<<Back");
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(backjButton2)
                        .addGap(125, 125, 125)
                        .addComponent(CREATEjButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(networkjComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(enterpriseTypejComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(userNamejTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordjTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(enterpriseTypejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(namejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CREATEjButton1)
                    .addComponent(backjButton2))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterpriseTypejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypejComboBox1ActionPerformed
       
    }//GEN-LAST:event_enterpriseTypejComboBox1ActionPerformed

    private void CREATEjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEjButton1ActionPerformed
        Enterprise enterprise = (Enterprise) enterpriseTypejComboBox1.getSelectedItem();
        
        String UserName = userNamejTextField1.getText();
        String password = passwordjTextField2.getText();
        String name = namejTextField3.getText();
        
        if(userNamejTextField1.getText().isEmpty()==true || userNamejTextField1.getText().startsWith(" ")) {
            JOptionPane.showMessageDialog(null, "Please enter valid text in username field");
            return;
        }
        
        if(passwordjTextField2.getText().isEmpty()==true || passwordjTextField2.getText().startsWith(" ")) {
            JOptionPane.showMessageDialog(null, "Please enter valid text in password field");
            return;
        }
        
        if(namejTextField3.getText().isEmpty()==true || namejTextField3.getText().startsWith(" ")) {
            JOptionPane.showMessageDialog(null, "Please enter valid text in Name field");
            return;
        }
        
//        boolean result = enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(UserName);
//        
//        if (result == false){
//            JOptionPane.showMessageDialog(null, "Username already exixsts. Please input different username!!!");
//            return;
//        }
        
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : e.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equalsIgnoreCase(UserName)) {
                        JOptionPane.showMessageDialog(null, "Same Username exists !! Please enter different username!!");
                        return;
                    }
                }
            }
        }
        
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        
        
       if (enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Supplier")){
           
           UserAccount userAccount2 = enterprise.getUserAccountDirectory().createUserAccount(UserName, password, employee, new SupplierRole());
           SupplierOrganization supOrg = (SupplierOrganization) enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
           Supplier supplier = supOrg.addSupplierInSupplierDir();
           supplier.setSupplyName(name);
           supplier.setUsername(UserName);
           supplier.setPassword(password);
           supplier.setRole(new SupplierRole());
           supplier.setEnrollmentStatus(Supplier.enrollmentStatusType.PENDING.getValue());
           
       }else if (enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Hospital")){
           UserAccount userAccount = enterprise.getUserAccountDirectory().createUserAccount(UserName, password, employee, new HospitalAdminRole());
           
       } else if (enterprise.getEnterpriseType().getValue().equalsIgnoreCase("WareHouse")){
           WarehouseOrganization warehouseOrganization = (WarehouseOrganization) enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Warehouse);
           UserAccount userAccount3 = enterprise.getUserAccountDirectory().createUserAccount(UserName, password, employee, new WareHouseManagerRole());
           
       }else if (enterprise.getEnterpriseType().getValue().equalsIgnoreCase("PHSenterprise")){
           PHSorganization warehouseOrganization = (PHSorganization) enterprise.getOrganizationDirectory().createOrganization(Organization.Type.PHSorganization);
           UserAccount userAccount4 = enterprise.getUserAccountDirectory().createUserAccount(UserName, password, employee, new PHSmanagerRole());
           
       }
        
        JOptionPane.showMessageDialog(null, "User Account created");
        populateUserTable();
    }//GEN-LAST:event_CREATEjButton1ActionPerformed

    private void networkjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkjComboBox1ActionPerformed
        enterpriseTypejComboBox1.removeAllItems();
        
        Network network = (Network) networkjComboBox1.getSelectedItem();
        
        if (network != null){
            populateEnterPrise(network);
    }
        
    }//GEN-LAST:event_networkjComboBox1ActionPerformed

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CREATEjButton1;
    private javax.swing.JButton backjButton2;
    private javax.swing.JComboBox enterpriseTypejComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namejTextField3;
    private javax.swing.JComboBox networkjComboBox1;
    private javax.swing.JTextField passwordjTextField2;
    private javax.swing.JTextField userNamejTextField1;
    private javax.swing.JTable userTablejTable1;
    // End of variables declaration//GEN-END:variables
}

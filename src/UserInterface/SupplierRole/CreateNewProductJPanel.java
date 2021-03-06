/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */
package UserInterface.SupplierRole;


import Business.Supplier.MedicalDevice;
import Business.Supplier.MedicalDevice.deviceType;
import Business.Supplier.Supplier;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Rushabh
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    Supplier supplier;
    JPanel userProcessContainer;
    
    /** Creates new form CreateProductJPanel */
    public CreateNewProductJPanel(JPanel userProcessContainer, Supplier supplier){
        initComponents();
        this.supplier = supplier;
        this.userProcessContainer = userProcessContainer; 
        populateTypeComboBox();
    }

    public void populateTypeComboBox() {
        deviceTypejComboBox1.removeAllItems();
       for(deviceType type : MedicalDevice.deviceType.values()) {
           deviceTypejComboBox1.addItem(type);
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
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        availabilityjLabel3 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        priceField1 = new javax.swing.JTextField();
        availabilityField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nextMaintainencejDateChooser1 = new com.toedter.calendar.JDateChooser();
        manufacturejDateChooser1 = new com.toedter.calendar.JDateChooser();
        warrantyExpDatejDateChooser1 = new com.toedter.calendar.JDateChooser();
        deviceNameField2 = new javax.swing.JTextField();
        modelNoField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        deviceTypejComboBox1 = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CREATE NEW DEVICE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 100, 30));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 210, -1));

        availabilityjLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        availabilityjLabel3.setText("Availability:");
        add(availabilityjLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 110, 30));

        createButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createButton.setText("Add Product");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, -1, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Device Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Product Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 110, 30));

        priceField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(priceField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 210, 30));

        availabilityField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(availabilityField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Warranty Exp Date:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Next Maintainence Date:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Manufacture Date:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, 30));
        add(nextMaintainencejDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 210, 30));
        add(manufacturejDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 210, 30));
        add(warrantyExpDatejDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 210, 30));

        deviceNameField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(deviceNameField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 210, -1));

        modelNoField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(modelNoField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 210, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Device Name:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Model No:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 30));

        deviceTypejComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(deviceTypejComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 210, 30));
    }// </editor-fold>//GEN-END:initComponents
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed

        String prodName = deviceNameField2.getText();
        
        if(deviceNameField2.getText().isEmpty()==true || deviceNameField2.getText().startsWith(" ")) {
            JOptionPane.showMessageDialog(null, "Please enter valid text in Device Name field");
            return;
        }
        
        if(modelNoField3.getText().isEmpty()==true || modelNoField3.getText().startsWith(" ")) {
            JOptionPane.showMessageDialog(null, "Please enter valid text in Model No field");
            return;
        }
        
        if(priceField1.getText().isEmpty()==true || priceField1.getText().startsWith(" ")) {
            JOptionPane.showMessageDialog(null, "Please enter valid text in Price field");
            return;
        }
        
        if(availabilityField1.getText().isEmpty()==true || availabilityField1.getText().startsWith(" ")) {
            JOptionPane.showMessageDialog(null, "Please enter valid text in Availability field");
            return;
        }
        
         try {
            int modelNo = Integer.parseInt(modelNoField3.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "Error: Please enter integer values in model no field");
            return;
        }
        
          try {
            int price = Integer.parseInt(priceField1.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "Error: Please enter integer values in price field");
            return;
        }
          
         try {
            int availability = Integer.parseInt(availabilityField1.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "Error: Please enter integer values in availabilty field");
            return;
        }
        
        Date date = new Date();
        
        if (manufacturejDateChooser1.getDate().after(date)){
            JOptionPane.showMessageDialog(null, "Please choose Manufacture date BEFORE Current Date");
            return;
        }
        
        if (nextMaintainencejDateChooser1.getDate().before(date)){
            JOptionPane.showMessageDialog(null, "Please choose Next Maintainence date AFTER Current Date");
            return;
        }
        
        if (warrantyExpDatejDateChooser1.getDate().before(date)){
            JOptionPane.showMessageDialog(null, "Please choose Warranty Expiration date AFTER Current Date");
            return;
        }
        
        for (MedicalDevice md : supplier.getProductCatalog().getProductCatalog()) {
                
                if (md.getDeviceName().equals(deviceNameField2.getText())) {
                    JOptionPane.showMessageDialog(null, "Product already exists. Please input different name", "warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }    
        
            MedicalDevice device = supplier.getProductCatalog().addProduct();
            
            device.setDeviceName(prodName);
            device.setModelNumber(Integer.parseInt(modelNoField3.getText()));
            device.setDeviceType(String.valueOf(deviceTypejComboBox1.getSelectedItem()));
            device.setPurchaseCost(Integer.parseInt(priceField1.getText()));
            device.setAvailability(Integer.parseInt(availabilityField1.getText()));
            device.setNextMaitainenceDueDate(nextMaintainencejDateChooser1.getDate());
            device.setManufactureDate(manufacturejDateChooser1.getDate());
            device.setWarrantyExpirationDate(warrantyExpDatejDateChooser1.getDate());
            device.setManufacturerName(supplier.getSupplyName());
            
            JOptionPane.showMessageDialog(null, "Device added");
}//GEN-LAST:event_createButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availabilityField1;
    private javax.swing.JLabel availabilityjLabel3;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField deviceNameField2;
    private javax.swing.JComboBox deviceTypejComboBox1;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser manufacturejDateChooser1;
    private javax.swing.JTextField modelNoField3;
    private com.toedter.calendar.JDateChooser nextMaintainencejDateChooser1;
    private javax.swing.JTextField priceField1;
    private com.toedter.calendar.JDateChooser warrantyExpDatejDateChooser1;
    // End of variables declaration//GEN-END:variables
}

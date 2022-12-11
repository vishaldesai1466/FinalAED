/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TransportManagerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TransportAgencyEnterprise;
import Business.Network.Network;
import Business.Organization.Driver;
import Business.Organization.Organization;
import Business.Organization.Transport;
import Business.Role.DriverRole;
import Business.UserAccount.UserAccount;
import Business.Validations;
import Business.WorkQueue.DriverWorkRequest;
import Business.WorkQueue.LaptopWorkRequest;
import Business.WorkQueue.MainOfficeWorkRequest;
import Business.WorkQueue.TransportWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RequestTestJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Transport organization;
    private LaptopWorkRequest request;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;
    /**
     * Creates new form RequestTestJPanel
     */
    public RequestTestJPanel(JPanel userProcessContainer, Transport organization, LaptopWorkRequest request, UserAccount userAccount, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.request = request;
        this.userAccount = userAccount;
        this.business = business;
        this.network=network;
        
        populateDriverComboBox();
        
        int quantity = request.getQuantity();
        txtQuantity.setText(Integer.toString(quantity));        
        String location = request.getLocation();
        txtLocation.setText(location);
    }
    
    public void populateDriverComboBox() {
        comboBoxDriver.removeAllItems();
       // for(Network n : business.getNetworkList()){
            Enterprise en = null;            
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof TransportAgencyEnterprise)
                {
                    en=e;
                    for(Organization o : en.getOrganizationDirectory().getOrganizationList()) {
                        if(o instanceof Driver){
                          for(UserAccount ua: o.getUserAccountDirectory().getUserAccountList()) {
                              if(ua.getEmployee().getStatus().equals("Available")) {
                                comboBoxDriver.addItem(ua);
                              }
                          } 
                        }
                    }
                    
                }
            }
        }
        
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboBoxDriver = new javax.swing.JComboBox();
        btnRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();

        setBackground(new java.awt.Color(173, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setText("Message:");

        txtMessage.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setText("Select Driver:");

        comboBoxDriver.setBackground(new java.awt.Color(255, 51, 0));
        comboBoxDriver.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        comboBoxDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDriverActionPerformed(evt);
            }
        });

        btnRequest.setBackground(new java.awt.Color(255, 51, 0));
        btnRequest.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnRequest.setText("Request Test");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 51, 0));
        btnBack.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel3.setText("Quantity:");

        txtQuantity.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel4.setText("Location:");

        txtLocation.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMessage, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comboBoxDriver, javax.swing.GroupLayout.Alignment.TRAILING, 0, 296, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRequest)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRequest))
                .addContainerGap(269, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        boolean msgFlag = false;
        boolean qtyFlag = false;
        boolean locFlag = false;
        if (txtMessage.getText().isEmpty()) {
            msgFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter your message", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (txtQuantity.getText().isEmpty()) {
            qtyFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter quantity", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!Validations.isDigit(txtQuantity.getText())) {
            qtyFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter quantity as integer", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (txtLocation.getText().isEmpty()) {
            locFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter location", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!msgFlag & !qtyFlag & !locFlag){
            UserAccount ua = (UserAccount)comboBoxDriver.getSelectedItem();
            if(ua == null) {
                JOptionPane.showMessageDialog(null, "Drivers are busy at the moment. Please try again after some time.");
                txtMessage.setText("");
                txtQuantity.setText("");
                txtLocation.setText("");
            } else {
                request.setSender(userAccount);
                request.setMessage(txtMessage.getText());
                request.setQuantity(Integer.valueOf(txtQuantity.getText()));
                request.setLocation(txtLocation.getText());
                request.setStatus("Sent to driver");

                
                    Enterprise en=null;
                    for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                        System.out.println("Enterprise"+ enterprise.getName());
                         if(enterprise instanceof TransportAgencyEnterprise){
                             System.out.println("Yes");
                            en = enterprise;
                            Organization org = null;
                            UserAccount isDriver = null;
                            for (Organization organization : en.getOrganizationDirectory().getOrganizationList()){

                                if (organization instanceof Driver){
        //                            System.out.println("Yes Organization");
        //                            org = organization;
        //                            break;

                                    isDriver = ua;
                                    isDriver.getEmployee().setStatus("Busy");
                                    break;

                                }
                            }
                            if (isDriver!=null){
        //                        System.out.println("Driver"+isDriver.getgetName());
                                System.out.println("User Account"+userAccount.getUsername());
                                isDriver.getWorkQueue().getWorkRequestList().add(request);
                                System.out.println("DriverA"+isDriver.getWorkQueue().getWorkRequestList());
                                userAccount.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(null, "Request sent successfully.");
                                txtMessage.setText("");
                                txtQuantity.setText("");
                                txtLocation.setText("");
                            }
                            
                        }
                    }   
                
            }            
        }
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboBoxDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDriverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox comboBoxDriver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ServiceCenterManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.InspectionCenterEnterprise;
import Business.Network.Network;
import Business.Organization.ServiceCenter;
import Business.Organization.Technician;
import Business.Organization.Organization;
import Business.Role.TechnicianRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LaptopWorkRequest;
import Business.WorkQueue.InventoryWorkRequest;
import Business.WorkQueue.TechnicianWorkRequest;
import Business.WorkQueue.ServiceCenterManagerWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class RequestTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestTestJPanel
     */
    private JPanel userProcessContainer;
    private ServiceCenter organization;
    private LaptopWorkRequest request;
    private UserAccount account;
    private Network network;
    RequestTestJPanel(JPanel userProcessContainer, ServiceCenter organization, LaptopWorkRequest request, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.request = request;
        this.account = account;
        this.network = network;
        
        populateTechnicianComboBox();
    }
    
    public void populateTechnicianComboBox() {
        comboBoxTechnician.removeAllItems();
        
            Enterprise en = null;
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof InspectionCenterEnterprise)
                {
                    en=e;
                    for(Organization o : en.getOrganizationDirectory().getOrganizationList()) {
                        if(o instanceof Technician){
                          for(UserAccount ua: o.getUserAccountDirectory().getUserAccountList()) {
                              comboBoxTechnician.addItem(ua);
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
        txtMessage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboBoxTechnician = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 50));
        jLabel1.setText("Message:");

        txtMessage.setBackground(new java.awt.Color(51, 0, 51));
        txtMessage.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtMessage.setForeground(new java.awt.Color(0, 255, 50));

        btnBack.setBackground(new java.awt.Color(51, 0, 51));
        btnBack.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 255, 50));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRequest.setBackground(new java.awt.Color(51, 0, 51));
        btnRequest.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(0, 255, 50));
        btnRequest.setText("Request Test");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 50));
        jLabel2.setText("Select Technician");

        comboBoxTechnician.setBackground(new java.awt.Color(51, 0, 51));
        comboBoxTechnician.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        comboBoxTechnician.setForeground(new java.awt.Color(0, 255, 50));
        comboBoxTechnician.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRequest))
                .addContainerGap(359, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        boolean msgFlag = false;
        if (txtMessage.getText().isEmpty()) {
            msgFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter your message", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!msgFlag) {
            UserAccount ua = (UserAccount)comboBoxTechnician.getSelectedItem();
           // ServiceCenterWorkRequest request=new ServiceCenterWorkRequest();
            request.setSender(account);
            //request.setTechnicianName(ua);
            request.setMessage(txtMessage.getText());
            request.setStatus("Sent to lab assistant");
            Enterprise en=null;
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println("Enterprise"+ enterprise.getName());
                 if(enterprise instanceof InspectionCenterEnterprise){
                     System.out.println("Yes");
                    en = enterprise;
                    Organization org = null;
                    UserAccount isTechnician = null;
                    for (Organization organization : en.getOrganizationDirectory().getOrganizationList()){
                        
                        if (organization instanceof Technician){
//                            System.out.println("Yes Organization");
//                            org = organization;
//                            break;
                            
                            isTechnician = ua;
                        }
                    }
                    if (isTechnician!=null){
//                        System.out.println("Driver"+isDriver.getgetName());
                        System.out.println("User Account"+account.getUsername());
                        isTechnician.getWorkQueue().getWorkRequestList().add(request);
                        System.out.println("Technician"+isTechnician.getWorkQueue().getWorkRequestList());
                        account.getWorkQueue().getWorkRequestList().add(request);
                        JOptionPane.showMessageDialog(null, "Request sent successfully.");
                        txtMessage.setText("");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox comboBoxTechnician;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}

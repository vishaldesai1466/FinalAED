/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DriverRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MainCenterEnterprise;
import Business.Network.Network;
import Business.Organization.Inventory;
import Business.Organization.MainOffice;
import Business.Organization.Organization;
import Business.Organization.Store;
import Business.Organization.StoreChain;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DriverWorkRequest;
import Business.WorkQueue.LaptopWorkRequest;
import Business.WorkQueue.MainOfficeWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aadesh Randeria
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private LaptopWorkRequest request;
    private UserAccount account;
    private Network network;
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, LaptopWorkRequest request, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.account = account;
        this.network = network;
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
        txtResult = new javax.swing.JTextField();
        btnSubmitResult = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 255, 50));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 50));
        jLabel1.setText("Result:");

        txtResult.setBackground(new java.awt.Color(51, 0, 51));
        txtResult.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtResult.setForeground(new java.awt.Color(0, 255, 50));

        btnSubmitResult.setBackground(new java.awt.Color(51, 0, 51));
        btnSubmitResult.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnSubmitResult.setForeground(new java.awt.Color(0, 255, 50));
        btnSubmitResult.setText("Submit Result");
        btnSubmitResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitResultActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(51, 0, 51));
        btnBack.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 255, 50));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmitResult))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(538, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSubmitResult))
                .addContainerGap(484, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DriverWorkAreaJPanel dwjp = (DriverWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitResultActionPerformed
        // TODO add your handling code here:
        boolean resFlag=false;
        if(txtResult.getText().isEmpty() )
        {
            resFlag=true;
            JOptionPane.showMessageDialog(null, "Please enter your process message.","Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!resFlag){
            request.setTestResult(txtResult.getText());
            request.setStatus("Laptop Delivered");        
            account.getEmployee().setStatus("Available");
            JOptionPane.showMessageDialog(null, "Work Completed");
            txtResult.setText("");
            for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList()) {
                if(e instanceof MainCenterEnterprise) {
                    for(Organization o: e.getOrganizationDirectory().getOrganizationList()) {
                     // if(request.getSender().equals(o))
                        if(o instanceof StoreChain)
                       {
                           System.out.println("in sc");
                           System.out.println("sender"+request.getSenderOrganization());
                         for (Store store : ((StoreChain) o).getStoreChain()) {
                             if(store.equals(request.getSenderOrganization()))
                             {
                                 System.out.println("in store"+request.getSenderOrganization());
                               Organization org=request.getSenderOrganization();
                            int quantity = request.getQuantity();
                             int old_qty = ((Store)org).getStock();
                             System.out.println("old qty: "+old_qty);
                             ((Store)org).setStock(old_qty+quantity);
                             }
                         }
                       }
                        if(o instanceof Inventory && request.getSenderOrganization() instanceof MainOffice) {
                            System.out.println("in inventory");
                            int quantity = request.getQuantity();
                            System.out.println(quantity);
                            int old_qty = ((Inventory)o).getStock();
                            ((Inventory)o).setStock(old_qty+quantity);
                        }
    //                    if(o instanceof Store){
    //                        Organization org=request.getSenderOrganization();
    //                        int quantity = request.getQuantity();
    //                         int old_qty = ((Store)org).getStock();
    //                         System.out.println("old qty: "+old_qty);
    //                         ((Store)org).setStock(old_qty+quantity);
    //                    }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSubmitResultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmitResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}

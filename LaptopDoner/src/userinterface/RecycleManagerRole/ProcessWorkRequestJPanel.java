/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RecycleManagerRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.MainCenterEnterprise;
import Business.Network.Network;
import Business.Organization.Recycling;
import Business.Organization.Inventory;
import Business.Organization.Organization;
import Business.WorkQueue.RecycleManagerWorkRequest;
import Business.WorkQueue.LaptopWorkRequest;
import Business.WorkQueue.ServiceCenterManagerWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.DriverRole.DriverWorkAreaJPanel;

public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private LaptopWorkRequest request;
    private Recycling organization;
    private Network network;
    ProcessWorkRequestJPanel(JPanel userProcessContainer, LaptopWorkRequest request, Recycling organization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.organization = organization;
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
        btnBack = new javax.swing.JButton();
        btnSubmitResult = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setText("Result:");

        txtResult.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        btnBack.setBackground(new java.awt.Color(255, 51, 0));
        btnBack.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSubmitResult.setBackground(new java.awt.Color(255, 51, 0));
        btnSubmitResult.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnSubmitResult.setText("Submit Result");
        btnSubmitResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitResultActionPerformed(evt);
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
                .addContainerGap(333, Short.MAX_VALUE))
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
                .addContainerGap(382, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RecycleManagerWorkAreaJPanel cmwjp = (RecycleManagerWorkAreaJPanel) component;
        cmwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitResultActionPerformed
        // TODO add your handling code here:
        boolean msgFlag = false;
        if (txtResult.getText().isEmpty()) {
            msgFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter your message", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!msgFlag) {
            request.setTestResult(txtResult.getText());
            request.setStatus("Laptop Decomposed");
            JOptionPane.showMessageDialog(null, "Work Completed");
            txtResult.setText("");
            int itemsComposed = request.getQuantity();
            int old_qty = organization.getItemsComposed();
            organization.setItemsComposed(old_qty+itemsComposed);        

            for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList()) {
                if(e instanceof MainCenterEnterprise) {
                    for(Organization o: e.getOrganizationDirectory().getOrganizationList()) {
                        if(o instanceof Inventory) {
                            System.out.println("in inventory");
                            int quantity = request.getQuantity();
                            System.out.println(quantity);
                            int old_quantity = ((Inventory)o).getStock();
                            ((Inventory)o).setStock(old_quantity-itemsComposed);
                        }
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ServiceCenterManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ServiceCenter;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;


public class ServiceCenterManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ServiceCenterManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private ServiceCenter organization;
    private Enterprise enterprise;
    private Network network;
    public ServiceCenterManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ServiceCenter organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network=network;
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
        btnManageTechnician = new javax.swing.JButton();
        btnUserAccount = new javax.swing.JButton();
        btnWorkQueue = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 50));
        jLabel1.setText("My Work Area - ServiceCenter Manager Role");

        btnManageTechnician.setBackground(new java.awt.Color(51, 0, 51));
        btnManageTechnician.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnManageTechnician.setForeground(new java.awt.Color(0, 255, 50));
        btnManageTechnician.setText("Manage Technician");
        btnManageTechnician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTechnicianActionPerformed(evt);
            }
        });

        btnUserAccount.setBackground(new java.awt.Color(51, 0, 51));
        btnUserAccount.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnUserAccount.setForeground(new java.awt.Color(0, 255, 50));
        btnUserAccount.setText("Manage User Account");
        btnUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAccountActionPerformed(evt);
            }
        });

        btnWorkQueue.setBackground(new java.awt.Color(51, 0, 51));
        btnWorkQueue.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnWorkQueue.setForeground(new java.awt.Color(0, 255, 50));
        btnWorkQueue.setText("Manage Work Queue");
        btnWorkQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkQueueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageTechnician)
                    .addComponent(btnUserAccount)
                    .addComponent(btnWorkQueue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageTechnician, btnUserAccount, btnWorkQueue});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnManageTechnician)
                .addGap(18, 18, 18)
                .addComponent(btnUserAccount)
                .addGap(18, 18, 18)
                .addComponent(btnWorkQueue)
                .addContainerGap(334, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageTechnicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTechnicianActionPerformed
        // TODO add your handling code here:
        ManageTechnicianJPanel mlajp = new ManageTechnicianJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("ManageTechnicianJPanel", mlajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageTechnicianActionPerformed

    private void btnUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAccountActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUserAccountActionPerformed

    private void btnWorkQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkQueueActionPerformed
        // TODO add your handling code here:
        ManageWorkQueueJPanel mwqtjp = new ManageWorkQueueJPanel(userProcessContainer, account, organization, enterprise, network);
        userProcessContainer.add("ManageWorkQueueJPanel", mwqtjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnWorkQueueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageTechnician;
    private javax.swing.JButton btnUserAccount;
    private javax.swing.JButton btnWorkQueue;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

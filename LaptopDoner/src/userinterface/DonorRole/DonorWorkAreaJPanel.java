/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonorRole;

import Business.Donor.Donor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MainCenterEnterprise;
import Business.Network.Network;
import Business.Organization.DonorOrganization;
import Business.Organization.MainOffice;
import Business.Organization.Organization;
import Business.Organization.Store;
import Business.Organization.StoreChain;
import Business.UserAccount.UserAccount;
import Business.Validations;
import Business.WorkQueue.LaptopWorkRequest;
import Business.WorkQueue.MainOfficeWorkRequest;
import Business.WorkQueue.StoreWorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Apurva Sawant
 */
public class DonorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DonorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;

    /**
     * Creates new form DonorWorkAreaJPanel
     */
    public DonorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DonorOrganization organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.network = network;
        populateStore();
        populateComboBox();
        if (userAccount.getDonor().getType().equalsIgnoreCase("Individual")) {
            locationTxt.setEnabled(false);
        }
        if (!userAccount.getDonor().getType().equalsIgnoreCase("Individual")) {
            storeComboBox.setEnabled(false);
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
        donateBtn = new javax.swing.JButton();
        locationTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        storeComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboBoxCity = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 50));
        jLabel1.setText("Wish to donate laptop? Just notify us!");

        donateBtn.setBackground(new java.awt.Color(51, 0, 51));
        donateBtn.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        donateBtn.setForeground(new java.awt.Color(0, 255, 50));
        donateBtn.setText("Donate");
        donateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateBtnActionPerformed(evt);
            }
        });

        locationTxt.setBackground(new java.awt.Color(51, 0, 51));
        locationTxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        locationTxt.setForeground(new java.awt.Color(0, 255, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 50));
        jLabel2.setText("Quantity:");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 50));
        jLabel3.setText("(This facility is not available for individuals)");

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 50));
        jLabel4.setText("Location:");

        quantityTxt.setBackground(new java.awt.Color(51, 0, 51));
        quantityTxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        quantityTxt.setForeground(new java.awt.Color(0, 255, 50));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 50));
        jLabel5.setText("Store:");

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 50));
        jLabel6.setText("(This facility is only available for individuals)");

        storeComboBox.setBackground(new java.awt.Color(51, 0, 51));
        storeComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        storeComboBox.setForeground(new java.awt.Color(0, 255, 50));
        storeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 50));
        jLabel7.setText("Network:");

        comboBoxCity.setBackground(new java.awt.Color(51, 0, 51));
        comboBoxCity.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        comboBoxCity.setForeground(new java.awt.Color(0, 255, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(donateBtn))
                .addContainerGap(469, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(storeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(donateBtn)
                .addContainerGap(336, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void donateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateBtnActionPerformed

        if (!userAccount.getDonor().getType().equalsIgnoreCase("Individual")) {
            boolean qtyFlag = false;
            boolean locFlag = false;
            if (quantityTxt.getText().isEmpty()) {
                qtyFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter quantity", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!Validations.isDigit(quantityTxt.getText())) {
                qtyFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter quantity as integer", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (locationTxt.getText().isEmpty()) {
                locFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter location", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!qtyFlag & !locFlag){
                for (Donor donor : business.getDonorDiresctory().getDonorList()) {
                    if (userAccount.getDonor().equals(donor)) {
                        int old_quantity = donor.getDonationAmount();
                        int quantity = Integer.valueOf(quantityTxt.getText());
                        donor.setDonationAmount(old_quantity + quantity);
                    }

                }
                LaptopWorkRequest request = new LaptopWorkRequest();
                request.setSender(userAccount);
                request.setQuantity(Integer.valueOf(quantityTxt.getText()));
                request.setLocation(locationTxt.getText());
                request.setStatus("Request Sent");
                request.setMessage("Laptop ready for pickup");

                Enterprise en = null;
                for(Network network: business.getNetworkList()){
                    String net=(String)comboBoxCity.getSelectedItem();
                    if(network.getName().equalsIgnoreCase(net)){
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    //    System.out.println("Enterprise"+ enterprise.getName());
                    if (enterprise instanceof MainCenterEnterprise) {
                        //   System.out.println("Yes");
                        en = enterprise;
                        Organization org = null;
                        for (Organization organization : en.getOrganizationDirectory().getOrganizationList()) {

                            if (organization instanceof MainOffice) {
                                //         System.out.println("Yes Organization");
                                org = organization;
                                break;
                            }
                        }
                        if (org != null) {
                            //     System.out.println("Org"+org.getName());
                            //     System.out.println("User Account"+userAccount.getUsername());
                            org.getWorkQueue().getWorkRequestList().add(request);
                            //     System.out.println("Orga"+org.getWorkQueue().getWorkRequestList());
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                            JOptionPane.showMessageDialog(null, "Laptop donated successfully.");
                            quantityTxt.setText("");
                            locationTxt.setText("");
                        }

                    }
                }
                }
            }
            }
        } else {
            //send work request to that particular store
            boolean qtyFlag = false;
            if (quantityTxt.getText().isEmpty()) {
                qtyFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter quantity", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!Validations.isDigit(quantityTxt.getText())) {
                qtyFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter quantity as integer", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (!qtyFlag){
                for (Donor donor : business.getDonorDiresctory().getDonorList()) {
                    if (userAccount.getDonor().equals(donor)) {
                        int old_quantity = donor.getDonationAmount();
                        int quantity = Integer.valueOf(quantityTxt.getText());
                        donor.setDonationAmount(old_quantity + quantity);
                    }

                }
                LaptopWorkRequest request = new LaptopWorkRequest();
                request.setSender(userAccount);
                request.setQuantity(Integer.parseInt(quantityTxt.getText()));
                request.setStatus("Laptop Received");
                request.setMessage("Laptop given at store");
                Store inStore = null;
                for(Network network: business.getNetworkList()){
                     String net=(String)comboBoxCity.getSelectedItem();
                    if(network.getName().equalsIgnoreCase(net)){
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    //    System.out.println("Enterprise"+ enterprise.getName());
                    if (enterprise instanceof MainCenterEnterprise) {
                        //   System.out.println("Yes");
                      //  en = enterprise;
                       
                   
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof StoreChain) {
                        for (Store store : ((StoreChain) org).getStoreChain()) {
                            Store selectedstore = (Store) storeComboBox.getSelectedItem();
                            if (store.getName().equals(selectedstore.getName())) {
                                inStore = store;
                                break;
                            }

                        }
                    }
                }}}
                    }}
                if (inStore != null) {
                    inStore.getWorkQueue().getWorkRequestList().add(request);
                    //     System.out.println("Orga"+org.getWorkQueue().getWorkRequestList());
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    JOptionPane.showMessageDialog(null, "Laptop donated successfully.");
                    quantityTxt.setText("");
                }
            }
        }
    }//GEN-LAST:event_donateBtnActionPerformed

    private void storeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeComboBoxActionPerformed

    }//GEN-LAST:event_storeComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxCity;
    private javax.swing.JButton donateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JComboBox storeComboBox;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {

        comboBoxCity.removeAll();
        
        for(Network network: business.getNetworkList()){
          comboBoxCity.addItem(network.getName());
        }
    }
    
    private void populateStore() {

        storeComboBox.removeAll();
        for(Network network: business.getNetworkList()){
        for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){    
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof StoreChain) {
                for (Store store : ((StoreChain) org).getStoreChain()) {
                    storeComboBox.addItem(store);

                }
            }
        }
        }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Donor.Donor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MainCenterEnterprise;
import Business.Network.Network;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.Role.DonorRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Validations;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SignupJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignupJPanel
     */
    private JPanel jpanel;
    private EcoSystem system;
    public SignupJPanel(JPanel container, EcoSystem system) {
        initComponents();
        jpanel=container;
        this.system=system;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        userNametxt = new javax.swing.JTextField();
        txtPhoneno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        passvordTxt = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel1.setText("Enter your details:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel3.setText("Phone number:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel4.setText("Email id:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel5.setText("UserName:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtName.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 117, -1));

        txtEmail.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 117, -1));

        userNametxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        userNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNametxtActionPerformed(evt);
            }
        });
        add(userNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 117, -1));

        txtPhoneno.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtPhoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhonenoActionPerformed(evt);
            }
        });
        add(txtPhoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 117, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel7.setText("Type:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        typeComboBox.setBackground(new java.awt.Color(255, 51, 0));
        typeComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Hotel", "Event" }));
        add(typeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 117, -1));

        submitButton.setBackground(new java.awt.Color(255, 51, 0));
        submitButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        passvordTxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        add(passvordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 117, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel8.setText("(example@eg.com)");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 140, 20));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel9.setText("(xxx-xxx-xxxx)");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 120, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void userNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNametxtActionPerformed

    private void txtPhonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhonenoActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
          boolean nameFlag=false;
          boolean phoneNoFlag=false;
          boolean emailIdFlag=false; 
          boolean userFlag=false;
          boolean passFlag=false;
          Organization organization=null;
          for(Network network:system.getNetworkList())
          {
             for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
             {
                if(enterprise instanceof MainCenterEnterprise)
                {
                    for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
                    {
                       if(org instanceof DonorOrganization)   
                       {
                          organization=org;
                       }    
                    }    
                }    
             }    
          }    
          if(txtName.getText().isEmpty() )
          {
            nameFlag=true;
            JOptionPane.showMessageDialog(null, "Please enter your full name","Error", JOptionPane.ERROR_MESSAGE);
          }
          
          if(txtPhoneno.getText().isEmpty() || !Validations.isPhoneNumber(txtPhoneno.getText()))
          {
            phoneNoFlag=true;
            JOptionPane.showMessageDialog(null, "Please enter a valid phone number","Error", JOptionPane.ERROR_MESSAGE);
          }
          
          if(txtEmail.getText().isEmpty() || !Validations.isValidEmailId(txtEmail.getText()))
          {
            emailIdFlag=true;
            JOptionPane.showMessageDialog(null, "Please enter a valid EmailID","Error", JOptionPane.ERROR_MESSAGE);
          }
           if(userNametxt.getText().isEmpty())
          {
            userFlag=true;
            JOptionPane.showMessageDialog(null, "Please enter your user name","Error", JOptionPane.ERROR_MESSAGE);
          }

          if(passvordTxt.getText().isEmpty() )
          {
            passFlag=true;
            JOptionPane.showMessageDialog(null, "Please enter a password","Error", JOptionPane.ERROR_MESSAGE);
          }
          
           if (!nameFlag & !phoneNoFlag & !emailIdFlag & !userFlag & !passFlag){
             
              UserAccount user=new UserAccount();
              user.setEmployee(null);
              Donor donor=new Donor();
              donor.setName(txtName.getText());
              donor.setEmailId(txtEmail.getText());
              donor.setPhoneNo(txtPhoneno.getText());
              donor.setType(String.valueOf(typeComboBox.getSelectedItem()));
              system.getDonorDiresctory().getDonorList().add(donor);
              user.setDonor(donor);
             // Role role=Role.RoleType.Donor;
              user.setRole(new DonorRole());
              user.setUsername(userNametxt.getText());
              user.setPassword(String.valueOf(passvordTxt.getPassword()));
             // UserAccountDirectory userAccountDirectory=new UserAccountDirectory();
              organization.getUserAccountDirectory().addAccount(user);
             // userAccountDirectory.addAccount(user);
              JOptionPane.showMessageDialog(null, "Details saved successfully. You may login now");
              txtName.setText("");
              userNametxt.setText("");
              txtEmail.setText("");
              txtPhoneno.setText("");
              passvordTxt.setText("");
           }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField passvordTxt;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneno;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JTextField userNametxt;
    // End of variables declaration//GEN-END:variables
}

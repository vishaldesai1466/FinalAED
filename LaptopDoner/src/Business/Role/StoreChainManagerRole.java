/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.Organization.StoreChain;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DonorRole.DonorWorkAreaJPanel;
import userinterface.StoreChainManagerRole.StoreChainWorkAreaJPanel;

public class StoreChainManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new StoreChainWorkAreaJPanel(userProcessContainer, account, (StoreChain)organization, enterprise);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;


public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        
        if (type.getValue().equals(Organization.Type.Donor.getValue())){
            organization = new DonorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.ServiceCenter.getValue())){
            organization = new ServiceCenter();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MainOffice.getValue())){
            organization = new MainOffice();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Inventory.getValue())){
            organization = new Inventory();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Recycling.getValue())){
            organization = new Recycling();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Transport.getValue())){
            organization = new Transport();
            organizationList.add(organization);
        }
        
        
        return organization;
    
    
    }
}

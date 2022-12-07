/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.TechnicianRole;
import Business.Role.ServiceCenterManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

public class ServiceCenter extends Organization {

    public ServiceCenter() {
        super(Organization.Type.ServiceCenter.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ServiceCenterManagerRole());
        return roles;
    }
    
}

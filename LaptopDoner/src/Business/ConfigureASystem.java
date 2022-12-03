package Business;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
//import Business.Organization.AdminOrganization;
//import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;

public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("FoodDrive");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
  
}

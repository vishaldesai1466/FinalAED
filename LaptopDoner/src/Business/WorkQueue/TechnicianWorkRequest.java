/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;


public class TechnicianWorkRequest {
    private String testResult;
    private UserAccount TechnicianName;
    private int quantity;
    private String location;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public UserAccount getTechnicianName() {
        return TechnicianName;
    }

    public void setTechnicianName(UserAccount labAssistantName) {
        this.TechnicianName = TechnicianName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

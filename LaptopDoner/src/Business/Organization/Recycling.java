/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RecycleManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

public class Recycling extends Organization {
    private int itemsComposed;
    private RecordList recordList;
    public Recycling() {
        super(Organization.Type.Recycling.getValue());
        recordList=new RecordList();
    }

    public RecordList getRecordList() {
        return recordList;
    }

    public void setRecordList(RecordList recordList) {
        this.recordList = recordList;
    }
    
    public int getItemsComposed() {
        return itemsComposed;
    }

    public void setItemsComposed(int itemsComposed) {
        this.itemsComposed = itemsComposed;
    }
    
    public int totalLaptopDecomposed(){
        int donation=recordList.totalDecomposition();
        return donation;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RecycleManagerRole());
        return roles;
    }
    
}

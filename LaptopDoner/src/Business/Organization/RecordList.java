/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

public class RecordList {
    private ArrayList<Records> recordList;
    
    public RecordList(){
        recordList = new ArrayList<Records>();
    }

    public ArrayList<Records> getRecordList() {
        return recordList;
    }

    public void setRecordList(ArrayList<Records> recordList) {
        this.recordList = recordList;
    }
    public void addRecords(Records record){
        
        recordList.add(record);
        
    }
    
    //returns the amount of laptop donated by the donors for a particular month
    public int totalDonation(int month){
    
        int totalDonation=0;
        for(Records record: recordList)
        {
          if(record.getRequestDate().getMonth()==month)
          {
            totalDonation+=record.getLaptopDonated();
          }
        }   
        
        return totalDonation;
    }
    
    //returns the amount of laptop donated by the donors
    public int totalDonation(){
    
        int totalDonation=0;
        for(Records record: recordList)
        {
           totalDonation+=record.getLaptopDonated();
        }   
        
        return totalDonation;
    }
    
    public int totalDecomposition(){
    
        int totalDecomposition=0;
        for(Records record: recordList)
        {
           totalDecomposition+=record.getLaptopDecomposed();
        }   
        
        return totalDecomposition;
    }
    
    //returns the amount of laptop given avay to needy for a particular month
    public int totalGiveAway(int month){
    
        int totalGiveAway=0;
        for(Records record: recordList)
        {
          //  System.out.println("record.getRequestDate().getMonth() : "+record.getRequestDate().getMonth());
          if(record.getRequestDate().getMonth()==month)
          {
              System.out.println("Business.Organization.RecordList.totalGiveAway()");
            totalGiveAway+=record.getLaptopGiven();
          }
        }   
            System.out.println("give aay"+totalGiveAway);
        return totalGiveAway;
    }
    
    //returns the amount of laptop donated by the donors
    public int totalGiveAway(){
    
        int totalGiveAway=0;
        for(Records record: recordList)
        {
           totalGiveAway+=record.getLaptopGiven();
        }   
        
        return totalGiveAway;
    }
}

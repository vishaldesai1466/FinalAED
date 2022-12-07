/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.Date;

public class Records {
    private Date requestDate;
    private int laptopDonated;
    private int laptopGiven;
    private int laptopDecomposed;
    
    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public int getLaptopDonated() {
        return laptopDonated;
    }

    public int getLaptopDecomposed() {
        return laptopDecomposed;
    }

    public void setLaptopDecomposed(int laptopDecomposed) {
        this.laptopDecomposed = laptopDecomposed;
    }
    

    public void setLaptopDonated(int laptopDonated) {
        this.laptopDonated = laptopDonated;
    }

    public int getLaptopGiven() {
        return laptopGiven;
    }

    public void setLaptopGiven(int laptopGiven) {
        this.laptopGiven = laptopGiven;
    }
    
    
}

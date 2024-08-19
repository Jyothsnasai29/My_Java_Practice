package org.example;

public class Customer {
    private String lastname;
    private String customeraddress;
    private String gender;
    private int mobilenumber;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
}

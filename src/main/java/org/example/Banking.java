package org.example;

public class Banking {
    private String customarefirstname;
    private int accountnumber;
    private String bankaddress;
    private int ifsc;

    public String getCustomarefirstname() {
        return customarefirstname;
    }

    public void setCustomarefirstname(String customarefirstname) {
        this.customarefirstname = customarefirstname;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getBankaddress() {
        return bankaddress;
    }

    public void setBankaddress(String bankaddress) {
        this.bankaddress = bankaddress;
    }

    public int getIfsc() {
        return ifsc;
    }

    public void setIfsc(int ifsc) {
        this.ifsc = ifsc;
    }



    public static void main (String argv[]){

        MobileBanking bankobj = new MobileBanking();
        bankobj.setUserid("jyothsna");
        bankobj.setPassword("Lovelymom");
        bankobj.setBalance(29000);
        bankobj.setOtp(675);
        bankobj.setDeposit(15000);

        System.out.println(bankobj);


//        System.out.println("the customername account balance is : " + bankobj.getBalance() );


    }
}

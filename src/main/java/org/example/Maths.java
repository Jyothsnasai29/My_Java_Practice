package org.example;

public class Maths {

    int d;
    int e;
    public void sub(int x, int y)
    {
        int f;
        d = x;
        e = y;

        System.out.println(f= d-e);
    }


    public static void printMe()
    {
        System.out.println("HIII");
    }

    public static void main (String argv[]){

       Add.add(30, 40);

        Maths Teammate2 = new Maths();
        Teammate2.sub(40, 60);
         printMe();

         Encapsule bank = new Encapsule();
         bank.ifsc= "sbi08754";
         bank.setAccountBalance(50000);


int output = bank.getAccountBalance();
System.out.println(output);


    }
}


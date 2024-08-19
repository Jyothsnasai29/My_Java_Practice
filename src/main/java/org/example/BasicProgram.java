package org.example;

public class BasicProgram {
    String name;
    int rollnumber;

    public void multiply(String strName , int d, int e)
    {
        int num3 = d;
        int num4 = e;
        int f = d * e;
        System.out.println(strName + "is multiplying and the result is:" +  f);
    }



    public void adding(int a, int b)
    {
        int num1 = a;
        int num2 = b;
        int c = a + b;
        System.out.println(c);
    }
public void printObj()
{
    System.out.println("my name is" + name +" and my rollnumber is" + rollnumber);
}
    public void reading(String stdName)
    {
        System.out.println(stdName +" is reading");
        printObj();
    }

    public static void main(String[] args) {
        BasicProgram study1 = new BasicProgram();
        study1.name = "Pinky";
        study1.rollnumber = 2;
        String studentName= "Arun";
//        study1.reading(studentName);
//        printObj();

//      study1.adding(4,5);
//      study1.multiply("Arun", 6,8);
//      study1.
    }

}

package org.example;

public class Testing {

 public static void main(String[] args){

     Box b1 = new Box(10 , 20);
     Box b2 = new Box(20 , 30);
//     b1.isEqual(b2);

     b2.isEqual(b1);

    if(b1.isEqual(b2)){
        System.out.println("Both b1 and b2 are equal");
    }else{
        System.out.println("Both b1 and b2 are not equal");
    }

    b1.y= 30;
    b1.z= 40;

    Box.j = 10;
    System.out.println(Box.sub(10));



   String s1 = b1.add(b1.y , b1.z);


    System.out.println(s1);

 }
}

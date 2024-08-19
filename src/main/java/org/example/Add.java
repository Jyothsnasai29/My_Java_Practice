package org.example;

public class Add {

    int a;
    int b;
    int c= a +b;

    public static void add(int c1, int c2)
    {
        System.out.println(c1+ c2);
    }
    public static void main (String argv[]){
        Add client = new Add();
        client.add( 60, 40);


    }
}

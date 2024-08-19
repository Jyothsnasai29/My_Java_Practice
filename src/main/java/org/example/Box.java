package org.example;

public class Box {

    int width;
    int height;
    int y;
    int z;

    static int j;

    Box(int w , int h){
        width = w;
        height = h;
    }
    public boolean isEqual(Box boothu){
        if(this.width == boothu.width && this.height == boothu.height)
            return true;
        else
            return false;
    }

    public String add(int y , int z){
     this.y = y;
     this.z = z;
     return "I have added successfully";
    }

    public static String sub(int y){
        return "I have sub successfully";
    }

    public static void main(String[] args)
    {
        j = 1;
        System.out.println(sub(2));


        Box obj = new Box(1,2);

        obj.y = 1;
        obj.add(1,2);


    }

}

package com.example.project;

public class Test {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle(1, 2, 2, 3, 4, 3);
        double x0=myTriangle.getx0();
        double x1=myTriangle.getx1();
        double x2=myTriangle.getx2();
        double y0=myTriangle.gety0();
        double y1=myTriangle.gety1();
        double y2=myTriangle.gety2();

        System.out.println("Expected: 1 , 2 , 2 , 3 , 4 , 3");
        System.out.println(x0);
        System.out.println(y0);
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);


        System.out.println("Expected perimeter= 6.57649122254");
        System.out.println(myTriangle.perimeter());
        System.out.println("Expected: Area =0.99999999999" );
        System.out.println(myTriangle.area());
        myTriangle.translateX(4);
        myTriangle.translateY(2);
         x0=myTriangle.getx0();
         x1=myTriangle.getx1();
         x2=myTriangle.getx2();
         y0=myTriangle.gety0();
         y1=myTriangle.gety1();
         y2=myTriangle.gety2();
        System.out.println("Translate X,Y Expected: 5 , 4 , 6 , 5 , 8 , 5");
        System.out.println(x0);
        System.out.println(y0);
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);






    }
}

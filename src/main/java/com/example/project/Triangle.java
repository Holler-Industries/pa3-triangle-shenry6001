package com.example.project;
import java.lang.Math;

public class Triangle {
    private double x0; //declares all of the x and y coor pairs
    private double x1;
    private double x2;
    private double y0;
    private double y1;
    private double y2;

    public Triangle(){ // this is for the other triangle with all points at (0,0)
        x0=0;
        x1=0;
        x2=0;
        y0=0;
        y1=0;
        y2=0;

    }
    public Triangle(double x0, double y0, double x1, double y1, double x2,double y2){ //this declares new triangle objects
        this.x0=x0;
        this.x1=x1;
        this.x2=x2;
        this.y0=y0;
        this.y1=y1;
        this.y2=y2;

    }
    public double perimeter(){ // this is the perimeter of a a given triangle
        double P = (((Math.sqrt(((x0-x1)*(x0-x1)+(y0-y1)*(y0-y1))))+(Math.sqrt(((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)))+(Math.sqrt(((x0-x2)*(x0-x2)+(y0-y2)*(y0-y2))))))); //this is the perimeter using the distance formula
        return P;

    }
    public double area(){ // finds area
        double A=(Math.sqrt(((x0-x1)*(x0-x1)+(y0-y1)*(y0-y1))));// distance formula
        double B=(Math.sqrt(((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))));
        double C=(Math.sqrt(((x0-x2)*(x0-x2)+(y0-y2)*(y0-y2))));
        double S=((A+B+C)/2);
        double Area= (Math.sqrt(S*((S-A)*(S-B)*(S-C)))); // using Herons Law
        return Area;

    }

    public void translateX(double value){//this shifts the x value with a given value
        this.x0=this.x0+value;
        this.x1=this.x1+value;
        this.x2=this.x2+value;
    }

    public void translateY(double value){ // this shifts the y value with a given value
        this.y0=this.y0+value;
        this.y1=this.y1+value;
        this.y2=this.y2+value;
    }







    // your code goes here: good luck =)t


    // DO NOT DELETE THESE!
    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() { return y2;
    }
}

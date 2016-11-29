package com.sd.ch8;

public class Circle extends Point{
   double radius;
   double p = 3.14;
   double a;

   public Circle(int x, int y, double radius){
      super(x,y);
      this.radius = radius;
   }

   double getArea(){

      a = radius*radius*p;

      return a;
   }

   public static void main(String[] args){
      Circle myCircle = new Circle(10,10,5);
      Double myArea = myCircle.getArea();
      System.out.println(myArea);
   }
}
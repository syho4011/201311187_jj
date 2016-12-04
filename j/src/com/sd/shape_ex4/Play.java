package com.sd.shape_ex4;


public class Play{
   public static void main(String args[]){
      Rectangle r = new Rectangle(3,4);
      Circle c = new Circle(5);

      System.out.println("rectangle area:" +r.calcArea());
      System.out.println("rectangle perimeter:"+r.calcPerimeter());
      System.out.println("circle area:" + c.calcArea());
      System.out.println("circle perimeter:" + c.calcPerimeter());
   }
}
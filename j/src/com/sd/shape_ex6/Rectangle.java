package com.sd.shape_ex6;

public class Rectangle extends Shape{
   private double width,height,area, perimeter;
   public Rectangle(double width, double height){
      this.width=width;
      this.height=height;
      this.area=width*height;
      this.perimeter=2*(width+height);
   }

   
   public double calcArea(){
      return this.area;
   }
   
   public double calcPerimeter(){
      return this.perimeter;
   }
   public String toString(){
      return "Rectangle..."+ super.toString();
   }
}
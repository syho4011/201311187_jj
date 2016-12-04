package com.sd.shape_ex6;

public class Circle extends Shape{
   private final double radius, area, perimeter;
   public Circle(double radius){
      this.radius = radius;
      this.area = Math.PI * radius * radius;
      this.perimeter = 2 * Math.PI * radius;
   }
   public double calcArea(){
      return this.area;
   }
   public double calcPerimeter(){
      return this.perimeter;
   }
   public String toString(){
      return "Circle..." + super.toString();
   }
}
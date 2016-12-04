package com.sd.shape_ex6;

public class Play{
   public static void main(String args[]){
      Rectangle r = new Rectangle(3,4);
      Circle c = new Circle(5);

      if(r instanceof Shape && r instanceof Rectangle){
         System.out.print(r.toString());
      }
      
      boolean x = r.getClass() == Rectangle.class;
      System.out.println("r.getClass() == Rectangle.class:" + x);
      System.out.println();

      Shape[] s = new Shape[2];
      s[0] = r;
      s[1] = c;
      for(Shape my:s){
         if(my instanceof Rectangle){
            System.out.println(my.toString());
      }else if(my instanceof Circle){
            System.out.println(my.toString());
         }
      }

      for(Shape my:s)
         System.out.println(my.toString());
      
   }
}
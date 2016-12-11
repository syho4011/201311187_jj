package com.sd.yut;

class Dice{
   int b = 0;
  
   public void roll(){
      b = (int)(Math.random()*12+1);
      
   }

   public int getNum(){
      return this.b;
     
   }
 
}
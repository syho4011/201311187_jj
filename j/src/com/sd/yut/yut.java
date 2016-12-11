package com.sd.yut;

class yut{
   int a = 0;
   
   public void roll(){
      a = (int)(Math.random()*5+1);
   }

   public int getNum(){
      return this.a;
   }
}
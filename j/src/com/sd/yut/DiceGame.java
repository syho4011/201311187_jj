package com.sd.yut;


class DiceGame {
   
   

   
   public static void main(String[] args){
      Player p1 = new Player("Kang Tae Hoon");
      Player p2 = new Player("Han Seok ho");      

      p1.play();
      p2.play();
      
      

      if(p1.getNum() > p2.getNum()) {
         p1.score+=1;
         System.out.println(p1.getName() + " win"); 
      } 
      else if (p1.getNum() == p2.getNum()) {
         System.out.println("draw");
      }
      else {
         p2.score+=1;
         System.out.println(p2.getName() + " win");     
      }
    

      
      System.out.println(p1.getName() + ":" + p1.getNum());
      System.out.println(p2.getName() + ":" + p2.getNum());
      
   }
}
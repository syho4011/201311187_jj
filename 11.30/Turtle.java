package com.sd.ch8;

public class Turtle{
   protected int nLimbs=4;
   protected String food;
   

   public void setFood(String f){
      this.food=f;
   }

   public int getLimbs(){
      return nLimbs;
   }
   public void eat(){
      System.out.println("Turtle eats" + food);
   }

   public static void main(String[] args){
      Turtle t = new Turtle();
      SeaTurtle st = new SeaTurtle();
      LandTurtle lt = new LandTurtle();

      st.setFood("seaweeds");
      lt.setFood("plants");
      t.eat();
      st.eat();
      lt.eat();
   }

}

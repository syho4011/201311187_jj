package com.sd.ch8;

class Selection{
   Selection(){}
   public void select(Rectangle r){
      r.setSelected(true);
      System.out.println("selected: "+r.isSelected);
   }
   
   public static void main(String[] args){
      Rectangle r = new Rectangle(30,50);
      Cube c = new Cube(20,30,40);
      
      Selection s = new Selection();
      s.select(r);
      s.select(c);
   }
}
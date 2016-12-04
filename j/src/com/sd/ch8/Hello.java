package com.sd.ch8;

class Hello{
   private String name;
   public Hello(String name){
      this.name=name;
   }
   public void sayHello(){
      System.out.println("Hello" + name);
   }
   public static void main(String[] args){
      Hello[] h=new Hello[5];
      h[0] = new Hello("kth1");
      h[1] = new Hello("kth2");
      h[2] = new Hello("kth3");
      h[3] = new Hello("kth4");
      h[4] = new Hello("kth5");
      for(Hello e:h)
         e.sayHello();
   }
}

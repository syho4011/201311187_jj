class rockScissorPaper{
   static void playGame(String a, String b){
      
      if((a=="rock") &&  (b=="scissor")){
         System.out.println("kth win");
      }else if((a=="rock") && (b=="paper")){
         System.out.println("ksh win");
      }else if((a=="rock") && (b=="rock")){
         System.out.println("draw");
      }else if((a=="scissor") && (b=="rock")){
         System.out.println("ksh win");
      }else if((a=="scissor") && (b=="paper")){
         System.out.println("kth win");
      }else if((a=="scissor") && (b=="scissor")){
         System.out.println("draw");
      }else if((a=="paper") && (b=="rock")){
         System.out.println("kth win");
      }else if((a=="paper") && (b=="scissor")){
         System.out.println("ksh win");
      }else if((a=="paper") && (b=="paper")){
         System.out.println("draw");
      }else
         System.out.println("error");
      }

   public static void main(String args[]){
      String c ="kth";
      String d ="ksh";
      System.out.println("three! two! one!");
      System.out.println(c+":"+ "rock");
      System.out.println(d+":"+ "scissor");
      playGame("rock", "scissor");
   }
}
         

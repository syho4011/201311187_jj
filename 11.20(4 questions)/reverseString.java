class reverseString{
   static void reverseString(){
      String s = "hello";
      String s2 = "";

      for(int i = s.length()-1; i>-1; i--){
         s2 += s.charAt(i);
      }

      System.out.println("Before:" + s);
      System.out.println("After:" + s2);
      }
   public static void main(String args[]){
      reverseString();
   }
}
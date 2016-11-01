class Temp {
   double toC(double f) {
      double c = (f - 32) * (5.0 / 9.0);
      return c;
   }
   double toF(double c){
      double f =  c * (9.0 / 5.0) + 32; 
      return f;
   }
   

   public static void main(String[] args) {
      Temp t = new Temp();
      System.out.println(t.toC(75)); 
      System.out.println(t.toF(90));
   }
}


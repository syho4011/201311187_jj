class leapYearList{
   static void leapYear(int year){
      if((year%4==0) && (year%100 !=0) || (year%400==0)){
         System.out.println("a leap year!");
      }else{
         System.out.println("not a leap year!");
      }
   }
   public static void main(String args[]){
      int year = 2100;
      leapYear(year);
   }
}
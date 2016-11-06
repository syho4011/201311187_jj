import java.util.Calendar;

class Sunday{
   static void sun(){
      int s = 0;
      Calendar c = Calendar.getInstance();
      for(int year=1901; year<=2000; year++){
         for(int month=0; month<12; month++){
            c.set(year,month,1);
            int day_of_week = c.get(Calendar.DAY_OF_WEEK);
            if(c.get(Calendar.DAY_OF_WEEK)==1){
               s++;
            }
         }
      }
      System.out.println("count:" + s);
   }
   public static void main(String[] args){
      sun();
   }
}
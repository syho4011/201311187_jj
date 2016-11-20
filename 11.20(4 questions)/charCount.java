import java.util.HashMap;
import java.util.Map;

class charCount{
   static void charCount(char[] letters){
      Map<Character,Integer> count = new HashMap<Character,Integer>();

      for(char a:letters){
         if(count.containsKey(a)){
            count.put(a, count.get(a) + 1);
         }
         else{
            count.put(a,1);
         }
      }
      System.out.print(letters);
      System.out.printf("\n"+"count");
      System.out.println(count);
   }

   public static void main(String args[]){
      char[] voc = "Mokdong's son".toCharArray();
      charCount(voc);
   }
}
 
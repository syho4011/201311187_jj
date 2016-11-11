import java.util.ArrayList;


class Numbers{
   
   static void number(){
      ArrayList<Integer> numList = new ArrayList<Integer>();    
      int sum=0;
      for(int i=1; i<1001; i++){
         if(i%4==0 && i%5!=0){
            
            numList.add(i);
            sum+=i;
         }
      }
      System.out.println(numList);
      System.out.println("Array's sum:" + sum);

   }

   public static void main(String args[]){
      
      number();
     
   }
}
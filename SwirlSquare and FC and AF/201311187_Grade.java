   
class PersonGrade{
   void Grade(double marks){
      if(90<=marks && marks<=100){
         System.out.println("Your grade is A");
      }
      else if(80<=marks && marks<90){
         System.out.println("Your grade is B");
      }
      else if(70<=marks && marks<80){
         System.out.println("Your grade is C");
      }
      else if(60<=marks && marks<70){
         System.out.println("Your grade is D");
      }
      else
         System.out.println("Your grade is F");
      }
}

Grade(90.1)

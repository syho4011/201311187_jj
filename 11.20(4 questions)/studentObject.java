import java.util.ArrayList;
import java.util.Collections;

class studentObject{
   private String name;
   private int num;
   studentObject(String name, int num){
      this.name = name;
      this.num = num;
   }
   public String getName(){
      return name;
   }

   public void setName(String name){
      this.name = name;
   }
   public int getNumber(){
      return num;
   }
   public void setNumber(int num){
      this.num = num;
   }
   
   public int compareTo(studentObject st){
      return name.compareTo(((studentObject) st).name);
   }
   static void studentObject(){
      ArrayList<String> studentNameList = new ArrayList<String>();
      studentObject s1 = new studentObject("taehoon",1);
      studentObject s2 = new studentObject("strongtaehoon",2);
      studentObject s3 = new studentObject("weaktaehoon",3);
      studentObject s4 = new studentObject("uglytaehoon",4);
      studentNameList.add(s1.getName());
      studentNameList.add(s2.getName());
      studentNameList.add(s3.getName());
      studentNameList.add(s4.getName());

      Collections.sort(studentNameList);
      System.out.println(studentNameList);
     
   } 
   
   public static void main(String[] args){
      studentObject();
   }
} 
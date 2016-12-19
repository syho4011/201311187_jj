import java.io.*;
import java.util.Scanner;

class FileScanner{
   public static void main(String[] args){
      Scanner f = new Scanner(new File("test.txt"));
      String line= f.nextLine();
      System.out.println(line);
   }
}

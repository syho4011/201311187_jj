import java.io.*;
import java.util.Scanner;

public class WriteFile {
	
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("test.txt");
		BufferedWriter bf = new BufferedWriter(file);
		bf.write("java zzang!!");
		bf.close();
	}
}

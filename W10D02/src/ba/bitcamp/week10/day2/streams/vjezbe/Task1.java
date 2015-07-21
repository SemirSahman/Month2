package ba.bitcamp.week10.day2.streams.vjezbe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task1 {

	public static void main(String[] args) {
		PrintWriter pw = null; 
		
		try{
		pw = new PrintWriter(new File("task1.txt"));
		for (int i = 1; i < 100; i++) {
			pw.println(String.valueOf(i));
			if (i%2==0){
				pw.println("String");
			}
		pw.flush();
		}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
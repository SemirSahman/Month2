package ba.bitcamp.week12.day01.predavanja;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class FileStreamSample {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream is = new FileInputStream("src/myfile.txt");
			
			FileOutputStream os = new FileOutputStream("src/myfile.txt");
			
			PrintWriter pw = new PrintWriter(os);
			
			byte[] buffer = new byte[10];
			while(is.available() > 0){
				is.read(buffer);
				for(byte b : buffer){
					System.out.println(b);
				}
				buffer = new byte[10];
			}
			
			pw.println("Moj string");
			pw.printf("Moj %s formatirani", "string");
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

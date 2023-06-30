package day23.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamEx2 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("output1.txt")){
			int data;
			do {
				data = fis.read();
				if(data == -1) {
					break;
				}
				System.out.print(data);
			}while (true);
			System.out.println();
			System.out.println("File reader success!");
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
package day23.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output1.txt")){
			
			for(int i =1+69; i<= 10+69; i++) {
				fos.write(i);
			}
			System.out.println("File writer success!");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(
				FileOutputStream fos = new FileOutputStream("output2.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			for(int i =1; i<= 10; i++) {
				oos.writeInt(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(
			FileInputStream fis = new FileInputStream("output2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			for(int i =1; i<= 10; i++) {
				System.out.println(ois.readInt());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
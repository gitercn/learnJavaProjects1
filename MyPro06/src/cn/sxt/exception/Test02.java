package cn.sxt.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		readMyFile();

	}
	
	public static void readMyFile() {
		FileReader reader = null;
		try {
			reader = new FileReader("c:\\javasxt\\b.txt");
			System.out.println("step1");
			char c1 = (char)reader.read();
			System.out.println(c1);
		}catch(FileNotFoundException e){
			System.out.println("step2");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("step3");
			e.printStackTrace();
		}finally {
			System.out.println("step4");
			try {
				if(reader!=null) {
					reader.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

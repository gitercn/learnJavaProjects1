package cn.sxt.exception;

import java.io.FileReader;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		readMyFile();

	}

	public static void readMyFile() throws IOException {
		FileReader reader = null;

		reader = new FileReader("c:\\javasxt\\b.txt");
		System.out.println("step1");
		char c1 = (char) reader.read();
		System.out.println(c1);

		if (reader != null) {
			reader.close();
		}

	}
}

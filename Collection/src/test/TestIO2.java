package test;
import java.io.FileWriter;
import java.io.IOException;
public class TestIO2 {
         public static void main(String[ ] args) {
                   String str = "Hello World";
                   FileWriter fw = null;
                   try {
                            fw = new FileWriter("c:\\hello.txt"); // 1
                            fw.write(str);                        // 2
                   } catch (IOException e) {
                            e.printStackTrace();                  // 3
                   } finally {
                            try {
								fw.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}                           // 4
                   }
         }
}
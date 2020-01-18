package test;

import java.io.FileWriter;
import java.io.IOException;
public class TestIO1 {
	public static void main(String []args) throws IOException{
        String str ="文件写入练习";
        FileWriter fw = null;                           //1
        try{
                 fw = new FileWriter("c:\\java5csv\\mytext.txt");  //2
                 fw.write(str);                   //3
        }catch(IOException e){                          //4
                 e.printStackTrace();
        }finally{
        	
                 //此处省略关闭流
        }
}
}
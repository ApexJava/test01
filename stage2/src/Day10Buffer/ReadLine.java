package Day10Buffer;


import java.io.*;

public class ReadLine {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new FileReader("D:\\kewen.txt"));

        String line = null;

        while ((line = bis.readLine())!=null){
            System.out.println(line);
        }
        bis.close();
    }
}

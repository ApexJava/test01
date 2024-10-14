package Day09read_write;

import java.io.FileInputStream;
import java.io.IOException;

public class FISread {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\aaa\\1.txt");
        int b ;
        while ((b = fis.read())!=-1){
            System.out.println((char) b);
        }
        fis.close();
    }
}

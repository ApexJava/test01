package Day09read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FISread02 {
    public static void main(String[] args)throws IOException {
        File file = new File("D:\\a.txt");
        System.out.println(file.exists());
        FileInputStream fis = new FileInputStream(file);
        int len;
        byte[] bytes = new byte[2];
        while ((len=fis.read(bytes))!=-1){
            System.out.println((new String(bytes)));
        }
        fis.close();
    }
}

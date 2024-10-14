package Day09read_write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSwrite {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\AAA\\1.txt");
        FileOutputStream fos = new FileOutputStream(file,true);

        byte[] b= "陈浩栋9.11加油！".getBytes();

        fos.write(98);
        fos.write(99);
        fos.write(b);
        fos.write(b,0,3);
        fos.write("\r\n".getBytes());
        fos.close();
    }
}

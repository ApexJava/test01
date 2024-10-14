package Day09read_write;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class read_write {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\text.jpg");
        FileOutputStream fos = new FileOutputStream("d:\\aaa\\test_copy.jpg");

        int len;
        byte[] b = new byte[1024];

        while ((len= fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}

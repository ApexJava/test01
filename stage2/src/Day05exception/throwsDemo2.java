package Day05exception;

import java.io.FileNotFoundException;
import java.lang.Exception;

public class throwsDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        read("b.txt");
        System.out.println("over");

    }

    public static void read(String path)throws FileNotFoundException {
        if (!path.equals("a.txt")){
            throw  new FileNotFoundException("文件路径不正确");
        }
    }
}

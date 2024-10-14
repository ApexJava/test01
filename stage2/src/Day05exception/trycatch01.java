package Day05exception;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;

public class trycatch01 {
    public static void main(String[] args) throws FileNotFoundException {
    try {
    read("b.txt");}
    catch (FileNotFoundException e){
        System.out.println(e);
    }
    System.out.println("over");

}

    public static void read(String path)throws FileNotFoundException {
        if (!path.equals("a.txt")){
            throw  new FileNotFoundException("文件路径不正确");
        }
    }
}


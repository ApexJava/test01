package Day05exception;

import java.io.FileNotFoundException;

public class trycatch02 {
    public static void main(String[] args)  {
        try {
            read("b.txt");}
        catch (FileNotFoundException e){
        }
        finally {
            System.out.println("超级无敌");
        }
        System.out.println("over");

    }

    public static void read(String path)throws FileNotFoundException {
        if (!path.equals("a.txt")){
            throw  new FileNotFoundException("文件路径不正确");
        }
    }
}


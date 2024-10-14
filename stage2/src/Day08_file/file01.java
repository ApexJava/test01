package Day08_file;

import java.io.File;

public class file01 {
    public static void main(String[] args) {
        String path01="D:\\java.txt";
        File file01=  new File(path01);

        String path02="D:\\a\\java02.txt";
        File file02= new File(path02);

        String parents = "D:\\a";
        String kids= "java03.txt";
        File file03= new File(parents,kids);

        File file = new File("D:\\AAA");
        String path04 = "java04.txt";
        File file04= new File(file,path04);

        System.out.println(file01.exists());
        System.out.println(file.isDirectory());
        System.out.println(file03.isFile());
    }
}

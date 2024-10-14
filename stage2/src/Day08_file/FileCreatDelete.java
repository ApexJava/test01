package Day08_file;

import java.io.File;
import java.io.IOException;

public class FileCreatDelete {
    public static void main(String[] args) throws IOException {
        File file01=  new File("aaa.txt");
        System.out.println(file01.exists());
        System.out.println(file01.createNewFile());
        System.out.println(file01.exists());
        System.out.println(file01.isFile());

        File file02 = new File("newdir\\newdirs");
        System.out.println(file02.mkdir());
        System.out.println(file02.mkdirs());

        System.out.println(file02.delete());
    }
}

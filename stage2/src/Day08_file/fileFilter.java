package Day08_file;

import java.io.File;
import java.io.FileFilter;

public class fileFilter {
    public static void main(String[] args) {
        File dir = new File("D:\\aaa");
        find(dir);

    }
    public static void find(File dir){
        /*File[] files =dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });

         */
        File[] files =dir.listFiles(f->
        {return f.getName().endsWith(".java")||f.isDirectory();});

        for (File file:files){
            if (file.isFile()){
                System.out.println("文件名："+file.getAbsolutePath());
            }else{
                System.out.println("目录："+file.getAbsolutePath());
                find(file);
            }
        }

    }
}

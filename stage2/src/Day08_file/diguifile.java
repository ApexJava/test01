package Day08_file;

import java.io.File;

public class diguifile {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        find(file);

    }

    public static void find(File file){
        File[] files = file.listFiles();
        for (File name :files) {
            if (name.isFile()) {
                if (name.getName().endsWith(".java")) {
                    System.out.println("文件名："+name.getAbsolutePath());
                    System.out.println("找到了！就是你，Java文件！");
                }
                } else {
                    System.out.println("目录：" + name.getAbsolutePath());
                    find(name);
                }
            }
        }
    }




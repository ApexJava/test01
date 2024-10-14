package Day11Severt_wangluobiancheng;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUpload_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动，等待连接...");
        ServerSocket ss = new ServerSocket(6666);
        while (true){
            Socket appect =ss.accept();

            new Thread(()->{
                try{
                //bis用于接受客户端发来的信息
                BufferedInputStream bis = new BufferedInputStream(appect.getInputStream());
                //bos用来接受之后写入服务器本地
                    FileOutputStream fos = new FileOutputStream("D:\\aaa\\" + System.currentTimeMillis() + ".jpg");
                    BufferedOutputStream bos = new BufferedOutputStream(fos);

               byte[] bs = new byte[1024*8];
               int len;
               while ((len=bis.read(bs))!=-1){
                   bos.write(bs,0,len);
               }
               //-----------数据回写----------
                    System.out.println("back..........");
               OutputStream out = appect.getOutputStream();
               out.write("上传成功！辛苦你了，客户端".getBytes());
               out.close();

               bos.close();
               fos.close();
               bis.close();
               appect.close();

                    System.out.println("文件已保存到本地！");

                }catch (IOException i){
                    i.printStackTrace();
                }
            }).start();
        }

    }
}

package Day10_Online;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器已在线，等待连接...");
        ServerSocket Serversocket = new ServerSocket(6666);

        while (true){
            Socket accept =Serversocket.accept();
            new Thread(()->{
                try {
                    BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
                    FileOutputStream fos = new FileOutputStream("D:\\copy.jpg");
                    BufferedOutputStream bos = new BufferedOutputStream(fos);

                    byte[] bs = new byte[1024*8];
                    int len;
                    while ((len =bis.read(bs))!=-1){
                        bos.write(bs,0,len);
                    }

                    //----------数据回写-----------
                    System.out.println("back.....");
                    OutputStream out = accept.getOutputStream();

                    out.write("已收到图片，感谢！".getBytes());
                    out.close();

                    bos.close();
                    bis.close();
                    accept.close();
                }catch (IOException i){
                    i.printStackTrace();
                }
            }).start();
        }
    }
}

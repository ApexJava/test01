package Day10_Online;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("收到，马上与您进行连接！");
        Socket socket = new Socket("localhost",6666);

        FileInputStream fis = new FileInputStream("D:\\text.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        byte[] bs = new byte[1024 * 8];
        int len;
        while ((len = bis.read(bs))!=-1){
            bos.write(bs,0,len);
        }

        socket.shutdownOutput();
        System.out.println("上传完毕！");

        //--------回写解析---------
        InputStream in =socket.getInputStream();
        byte[] back= new byte[50];
        in.read(back);
        System.out.println(new String(back));
        in.close();

        bis.close();
        socket.close();

    }
}

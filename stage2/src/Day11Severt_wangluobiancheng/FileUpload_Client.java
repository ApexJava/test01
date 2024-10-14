package Day11Severt_wangluobiancheng;

import java.io.*;
import java.net.Socket;

public class FileUpload_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",6666);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\text.jpg"));
        BufferedOutputStream bos =new BufferedOutputStream(socket.getOutputStream());

        byte[] bs = new byte[1024];
        int len;
        while ((len= bis.read())!=-1){
            bos.write(bs,0,len);
        }
        socket.shutdownOutput();
        System.out.println("客户端已发送完毕！");

        //-------------解析-------------
        InputStream in =socket.getInputStream();
        byte[] back = new byte[50];
        in.read(back);
        System.out.println(new String(back));

        in.close();
        bis.close();
        socket.close();

    }
}

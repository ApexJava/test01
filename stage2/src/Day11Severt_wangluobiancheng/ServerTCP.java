package Day11Severt_wangluobiancheng;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(6666);
        System.out.println("服务器端启动！等待连接...");
        Socket server = ss.accept();
        InputStream is= server.getInputStream();

        byte[] b = new byte[1024];
        int len = is.read(b);

        String msg = new String(b, 0, len);
        System.out.println(msg);

        //----------回写数据------------
        OutputStream out =server.getOutputStream();
        out.write("我很好！已接受！".getBytes());
        is.close();
        server.close();
        out.close();

    }
}

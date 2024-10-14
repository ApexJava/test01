package Day11Severt_wangluobiancheng;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClirentTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端发送数据");
        Socket client = new Socket("localhost", 6666);
        OutputStream os = client.getOutputStream();

        os.write("tcp,我来了".getBytes());

        //----------解析回写-----------
        InputStream in = client.getInputStream();
        byte[] b =new byte[1024];
        int len = in.read(b);
        String msg= new String(b,0,len);
        System.out.println(msg);
        os.close();
        client.close();
        in.close();

    }
}

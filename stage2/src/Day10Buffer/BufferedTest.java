package Day10Buffer;

import java.io.*;
import java.util.HashMap;

public class BufferedTest {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> listMap = new HashMap();

        BufferedReader br = new BufferedReader(new FileReader("D:\\luanxu.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\zhengxu.txt"));
        String line = null;

        while ((line = br.readLine())!=null){
            System.out.println(line);
            String[] split= line.split("\\.");
            listMap.put(split[0],split[1]);
        }
        br.close();
        for (int i=1;i<=listMap.size();i++){
            String key= String.valueOf(i);
            String value = listMap.get(key);
            bw.write(key+value);
            bw.newLine();
        }
        bw.close();
    }
}

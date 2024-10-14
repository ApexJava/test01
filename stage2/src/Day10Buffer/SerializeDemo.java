
/*package Day10Buffer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Student s= new Student();
        s.name="chd";
        s.address = "zhengzhou";
        s.age=20;

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\Student.txt"));
            out.writeObject(s);
            out.close();
            System.out.println("成功！");

        }catch (IOException i){
            i.printStackTrace();
        }
    }
}

 */

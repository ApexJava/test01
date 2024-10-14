package Day10Buffer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        Student s = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Student.txt"));
            s = (Student) in.readObject();
            in.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("未找到此文件！");
        } catch (IOException i) {
            i.printStackTrace();
        }
        System.out.println(s.name);
        System.out.println(s.address);
        System.out.println(s.age);
    }
}

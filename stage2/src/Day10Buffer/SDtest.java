package Day10Buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SDtest {
    public static void main(String[] args) throws IOException ,ClassNotFoundException{
        Student s1 = new Student("chd", "zhengzhou", 20);
        Student s2 = new Student("zhl", "puyang", 20);
        Student s3 = new Student("sias", "xinzheng", 2024);
        ArrayList<Student> arr= new ArrayList<>();
        Collections.addAll(arr, s1, s2, s3);
        //s(arr);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\manyS.txt"));
        ArrayList<Student> read = (ArrayList<Student>) in.readObject();

      for (int i =0;i<read.size();i++){
          Student s = read.get(i);
          System.out.println(s.name+"------"+s.address+"------"+s.age);
      }




    }

    public static void s(ArrayList<Student> arrayList)throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\manyS.txt"));
        out.writeObject(arrayList);
        out.close();
    }
}

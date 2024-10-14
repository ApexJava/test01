package Day03;

import java.util.HashSet;

public class DemoHashSet01 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student stu = new Student("chd",20);
        hs.add(stu);
        hs.add(new Student("zhl", 20));
        hs.add(new Student("sias", 20));
        hs.add(new Student("sias", 20));
        System.out.println(hs);

        System.out.println("**************");

        for (Student stu2: hs){
            System.out.println(stu2);
        }

    }
}

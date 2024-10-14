package Day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class exam01 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhl", 20));
        list.add(new Student("chd", 20));
        list.add(new Student("zhl", 18));
        list.add(new Student("kid", 8));
        list.add(new Student("sias", 2024));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int a = 0;
                a = o1.getAge() - o2.getAge();
                if (a == 0) a = o1.getName().charAt(0) - o2.getName().charAt(0);
                return a;
            }
        });

        for (Student a : list) {
            System.out.println(a);
        }
    }
}

package Day03;

import java.util.*;

public class linkhashlist01 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet();
        set.add(111);
        set.add(222);
        set.add(123);
        set.add(111);
        set.add(222);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        HashSet<Integer> simple = new HashSet<>();
        simple.add(111);
        simple.add(222);
        simple.add(123);
        simple.add(111);
        simple.add(222);
        System.out.println(simple);
    }
}

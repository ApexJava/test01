package Day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo02 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("nba");
        arr.add("cba");
        arr.add("abc");
        arr.add("snb");

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0)-o1.charAt(0);
            }
        });
        System.out.println(arr);

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0)-o2.charAt(0);
            }
        });
        System.out.println(arr);
    }
}

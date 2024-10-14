package Day04_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudent {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();
        map.put(new Student("chd",20),"郑州");
        map.put(new Student("zhl",20),"郑州");
        map.put(new Student("puyang",2024),"濮阳");

        Set<Map.Entry<Student,String>> entrySet = map.entrySet();
        for (Map.Entry<Student,String> entry : entrySet){
            Student s = entry.getKey();
            String v  = entry.getValue();
            System.out.println(s+v);
        }

        Set<Student> Keyset = map.keySet();
        for (Student key : Keyset){
            String v = map.get(key);
            System.out.println(key+v);
        }

    }
}

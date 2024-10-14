package Day04_Map;

import java.util.HashMap;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("chd",20);
        hm.put("zhl",20);
        hm.put("sias",2024);

        System.out.println(hm);

        /*
        hm.remove("sias");

        System.out.println(hm);

        System.out.println(hm.get("chd"));
        System.out.println(hm.get("sias"));

        System.out.println(hm);

         */

        Set<String> set = hm.keySet();
        System.out.println(set);
        for (String key :set){
            int v =hm.get(key);
            System.out.println(v);
        }
    }
}

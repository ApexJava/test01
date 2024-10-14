package Day04_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("chd",20);
        hm.put("zhl",20);
        hm.put("sias",2024);

        System.out.println(hm);

        Set<Map.Entry<String,Integer>> entrySet = hm.entrySet();

        for (Map.Entry<String,Integer> entry : entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"-"+value);
        }
    }
}

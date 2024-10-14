package Day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoList01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("chd");
        list.add("zhl");
        list.add("sias");
        /*

        //学完Collections工具类后
        Collections.addAll(list, "chd", "zhl", "sias");//添加元素
        Collections.shuffle(list);//打乱顺序
        Collections.sort(list);//按默认方法排序

         */


        System.out.println(list);

        list.add(0,"ws1");

        System.out.println(list);

        System.out.println(list.get(3));

        System.out.println("remove2");
        System.out.println(list.remove(2));

        System.out.println(list);

        //System.out.println(list.get(2));
        list.set(0,"set1");

        System.out.println(list);

        for (String s : list){
            System.out.println(s);
        }





    }

}

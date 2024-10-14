package Day04_Map;

import java.util.*;

public class exam01 {
    public static void main(String[] args) {
        //1.1 准备Map集合，放入每个数字对应一张牌
        Map<Integer, String> pokerMap = new HashMap<>();
        //1.2 创建AL集合，分别存放数字和花色
        ArrayList<String> number = new ArrayList<>();
        ArrayList<String> color = new ArrayList<>();
        Collections.addAll(number, "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
        Collections.addAll(color, "♣", "♠", "♦", "♥");
        //1.3 将数字和花色整合到一起
        //count为Map里的key
        int count = 1;
        pokerMap.put(count++, "🃏");
        pokerMap.put(count++, "🃏");
        for (String a : color) {
            for (String b : number) {
                //card为最后的牌面，即要存放到Map里的value
                String card = a + b;
                pokerMap.put(count++, card);
            }
        }
        //2.1 创建Set集合，card集合里放的是key，即count（Map里想要得到key必须用Set<E> KeySet方法）
        Set<Integer> card = pokerMap.keySet();
        /*
        注释为初级方法
        for (Integer key : card) {
            String v = pokerMap.get(key);
            System.out.println(v);
        }

         */

        /*List<String> poker = new ArrayList<>();
        for (Integer key : card) {
            String v = pokerMap.get(key);
            Collections.addAll(poker, v);
        }
        Collections.shuffle((poker));

        System.out.println(poker);

        System.out.println(poker.size());

         */
        //2.2创建一个AL集合，存入key （Set里的内容向AL集合中存放）
        ArrayList<Integer> numberlist=  new ArrayList<>();
        numberlist.addAll(card);
        //2.3 打乱key
        Collections.shuffle(numberlist);
        //3 完成3个玩家交替摸牌
        //3.1 创建3个玩家和底牌
        ArrayList<Integer> play01num = new ArrayList<>();
        ArrayList<Integer> play02num = new ArrayList<>();
        ArrayList<Integer> play03num = new ArrayList<>();
        ArrayList<Integer> dipainum= new ArrayList<>();
        //3.2 每个玩家摸到牌的编号（此时numberlist集合已被打乱）
        for (int i = 0; i < numberlist.size(); i++) {
            Integer key = numberlist.get(i);
            if (i >= 51) {
                dipainum.add(key);
            } else if (i % 3 == 0) {
                play01num.add(key);
            } else if (i % 3 == 1) {
                play02num.add(key);
            } else if (i % 3 == 2) {
                play03num.add(key);
            }
        }
        /*System.out.println(play01);
        System.out.println(play02);
        System.out.println(play03);
        System.out.println(dipai);
         */
        //4 三个AL集合里已经存放好了每个玩家摸到牌的编号，此时需要去看牌，即Key---Value
        ArrayList<String> play01card = new ArrayList<>();
        ArrayList<String> play02card = new ArrayList<>();
        ArrayList<String> play03card = new ArrayList<>();
        ArrayList<String> dipaicard = new ArrayList<>();
        //4.1 使用增强for去遍历Value

        for (Integer key :play01num ){
            String value =pokerMap.get(key);
            play01card.add(value);
        }
         for (Integer key :play02num ){
            String value =pokerMap.get(key);
            play02card.add(value);
        }
         for (Integer key :play03num ){
            String value =pokerMap.get(key);
            play03card.add(value);
        }
         for (Integer key :dipainum ){
            String value =pokerMap.get(key);
            dipaicard.add(value);
        }

        System.out.println(play01card);
        System.out.println(play02card);
        System.out.println(play03card);
        System.out.println(dipaicard);


    }
}


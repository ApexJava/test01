package Day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<String>();

        ArrayList<String> color = new ArrayList<String>();

        ArrayList<String> number = new ArrayList<String>();

        color.add("♣");
        color.add("♠");
        color.add("♦");
        color.add("♥");

        for (int i = 2; i <= 10; i++) {
            number.add(i + "");
        }

        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");

        for (int j = 0; j <= 3; j++) {
            for (int k = 0; k <= 12; k++) {
                String pk = color.get(j) + number.get(k);
                all.add(pk);
            }
        }



        all.add("🃏");
        all.add("🃏");

        for (String a :all){
            System.out.println(a);
        }

        Collections.shuffle(all);

        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> last = new ArrayList<String>();

        for (int i=0;i<=all.size()-1;i++){
            String s = all.get(i);
            if (i>=51){
                last.add(s);
            }else if (i%3==0){
                player1.add(s);
            }else if (i%3==1){
                player2.add(s);
            }else if (i%3==2){
                player3.add(s);
            }
            }

        System.out.println("1"+player1);
        System.out.println("2"+player2);
        System.out.println("3"+player3);
        System.out.println("底牌"+last);

        }

    }


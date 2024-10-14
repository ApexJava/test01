package Day03;

import java.util.LinkedList;

public class DemoLinkedlist01 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("zhl");
        ll.add("chd");
        ll.add("sias");

        ll.addFirst("ws1");
        System.out.println(ll);

        System.out.println(ll.pop());
        System.out.println(ll);

        ll.push("chd2");
        System.out.println(ll);

        System.out.println(ll.isEmpty());
        System.out.println(ll);
    }
}

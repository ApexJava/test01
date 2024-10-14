package Day06Thread;

public class windows02 {
    public static void main(String[] args) {
        Ticket02 t = new Ticket02();

        Thread t1 = new Thread(t,"窗口1");
        Thread t2 = new Thread(t,"窗口2");
        Thread t3 = new Thread(t,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

package Day06Thread;

public class windows {
    public static void main(String[] args) {
        Ticket t = new Ticket();


        Thread th1 =new Thread(t,"窗口1");
        Thread th2=new Thread(t,"窗口2");
        Thread th3 =new Thread(t,"窗口3");

        th1.start();
        th2.start();
        th3.start();

    }
}

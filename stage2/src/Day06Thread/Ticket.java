package Day06Thread;

public class Ticket implements Runnable {
    private int ticket = 100;
    Object A = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (A) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "------------" + ticket--);
                }
            }
        }
    }
}

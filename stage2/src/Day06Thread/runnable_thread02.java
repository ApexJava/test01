package Day06Thread;

public class runnable_thread02 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("main线程" + i);
        }
        new Thread( new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }).start();
    }
}

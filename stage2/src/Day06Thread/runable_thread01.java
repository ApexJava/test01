package Day06Thread;

public class runable_thread01 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("main线程" + i);
        }
         Runnable ra  = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        };
       Thread th = new Thread(ra,"新线程");
       th.start();

    }
}

package Day07wait_and_lambda;

public class eater extends Thread {
    private baozi bz;

    /*public eater(String name) {
        super(name);
    }

     */

    public eater(String name, baozi bz) {
        super(name);
        this.bz = bz;
    }



    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.state == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("有包子了，开吃！");
                bz.state = false;
                System.out.println("包子吃完了，再做！");
                bz.notify();
            }
        }
    }
}

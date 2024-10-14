package Day07wait_and_lambda;

public class baozipu extends Thread {
    private baozi bz;

    /*public baozipu(String name) {
        super(name);

    }

     */

    public baozipu(String name, baozi bz) {
        super(name);
        this.bz = bz;
    }



    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.state == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("开始造包子");

                count++;
                if (count % 2 == 0) {
                    bz.pi = "薄皮";
                    bz.xian = "羊肉";
                } else {
                    bz.pi = "厚皮";
                    bz.xian = "牛肉";
                }
                bz.state = true;
                System.out.println("包子做好了，请来吃"+bz.pi+bz.xian);

                bz.notify();
            }
        }
    }
}

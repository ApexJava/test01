package Day06Thread;

public class Ticket02 implements Runnable {
    private int Tickets = 50;

    @Override
    public void run() {
        while (Tickets>=0){
            try {
                sell();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void sell() throws InterruptedException {
        if (Tickets>0) {
                Thread.sleep(100);
                String name = Thread.currentThread().getName();
                System.out.println(name + "@@@@@@@@@@" + Tickets--);
            }
        }
    }

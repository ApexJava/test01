package Day06Thread;

public class thread01 {
    public static void main(String[] args) {
        myThread my = new myThread("新线程");
        my.start();
        for (int i =0;i<3;i++){
            System.out.println("main线程"+i);
        }
    }
}

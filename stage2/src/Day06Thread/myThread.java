package Day06Thread;

public class myThread extends Thread{

    public myThread(String name){
        super(name);
    }
    @Override
    public  void run(){
        for (int i=0;i<8;i++){
            System.out.println(getName()+i);
        }
    }
}

package Day07wait_and_lambda;

public class buy_sell {
    public static void main(String[] args) {
        //我很疑惑为什么构造方法里一定要有baozi，现在我尝试删掉构造方法里的baozi。
        /*
Exception in thread "gaoji" Exception in thread "chd" java.lang.NullPointerException: Cannot enter synchronized block because "this.bz" is null
	at Day07wait_and_lambda.baozipu.run(baozipu.java:22)
java.lang.NullPointerException: Cannot enter synchronized block because "this.bz" is null
	at Day07wait_and_lambda.eater.run(eater.java:20)

	发生了如上错误
        NullPointerException: Cannot enter synchronized block because "this.bz" is null
         */

        baozi baozi = new baozi();

        eater eat = new eater("chd",baozi);
        baozipu make = new baozipu("gaoji",baozi);

        make.start();
        eat.start();

    }
}

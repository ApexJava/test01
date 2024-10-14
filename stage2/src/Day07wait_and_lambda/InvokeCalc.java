package Day07wait_and_lambda;

public class InvokeCalc {
    public static void main(String[] args) {
        /*Calculator c =new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        };
        invoke(120,130,c);

         */
        invoke(120,130,(a,b)->a+b);


    }
    public static void invoke(int a,int b,Calculator calculator){
        int result= calculator.calc(a,b);
        System.out.println(result);
    }

}

package Day03;

public class kebiancanshu {
    public static void main(String[] args) {
        /*
        int [] arr1 = {1,4,6,10};
        int sum1 = getSum(arr1);
        System.out.println(sum1);

         */
        //使用可变参数方法
        int sum2 = getSum(1, 4, 6, 10);
        System.out.println(sum2);

        //System.out.println(getSum(1,4,6,10));


    }

    public static int getSum(int... arr) {
        int sum = 0;
        for (int a :arr){
            sum+=a;
        }
        return sum;
    }

    /*
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int a :arr){
            sum+=a;
        }
        return sum;
    }

     */


}

package Day05exception;

public class demo01 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        int index=4;
        int e = getSum(arr,index);

        System.out.println(e);

        System.out.println("over");

    }
    public static int getSum(int[] arr,int index){
        if (index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组越界异常");
        }
        int e = arr[index];
        return e;
    }
}

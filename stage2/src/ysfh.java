import java.util.Scanner;

public class ysfh {


        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);

            //总人数
            int n=in.nextInt();
            // 数到m的那个人出列
            int m=in.nextInt();
            // 初始化为0 都没有出去
            int [] arr=new int[n];

            //剩下的人数
            int peopleLeft=n;
            //初始化下标
            int index=0;
            // 下标计算器
            int count=0;
            // >0 出循环为负
            while (peopleLeft>1){
                if(arr[index]==0){
                    // count为计步器 不是下标指向
                    count++;
                    if(count==m){
                        arr[index]=1;
                        count=0;
                        peopleLeft--;
                    }
                }
                index++;
                if(index==arr.length){
                    index=0;
                }

            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==0){
                    System.out.println(i+1);
                }
            }
        }
    }


package 递归_查找_排序;

import java.util.Random;

public class 斐波那契数列 {
    static int n;
    public static void main(String[] args) {
        int Fibonacci [] = new int[1000];
        //递归可能会爆栈
         n = new Random().nextInt(1000)+1;
        System.out.println(n);
        //n为随机数
        System.out.println("方法一：");
        System.out.println(FibonacciSeries(n));    //我要求的是第n个斐波那锲数的值
        System.out.println("方法二：");
        int Fb[] = new int[n];
        Fb[0] = 1;
        Fb[1] = 1;
        for (int i=2;i<n;i++){
            if (n==1||n==2){
                System.out.println(1);
            }
            Fb[i] = Fb[i-1]+Fb[i-2];
        }
        System.out.println(Fb[n-1]);
    }


    //感觉斐波那锲数，也不是特别适合用递归来实现。
    static int FibonacciSeries(int x){          //x对应的就是n
        if (x==1)return 1;
        if (x==2)return 1;
        //因为先要深入到1000层，然后再开始回调
        if (x==n)return FibonacciSeries(x-1)+ FibonacciSeries(x-2);
        return  FibonacciSeries(x+1)+ FibonacciSeries(x+2);
    }
}

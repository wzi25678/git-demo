package 递归_查找_排序;

import java.util.Scanner;

public class 小白上楼梯 {
    //递归设计
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(AscendTheStairs(n));

    }
    public static int AscendTheStairs(int n){
        //一次可以上一阶，两阶，三阶
        /*
        1.递归函数：   f(n)有三种走法，走一步两步三步
        2.终止条件：   n==1时，只能有1种情况，n==2时，可以有两种情况，n==3时可以有三种情况
         */
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        if (n==3){
            return 3;
        }
        return AscendTheStairs(n-1)+AscendTheStairs(n-2)+AscendTheStairs(n-3);
    }

}

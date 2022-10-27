package 进制艺术;

import java.util.Random;
import java.util.Scanner;

public class 是不是2的整数次方 {
    public static void main(String[] args) {
        //用一条语句判断一个整数是不是2的整数次方
        Scanner sc = new Scanner(System.in);
        int N = new Random().nextInt(20)+1;
        System.out.println(N);
        System.out.println(Integer.toBinaryString(N));
        System.out.println(Integer.toBinaryString(N-1));
        System.out.println(Integer.toBinaryString((N-1)&N) );
        //如果一个数是二的整数次方，那么它的二进制里面只有一个数是1
        if(  (  (N-1)&N  )==0   ){      //和他自己减一相与，最后一位一定不同
            //逻辑运算，会默认转换成2进制去记性运算
            //采用的是，低位补齐，小端对应的比较方式。

            //判断对应的 二进制中是否只有一个  1
            System.out.println("是");
        }
        else{
            System.out.println("否");
        }
        System.out.println("==================================================");
    }
}

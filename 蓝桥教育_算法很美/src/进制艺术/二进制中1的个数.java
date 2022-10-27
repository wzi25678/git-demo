package 进制艺术;

import java.util.Random;

public class 二进制中1的个数 {
    //二进制除法   。分借位减1，count记录，和不借位减1。     除2实现位移
    public static void main(String[] args) {
        int a = new Random().nextInt(1000)+1;   //生成一个1-1000之间的随机数
        System.out.println("随机数："+a);
        //方法一：字符串比对法
        String str = Integer.toBinaryString(a);
        System.out.println(str);
        System.out.println("方法一：字符串比对法");
        //只能十进制转成二进制字符


        int count = 0;   //用于计算其中1的个数
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("=====================================================");
       count = 0;
       //方法二：除二法
        System.out.println("方法二：除二法");
        while(a!=0){
            if ((a%2)!=0){
                count++;
            }
                a/=2;
//            if (a==1){    //1%2==0余1
//                count++;
//                break;
            }
        System.out.println(count);
            }

    }


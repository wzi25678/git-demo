package 递归_查找_排序;

import com.sun.tools.javac.Main;

import java.util.Random;

//取名字也是有讲究的，不然导不了包
public class 阶乘 {
    public static void main(String[] args) {
        int n = new Random().nextInt(10)+1;
        System.out.println(n);
        //factor(n);            函数返回的是一个整型数
        //递归调用
        System.out.println(factor(n));
        //for循环
        int count = 1;
        for (int i=1;i<=n;i++){
            count*=i;
        }
        System.out.println(count);
    }
    static int factor(int x){
        if (x==1){
            return 1;
        }
        return  x*factor(x-1);
    }
}

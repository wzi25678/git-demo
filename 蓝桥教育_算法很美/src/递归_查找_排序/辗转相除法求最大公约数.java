package 递归_查找_排序;

import java.math.BigInteger;
import java.util.Scanner;

public class 辗转相除法求最大公约数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.gcd(b));
        sc.close();
        //两个数的积=最大公约数*最小公倍数
    }
    /*
    我求最大公倍数，应该会选择找出各自所有的约，然后再对各自倍数从大到小来比较找出其最大值
     */

}

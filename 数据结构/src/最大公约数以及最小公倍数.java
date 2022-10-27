import java.util.ArrayList;
import java.util.Scanner;

public class 最大公约数以及最小公倍数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //笨办法，暴力求解
        ArrayList array1 = new ArrayList();
        ArrayList array2 = new ArrayList();
        MaxCommonDivisor(a,b);
        LowestCommonMultiple(a,b);
    }
    public static int MaxCommonDivisor(int a,int b){
        for (int i=1;i<=a;i++){
            if (a%i==0){
                //a可以整除i，则i是a的公约数

            }
        }
        return 0;
    }
    public static int LowestCommonMultiple(int a,int b){
        return 0;
    }
}

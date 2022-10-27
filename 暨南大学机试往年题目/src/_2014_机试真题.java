import java.math.BigInteger;
import java.util.Scanner;

public class _2014_机试真题 {
    public static void main(String[] args) {

        /*1.求一个数N，视同递归求n！*/

        Scanner sc = new Scanner((System.in));

        int a = sc.nextInt();
       // BigInteger bi = new BigInteger("1");
        BigInteger count = new BigInteger("1");
        for (int i=1;i<=a;i++) {
            count=count.multiply(factor(BigInteger.valueOf(i)));
        }

        String str = String.valueOf(count);
       // int arr[] = new int[str.length()];
        int zero = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) - 48 ==0) {
                //System.out.println(str.charAt(i));
                zero++;
            } else {
               // System.out.println(str.charAt(i));
                System.out.println(zero);
                return;
            }
        }
    }
    public static BigInteger factor(BigInteger num){
        if(num.compareTo(BigInteger.ONE)==0||num.compareTo(BigInteger.ZERO)==0) return BigInteger.ONE;
        //如果获取的大数为0/1，则返回给它1
        return num.multiply(factor(num.subtract(BigInteger.ONE)));
    }

    }

//给定n和m以及p，保证n>=m，求(n!-m!)对p取余的结果。
     /*   double n = sc.nextInt();
        double m = sc.nextInt();
        double p = sc.nextInt();
        System.out.println(String.format("%.0f",(factor(n)-factor(m))%p));*/

// double a = sc.nextDouble();
      /* int a = sc.nextInt();
        BigInteger bi=new BigInteger("1");
       //double n = 1;
       for (int i=1;i<=a;i++){
           bi=bi.multiply(new BigInteger(String.valueOf(i)));   //bi等于      (bi*i)
       }
       // System.out.println(String.format(String.valueOf(bi)));
        String str =   String.valueOf(bi);     //String.valueOf  将整型数值转化成字符型的数字组
        //要的是最右边那个非0数字
        int arr[] = new int[str.length()];
        for (int i=0;i<str.length();i++){
            arr[i] = (str.charAt(i)-48);
        }
        for (int i=str.length()-1;i>=0;i--){
            if (arr[i]!=0){
                System.out.println(arr[i]);
                return;
            }
        }*/

/*for (int i=1;i<=100000;i++){
            int sum = 0,sum1=1;
            //转成字符串类型
            String s = String.valueOf(i);   //把i转化成字符串类型
            char c[] = s.toCharArray();   //把s中的字符按顺序存入一个字符数组c中
            int a[] = new int[c.length];
            for (int j=0;j<c.length;j++) {
                a[j] = c[j] - '0';      //再把字符数组转化成整型数组
                for (int k=0;k<a.length;k++){    //算每个位的阶乘
                    for (int z = 1;z<=a[k];z++){
                        sum1*=z;
                    }
                    sum+=sum1;
                }
                //----------------------------------------------进行判断
            if(sum==i){

            }
            }
        }
        //System.out.println(factor(i));   //递归解决
    }
    /*
    public static long factor(int i){
        if (i==1)return 1;
        return i*factor(i-1);
    }
*/
     /*public  static double factor(double x){
        //非void类型要返回值
       double  count = 1;
       for (int i=1;i<=x;i++){
              //计算出i的阶乘
           count*=i;
       }
       return count;
    }

}*/

/*
    public static double jiecheng(int x){
        double num = 1;
        for (int i=1;i<=x;i++){
            num*=i;
        }
        return num;
    }*/      /*
        int k = sc.nextInt();
       /* double num = 1;
        double count = 0;
        //double的精度更高
        for (int j=1;j<=30;j++){
            for (int i=1;i<=j;i++){
                num = num*i;
            }
            count+=num;
            num = 1;

        }*/
//小数情况下的阶乘
       /* System.out.printf("sum=%.5f",fact(k));
       /* System.out.printf("%.2e",count);   //.2f是保留两位小数*/
//.2e则是保留两位科学计数法下的小数
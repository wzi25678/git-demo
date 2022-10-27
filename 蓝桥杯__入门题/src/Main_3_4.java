import java.util.ArrayList;
import java.util.Scanner;

public class Main_3_4 {
    public static void main(String[] args) {
       {
            Scanner sc = new Scanner(System.in);
       /* int n=0,m=0;
       // xushu x = new xushu();
        int shibu = 0;int xubu = 0;
        for (int i=0;i<10;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            shibu+=a;
            xubu+=b;*/
       /* int count = sc.nextInt();
        //定义sum变量后面用来求和
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int input = sc.nextInt();
            sum += input;
        }
        System.out.println(sum/count);
*//*
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i=a;i<=b;i++){
            if (i%c==0&&i>=c){
                System.out.print(i+" ");
            }
        }
    }
} *///System.out.println(shibu+"+"+xubu+"i");
/*class xushu{
    int shibu;
    int xubu;
}*/


        }
       Scanner sc = new Scanner(System.in);
       // ArrayList array = new ArrayList();
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = i+1;
        }
        int num=0;
        int count = 0;  //计数淘汰人数
        for (int i=0;;i++)//死循
            {

                if (arr[i]!=0){
                    num++;
                }

            if (num%3==0){
                arr[i]=0;
                num = 0;
                count++;
            }
            if (count==n-1){   //当只剩一个人的时候
                for (int k=0;k<n;k++){
                    if (arr[k]!=0){
                        System.out.println(k+1);
                        return;
                    }
                }
                }
                if (i==n-1){
                    i=-1;
            }

        }

        /*        //给每个集合元素都赋值1
        while(array.)
        //使用集合来进行操作

       //
        /*int a = n / 100;    //n的百位
        int amod = n % 100;    //剩余的十位数
        int b = amod / 10;    //n的十位
        int c = amod % 10;
        System.out.println(c+" "+b+" "+a);*/
       /* for(int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }*/


    }
}
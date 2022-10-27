import java.awt.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//            switch(n)
//            {
//                case 12:case 1 :case 2:
//                System.out.println("Winter");break;
//                case 3: case 4: case 5:
//                System.out.println("Spring");;break;
//                case 6: case 7: case 8:
//                System.out.println("Sunmer");;break;
//                case 9: case 10: case 11:
//                System.out.println("Autumn");;break;
//            }
//       // String num = sc.nextLine();
//        //打印pascal三角型
//        int arr[][] = new int[n+1][n+1];
//        for(int i=0;i<arr.length;i++){
//            for (int j=0;j<=i;j++){
//                if (j==0||j==i){
//                    arr[i][j]=1;
//                }
//                else {
//                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
//                }
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            for (int j=i;j<n;j++){
//                System.out.print(" ");
//            }
//            //打印前置的空格的数量
//            for (int j=0;j<=i;j++){
//                System.out.printf("%3d   ",arr[i][j]);
//            }
//            //打印存在的实际的数目，并且用的%3d来统一化他们的精度
//            System.out.println();
//        }
//        int c = a.charAt(0);    //字符是对的，每个字符都会对应一个ASCII码
//        char b = a.charAt(0);
//        System.out.println(c);
//        System.out.println(b);


//      char a = sc.next().charAt(0);     //以防万一而已，获取输入的字符的首字母
//       int b = sc.nextInt();
//       float c = sc.nextFloat();
        //      double d = sc.nextDouble();
        //       System.out.println(String.format("%.3f",d));
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.printf("%-8d%-8d%-8d",a,b,c);

        //整型用d，浮点型用f
        //妙三多一针 120，狂犬疫苗一针 100
        //先接种三针妙三多，然后再打狂犬疫苗
        //汪汪身上的钱只有 a 元,汪汪每个月能够攒 b 元，请问汪汪可以按时接种多少针？
//         while (sc.hasNext()){
//
//             int num = 0;  //按时打针次数
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//             for (int i=0;i<4;i++){   //最多打四针
//                if (a>=120)  num++;
//                    //只要有一次没有按时，那么后面就都不可能按时，因为打针一个月只能打一次
//                else {
//                    System.out.println(0);
//                }
//                a = (a-120+b);
//            }
//            System.out.println(num);
//
//        }
//        int n = sc.nextInt();
//        int bug = 0;
//        int count = 0;
//        for (int i=1;i<=n;i++){
//            bug = 2*bug +1;
//            count = count+bug;
//        }
//        System.out.println(count);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        String c = sc.nextLine();
//        String d = sc.nextLine();
//        String e = sc.nextLine();
//        int a1 = a.length();
//        int b1 = b.length();
//        int c1 = c.length();
//        int d1 = d.length();
//        int e1 = e.length();
//
//        int arr [] = {a.length(),b.length(),c.length(),d.length(),e.length()};
//        int max = arr[0];
//        for (int i=1;i<5;i++){
//            if (arr[i]>max){
//                max = arr[i];
//            }
//        }
//     if (max==a.length()){
//         System.out.println(a);
//     }
//        if (max==b.length()){
//            System.out.println(b);
//        }
//
//        if (max==c.length()){
//            System.out.println(c);
//        }
//
//        if (max==d.length()){
//            System.out.println(d);
//        }
//
//        if (max==e.length()){
//            System.out.println(e);
//        }
//
        //设计一个函数，使得给出一个16位整数的原码，能够得到该数的补码。
        //获取一个十六位的字符
//        if (num.charAt(0)=='0') {
//            //正数的原反补相同
//            System.out.println(num);
//            return;
        //位运算

    }
}
//        String x="";//记录反码
//        x+=num.charAt(0);//符号位不变
//        for(int i=1;i<num.length();i++){
//            x+=(num.charAt(i)-'0')^1;//数值位按位取反(与1异或运算)
//            //原来是1，^1后为0
//            //原来是0，^1后为1
//        }
//        int a=Integer.parseInt(x,2);//转为十进制数
//        a++;//加1，就得到补码的十进制数
//        System.out.println(Integer.toBinaryString(a));//输出补码的二进制数

//        String x = "";   //记录下反码    //字符串会读取空格位，傻鸟
//        x+=num.charAt(0);//负数，符号位不变，其他位取反加1
//        for (int i=1;i<num.length();i++){     //
//            x+=(num.charAt(i)-'0')^1;    //按位取反即对0或1进行异或
//        }
//        int z  = Integer.parseInt(x,2);
//        z++;
//        System.out.println( (Integer.toBinaryString(z)));   //转换成2进制


//    }
//
//}
/*
public class Main {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String num=cin.next();
        if(num.charAt(0)==1){//正数，直接输出
            //正数的原码==反码==补码
            System.out.println(num);
        }
        else{//负数，先求反码，然后反码+1，即是补码
            String x="";//记录反码
            x+=num.charAt(0);//符号位不变
            for(int i=1;i<num.length();i++){
                x+=(num.charAt(i)-'0')^1;//数值位按位取反(与1异或运算)
                //原来是1，^1后为0
                //原来是0，^1后为1
            }
            int a=Integer.parseInt(x,2);//转为十进制数
            a++;//加1，就得到补码的十进制数
            System.out.println(Integer.toBinaryString(a));//输出补码的二进制数
            //Integer.toBinaryString(a):将十进制数a转为二进制数
        }
    }
}
            */
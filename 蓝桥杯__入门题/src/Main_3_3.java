import java.util.ArrayList;
import java.util.Scanner;

public class Main_3_3 {
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        String str=sc.nextLine();//123456.789|a
        //获取索引为0 1 2的数字（1 2 3）
       int  a=Integer.valueOf(str.substring(0,3)).intValue();
        //获取三个数，第一个为整数

       // int a = Integer.valueOf(str.substring(0,3));
        //实现a的左对齐八个字符
       // System.out.printf("%-8d|",a);
        //获取索引为3 4 5 6 7 8的数字（4 5 6 . 7 8）
        //double只有一位小数，b原本获取的数字为456.78
        //输出使使用%8.1f，四舍五入只取一位小数则为456.8
        double b=Double.valueOf(str.substring(3,9)).doubleValue();
        //索引为11的字符（a）
        String d=str.substring(11, 12);
        //%-8d表示整数类型的数字后有8位，%8.1f表示浮点数类型的数字前有8位并四舍五入取一位小数，%s输出字符串类型
        System.out.printf("%-8d|%8.1f|%s",a,b,d);//123     |   456.8|a
*/
        /*
        System.out.println("  " +
                "Nine-by-nine Multiplication Table\n" +
                "--------------------------------------\n" +
                "     1   2   3   4   5   6   7   8   9\n" +
                "--------------------------------------\n" +
                " 1   1\n" +
                " 2   2   4\n" +
                " 3   3   6   9\n" +
                " 4   4   8  12  16\n" +
                " 5   5  10  15  20  25\n" +
                " 6   6  12  18  24  30  36\n" +
                " 7   7  14  21  28  35  42  49\n" +
                " 8   8  16  24  32  40  48  56  64\n" +
                " 9   9  18  27  36  45  54  63  72  81\n" +
                "--------------------------------------");*/
        /*
         n = sc.nextInt();
        for (int i=2;i<=n/2;i++) {
            //从2开始遍历所有到n的数
        if (isZhishu(i)){
            if(isSUshu(i)){
                System.out.print(i+" ");
            }
        }
        }*/
        /*
        ArrayList<String>list = new ArrayList();
      //  String [] s = new String[N];
        //String add;
        //第一个循环实现全部添加
        for (int i=0;i<N;i++){
            String a = sc.next();
            list.add(a);
            }
        //第二个循环实现打印显示
        for (int i=0;i<N;i++){
            if (list.get(i).equals("WYS")){
                System.out.println("KXZSMR");
            }
            else if (list.get(i).equals("CQ")){
                System.out.println("CHAIQIANG");
            }
            else if(list.get(i).equals("LC")){
                System.out.println("DRAGONNET");
            }
            else if((list.get(i).equals("SYT"))||(list.get(i).equals("SSD"))||(list.get(i).equals("LSS"))||(list.get(i).equals("LYF")))
            {
                System.out.println("STUDYFATHER");
            }
            else {
                System.out.println("DENOMINATOR");
            }
        }*/
        /*
        System.out.println("--------------------------------------------------- \n" +
                "COUNTRY          AREA(10K  km2)    POP.(10K)    GDP(Billion$) \n" +
                "--------------------------------------------------- \n" +
                "China                            960.00    129500.00    1080.00 \n" +
                "Iceland                          10.30            27.57    8.20 \n" +
                "India                            297.47      97000.00    264.80 \n" +
                "Madagascar                    62.70        1635.00    3.60 \n" +
                "Maldive                        0.0298            27.80    0.23 \n" +
                "--------------------------------------------------- "
        );*/
        /*
        int[][] item = new int[3][4];
        int max = 0;
        int index = 0;
        int rows = 0;
        for (int i = 0; i < item.length; i++) {
            for (int j = 0; j < item[i].length; j++) {
                item[i][j] = scanner.nextInt();
                if (item[i][j]<0)
                {
                    item[i][j]=-item[i][j];
                }
                if (max<item[i][j]) {//絕對值
                    max = item[i][j];//只会存进第一个最大值
                    index = j;
                    rows = i;
                }
            }}
        System.out.println(max + " " + (rows + 1) + " " + (index + 1));*//*
        //输入数据仅一行，
        // 包括两个整数k(100< =k< =10000)、n(1< =n< =48)和一个小数p(0.001< =p< =0.01)，
        // 分别表示每月存入的金额、存款时长、存款利息。
        int k = sc.nextInt();     //存入的金额
        int n = sc.nextInt();     //存入的月份
        double p = sc.nextDouble();     //存款利息
        double gain = 0;
        for (int i=1;i<=n;i++){
            gain+=(i*k+gain)*p;
        }
        System.out.printf("%.2f",gain-0.005);

    }
}*/
/*
        int n = sc.nextInt();   //n代表行数
        int m = sc.nextInt();   //m代表两者的间距
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for (int j=0;j<m;j++){
                System.out.print(" ");
            }
            for (int j=2*(n-i)-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }*/
/*
class fushu{
    int shoubu;  //首部
    int xubu;  //虚部
}*//*
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int arr [] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if (arr[i]<=m+30){
                count++;
            }
        }
        System.out.println(n-count);
    }*/
        //判断i是否为质数
    /*
    public static boolean isZhishu(int i){
        if (n%i==0){
            //只要n能够整除i就说明i是质数
            return true;
        }
        else
            return  false;

    }
    //判断i是否为素数
    public static boolean isSUshu(int i){
        for (int j=2;j<=i/2;j++){      //for循环要进行初始化以及第二个判断，才会进入循环体
            //素数只能写成1和自己相乘，那么必然不可能写成其他的乘积
            if (i%j==0&&i!=j){
                return false;
            }
        }
        //一半的数里面都找不到满足条件的数
        return true;*/
        String s = sc.nextLine();
        int count = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                System.out.println(i+1);
                return;
            }

            }
            System.out.println(0);
            return;
        }
        //System.out.println(count);

    }





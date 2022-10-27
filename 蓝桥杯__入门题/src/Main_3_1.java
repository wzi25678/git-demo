import java.util.ArrayList;
import java.util.Scanner;
//写一函数，输入一个四位数字，要求输出这四个数字字符，但每两个数字间空格。如输入1990，应输出"1 9 9 0"。
/*
public class Main_3_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for(int i=m;i<=n;i++){
            int receive = isprime(i);
            count +=receive;
        }
        System.out.println(count);
    }
    public  static int isprime(int x){
        if(x==1){
            return 0;
        }
        if(x==2){
            return 2;
        }
            for(int i=2;i<x;i++){
                if (x%i==0 ) {     //一个数在他之前一半都找不到mod  2~n-1可以整除的数，那它一定是素数。
                    return 0;
                }
            }
        return x;

    }
}*/
/*
class student{
    int id;   //即前面的数字序号
    int grade;  //对应成绩
}*/
/*
    public static void Average(student arr[]){    //student类型的int方法
        int average = 0;
        //算平均分one
        for(int i=0;i<arr.length;i++){
            average+=arr[i].one;
        }
        System.out.print(average = average/arr.length);
        System.out.print(" ");

        //算平均分two
        average = 0;
        for(int i=0;i<arr.length;i++){
            average+=arr[i].two;
        }
        System.out.print(average = average/arr.length);
        System.out.print(" ");
        //算平均分three
        average = 0;
        for(int i=0;i<arr.length;i++){
            average+=arr[i].three;
        }
        System.out.print(average = average/arr.length);
        System.out.println();
    }

    public static void  show(student arr[]){
        int index = 0;   //锁定最高分的位置
        int count = 0;  //计较得出最高分
        for(int i=0;i<arr.length;i++){
            if(arr[i].one+arr[i].two+arr[i].three > count){
                count = arr[i].one+arr[i].two+arr[i].three;  //把分值赋给count
                index = i;   //告知index其位置
            }
        }
        System.out.println(arr[index].id+" "+arr[index].name+" "+arr[index].one+" "+arr[index].two+" "+arr[index].three);
    }


        }
class student{    //此后就有一个student类型的结构体了
    String id;
    String name;
    //三科成绩
    int one;
    int two;
    int three;
}*//*
                int n = sc.nextInt();
                int compare = 1;
                int arr[] = new int [n];
        for (int i = 0; i < arr.length; i++) {//存数据
            arr[i] = i+1;
        }
        while(n!=1){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    //说明这个位置的人还没有被淘汰
                    if(compare ==3){
                        arr[i] = 0;
                        n--;
                        compare = 0;
                    }
                    compare++;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=0)
                System.out.println(arr[i]);
            }

                //输入10个整数，将其中最小的数与第一个数对换，把最大的数与最后一个数对换。
                // 写三个函数； ①输入10个数；②进行处理；③输出10个数。
                //String n=scanner.nextLine();
              /*  int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();*//*
        //有一字符串，包含n个字符。
        // 写一函数，将此字符串中从第m个字符开始的全部字符复制成为另一个字符串。
        int n = sc.nextInt();
        sc.nextLine();
        char [] arr = new char [n];
        String a = sc.nextLine();   //输入一个字符串类型
        if(a.length()!=n){
            System.out.println("输入错误！");
            return ;
        }
        //确保符合指定格式
        for(int i=0;i<n;i++){
            arr[i] = a.charAt(i);
        }
        //把字符串保存到字符数组中
        int b = sc.nextInt();
        for(int i=b-1;i<n;i++){
            System.out.print(arr[i]);
        }*//*int n = sc.nextInt();
        sc.nextLine();  //吸收整型与字符串类型之间的空格符
        String [] st = new String[n];   //构造一个String类型的数组
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            st[i] = str.replaceAll(" ",",");
            //st[i]里面保存str输入的内容，同时str内部将所有的“ ”（空格） 替换成“ ， ”
        }
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }*//*
        int n = sc.nextInt();           //获取一共有多少个数据
       student  [] arr = new student[n] ;
       //定义一个student结构体类型的数组
        //每个学生要包含五种信息，所以得存储的时候就用不同的数组存储起来，同时她们又要属于同一个人，所以要定义一个
        //学生类
        for(int i=0;i<arr.length;i++){
            //循环体录入所有信息
            arr[i] = new student();  //把该arr[i]放入结构体中
            arr[i].id = sc.next();
            arr[i].name = sc.next();
            arr[i].one = sc.nextInt();
            arr[i].two = sc.nextInt();
            arr[i].three = sc.nextInt();
        }
        //要求一： 打印平均分
        Average(arr);

        //要求二： 输出总分最高的学生的所有信息
        show(arr);*//*
        int n = sc.nextInt();
        int m = sc.nextInt();
        student arr [] = new student[m+n];
        //录入成绩
        for(int i = 0;i<m+n;i++){
            arr[i] = new student();
            arr[i].id = sc.nextInt();
            arr[i].grade = sc.nextInt();
        }
        //进行升序排序
        int temp; //用作对id的交换
        int temp1; //用作对grade的交换
        for (int i=0;i<m+n;i++){
            for (int j=0;j<i;j++){
                if(arr[j].id>arr[i].id){
                    temp = arr[i].id;
                    temp1 = arr[i].grade;
                    arr[i].id = arr[j].id;
                    arr[i].grade = arr[j].grade;
                    arr[j].id = temp;
                    arr[j].grade = temp1;
                }
            }
        }
        for (int i=0;i<m+n;i++){
            System.out.println(arr[i].id+" "+arr[i].grade);
        }*//* int arr[] =new int [10];
        int count = 0;
        int num = 0;
        for(int i =0;i<10;i++){
            arr[i] = sc.nextInt();
            count +=arr[i];
        }
        double average = count /10;
        for(int i =0;i<10;i++){
            if(arr[i]>average){
                num++;
            }
        }
        System.out.println(num);*/









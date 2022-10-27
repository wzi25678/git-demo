import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int n  = sc.nextInt();
        int arr [] = new  int[n];
        for (int i=0;i<n;i++){
            arr[i] = 1;
        }   //给所有元素一个初值，用来模拟是否退场
        int count = 0;  //用来检测剩余元素
        int num =0;
        int i=0;
        while(count<n-1){   //即当已经有n-1个人退场是，场上就剩下一个人时退出循环
            if (arr[i]!=0){
                num++;    //报数
                if (num%3==0){    //此时报数得到了3
                    arr[i] = 0;
                    num = 0;
                    count++;
                }
                if(i==n-1){
                    i=-1;
                }
                i++;
            }
//-------------------------------------------------------------------------------------
            else{     //arr[i]==0,即已经淘汰的无意义的人
                if(i==n-1){
                    i=-1;
                }
                i++;
            }
    }
        for (int j=0;j<n;j++){
            if (arr[j]!=0){
                System.out.println(j+1);
            }
        }
*/
        /*
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Student ListA [] = new Student[n];
        Student ListB [] = new Student[n];
        for (int i=0;i<n;i++){
            ListA[i].StuId = sc.next();
            ListA[i].grade = sc.next();
            sc.nextLine();
        }
        for (int i=0;i<m;i++){
            ListB[i].StuId = sc.next();
            ListB[i].grade = sc.next();
            sc.nextLine();
        }
        //循环遍历，使重复学号为0
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (ListA[i].StuId ==ListB[i].StuId){
                    ListA[i].StuId = "0";
                }
            }
        }
        for (int i=0;i<n;i++){
            if (ListA[i].StuId!="0" ){
                System.out.print(ListA[i].StuId+" "+ListA[i].grade);
                System.out.println();
            }
        }

*//*
        int a = sc.nextInt();
        String m = Integer.toBinaryString(a);   //将a转化成二进制表示的数字字符
        String s = m.substring(m.length()-7,m.length()-4);
        //把该字符串截取下来之后，转化成
        *//*
        //不知道多少行就用hasNext
        int count=0;

        while(sc.hasNext()){
             s = sc.nextLine().split(".");
            if (s[0].equals("End of file")){
                break;
            }
            count++;
        }
        String s[] = new String[0];

        for (int i=0;i<4;i++){
            if (count==0){
                return;
            }
            //进行字符串数值匹配
          int a = Integer.valueOf(s[i]);
            count--;
        }*/
       // 给定两个数N和K, 要求计算包含N位数字的有效K-进制数的总数.
       /* int N = sc.nextInt();
        int K = sc.nextInt();*/
        /*
        String a  = sc.nextLine();
        System.out.println("  "+a+"  ");
        System.out.println(" "+a+a+a+" ");
        System.out.println(a+a+a+a+a);

*/
        int arr[] = new int[59];
        int count = 0;
        for(int i=0;i<57;i++){
            arr[i] = sc.nextInt();
            count+=arr[i];
        }
        System.out.println(count);
        double b = count/57;
        System.out.println(b);
    }}








/*
class Student{
    String StuId;
    String grade;
}*/

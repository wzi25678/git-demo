import java.util.Scanner;

public class 偶数求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();   //有一个长度为n(n<=100)的数列
            int m = sc.nextInt();   //每m个数求出一个平均值
            //sc.nextLine();
            int arr[] = new int[n];
            int initial = 2;    //数列初始值
            for (int i=0;i<n;i++){
                arr[i] = initial;
                initial+=2;         //
            }
            //构造等差数列
            int longth = (n%m);    //用longth记录n的长度
            int k=0;    //用k来记录轮数
          for (int i=0;n>longth;i=i+m){
              int count = 0;
              for (int j=i;j<(i+m);j++){
                  count+=arr[j];
              }
              int average = count/m;
              System.out.print(average+" ");
              n=(n-m);
              k++;
          }
          if(longth!=0){
              int count = 0;
              for (int i=k*m;i<arr.length;i++){
                  count+=arr[i];
              }
              int average = count/(arr.length-(k*m));
              System.out.println(average);
          }


        }


    }
}

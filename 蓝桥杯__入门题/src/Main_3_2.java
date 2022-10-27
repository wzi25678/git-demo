import java.util.Scanner;
/*
public class Main_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        {/**/
            //Scanner sc = new Scanner(System.in);
        /*
        String fuhao = sc.next();
        switch (fuhao){
            case "+" :
                System.out.println(a+b);
                break;


            case "-" :
                System.out.println(a-b);
                break;



            case "*" :
                System.out.println(a*b);
                break;


            case "/" :
                System.out.println(a/b);
                break;



            case "%" :
                System.out.println(a%b);
                break;
*//*
        //两个数，范围为{0,1,2}，用空格隔开
        // 0表示石头，1表示布，2表示剪刀。这两个数分别表示两个人所说的物品。
        if(a==0){
            if(b==0){
                System.out.println(0);
                return ;
            }
            else if(b==1){
                System.out.println(-1);
                return;
            }
            else {
                System.out.println(1);
                return;
            }
        }

        if(a==1){
            if(b==0){
                System.out.println(1);
                return ;
            }
            else if(b==1){
                System.out.println(0);
                return;
            }
            else {
                System.out.println(-1);
                return;
            }

        }
        if(a==2){
            if(b==0){
                System.out.println(-1);
                return ;
            }
            else if(b==1){
                System.out.println(1);
                return;
            }
            else {
                System.out.println(0);
                return;
            }

        }*//*
        int n = sc.nextInt();
        int arr[][] = new int[n+1][n+1];   //构造一个n+1维数组
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<=i;j++){
                //杨辉三角型主要观察规律
                if(j==0||j==i){
                    arr[i][j] =1;
                }
                else{
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<n;j++){    //越在上面，“  ”间距越大
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.printf("%3d ",arr[i][j]);
            }
            System.out.println();
        }*//*
        //求解方程ax2+bx+c=0的根。要求a,  b,  c由用户输入，并且可以为任意实数。
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        //Math.sqrt是开根号的情况
        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        if (x1 > x2) {
            System.out.print(String.format("%.2f", x1) + " ");
            System.out.print(String.format("%.2f", x2));
        } else {
            System.out.print(String.format("%.2f", x2) + " ");
            System.out.print(String.format("%.2f", x1));
        }*/
        /*double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = ((-b)/a);
        System.out.println(String.format("%.2f",x));*/
       // }
       /* for(int i=1;i<1000;i++){
            for (int j=i;j<1000;j++){
                for(int k=j;k<1000;k++){
                    if(i+j+k<=1000 && i<j&&j<=k ){
                       if (i*i+j*j==k*k){
                           System.out.println(i+" "+j+" "+k);
                       }
                    }
                    else break;
                }
            }
        }*//*
        String n = sc.nextLine();
        String a[] = n.split(" ");
        System.out.println(a.length);*/

/*

}
*/
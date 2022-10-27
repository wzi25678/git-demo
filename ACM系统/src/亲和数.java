import java.util.Scanner;

public class 亲和数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        for (int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int counta = 0;   //用来计算所有a的亲和数之和
            int countb = 0;   //用来计算所有b的亲和数之和
            for (int j=1;j<a;j++){
                if ((a%j)==0){
                    counta+=j;
                }
            }
            for (int j=1;j<b;j++){
                if ((b%j)==0){
                    countb+=j;
                }
            }
            if (counta==b && countb==a){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

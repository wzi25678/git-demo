import java.util.Scanner;

public class 动态规划_数字三角形 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int test = sc.nextInt();   //测试次数
//        int N = sc.nextInt();      //三角型的行列数
//        int dp[][] = new int[N][N];   //构造数组
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j <= i; j++) {
//                dp[i][j] = sc.nextInt();
//            }
//        }
//        //用数组记录元素的值
//        //一个循环，用于录入元素
//        for (int i = N - 2; i > 0; i--) {
//            for (int j = 0; j <= i; j++) {
//                dp[i][j] = dp[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
//                //最后一行数字是不会改变的，
//            }
//        }
//        System.out.println(dp[0][0]);
//    }
//}
//    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //for (int b = 0; b < a; b++) {
            int n = sc.nextInt();
            int[][] dp = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    dp[i][j] = sc.nextInt();
                }
            }
            for (int i = n - 2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    //从下往上，把每一层的最大情况都给找出来！
                    dp[i][j] += Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
                }
            }
            System.out.println(dp[0][0]);
        //}
    }
}


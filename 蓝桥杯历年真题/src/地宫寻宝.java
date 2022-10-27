import java.util.Scanner;


public class 地宫寻宝 {
    //构造全局变量，因为要传递到构造方法中
    static int n;//行
    static int m;//列
    static int k;//需取数
    // static int mod = 1000000007;//取余值
    // static int dp[][][][] = new int[50][50][15][15];//x,y,已取数,最大价值
    static int map[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        //n行m列
        map = new int[n][m];
        int k = sc.nextInt();    //需去宝贝数
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
                //给地图里放好宝贝
            }
        }
        //--------------------------------------------------截断
        //走过某个格子时，如果那个格子中的宝贝价值比小明手中任意宝贝价值都大，
        // 小明就可以拿起它（当然，也可以不拿）。
        System.out.println(dfs(0, 0, 0, -1));
        //dfs(x,y,c,priceMax)   （x，y）为小明位置，c为当前拿的数量，price为当前宝物的最大价值

    }

    public static int dfs(int x, int y, int c, int price) {
        if (x >= n || y >= m || c > k) {   //递归终止条件
            return 0;
        }
        int count = 0;   //表示当前拿到的数量
        int priceMax = map[x][y];  //当前的最大宝贝数字
         if(c==k||(count==k-1&&price>priceMax)) {
            return 1;
        }
        if (priceMax > price) {    //如果大于手中最高价值，且拿
            dfs(x + 1, y, c + 1, priceMax);
            dfs(x, y + 1, c + 1, priceMax);   //走右边
        } else {    //不大于，或者不拿
            dfs(x + 1, y, c, price);   //走下面
            dfs(x, y + 1, c, price); //走右边
        }
        count+=dfs(x+1,y,c,price);
        count+=dfs(x,y+1,c,price);
        return count;
    }
}

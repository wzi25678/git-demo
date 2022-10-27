package 第三章;

import java.util.Scanner;

public class 前K个数 {
    static int [] heap;
    static int size = 0;
    static int k;
    public static void main(String[] args) {
            /*
     1.静态数据


     2.动态数据

             */
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        heap = new int[k];
        int x = sc.nextInt();
        while(x!=-1){       //-1作为终止标识符
            deal(x);
            x = sc.nextInt();       //动态调整

        }
        for (int i = 0;i<heap.length;i++){
            System.out.print(heap[i]+" ");
        }

    }

    private static void deal(int x) {

    }


}

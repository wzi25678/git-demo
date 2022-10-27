package 进制艺术;

import java.util.Random;

public class 唯一成对的数 {
    private static Object Util;

    public static void main(String[] args) {
        int N = 1001;
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;         //存你输入的1~N的所有整数
        }
        //最后一个来一个随机数
        arr[arr.length - 1] = new Random().nextInt(N - 1) + 1;   //[1~N)的数   取得是左闭右开区间
        for (int i = 0; i < N; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        System.out.println("重复数是："+arr[N-1]);
        System.out.println();
        //产生一个随机数
        //int index = new Random().nextInt(N);   //[0,11)之间的整数
         CreateRandomList(arr);
        //随机化完成

       /* for (int i = 0; i < 1000; i++) {           //执行一千次
            int index = new Random().nextInt(1000);  //取下标0~1000
            int a = new Random().nextInt(1000);  //取下标0~1000
            // int b = new Random().nextInt(1000);  //取下标0~1000
            //然后随便两个位置换一下
            arr[i] = arr[index];
            arr[index] = arr[a];
            arr[a] = arr[i];
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print("]");
        System.out.println();
*/
       //方法一：   一千个数来异或

        int x1 = 0;
        //找出那个重复元素
        for (int i=1;i<=N-1;i++){             //让0和  1-1000之间所有的数异或
            x1 = (x1^i);
        }
        for (int i=0;i<N;i++){              //异或出来的结果再和所有值出现一次的值异或
            x1 = x1^arr[i];
        }
        System.out.println("我认为的重复数是："+x1);

        //方法二：构造数组法
        int helper[] = new int[1001];
        //数组默认值为0
        for (int i=0;i<=1000;i++){
            if (helper[arr[i]]==1){
                System.out.println("我认为的重复数是："+arr[i]);
        }
        helper[arr[i]] ++;
        }

    }


    public static void CreateRandomList(int arr[]){
        int temp ;
        for (int i=0;i<1000;i++) {           //执行一千次
            //int index = new Random().nextInt(1000);  //取下标0~1000
            int a = new Random().nextInt(1000);  //取下标0~1000
            // int b = new Random().nextInt(1000);  //取下标0~1000
            //然后随便两个位置换一下
            temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
        }
//        System.out.print("[");
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+",");
//        }
//        System.out.print("]");
//        System.out.println();

    }
}

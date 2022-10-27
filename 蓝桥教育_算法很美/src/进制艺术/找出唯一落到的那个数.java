package 进制艺术;

import java.util.Random;

public class 找出唯一落到的那个数 {
    /*
    找出唯一，唯二啥的，都可以考虑辅助空间法！！！

    //思考练习：
    如何构造唯一落到数的函数
     */
        public static void main(String[] args) {
            int N = 1999;
            int arr[] = new int[N];
            int rand = new Random().nextInt(1000)+1;   //rand 为1-1000之间的数
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ((rand%1000)+1);         //产生一个1-1000之间的数
                rand++;
            }
            System.out.println("唯一落单的数是："+arr[arr.length-1]);
            //最后一个来一个随机数
//            arr[arr.length - 1] = new Random().nextInt(N - 1) + 1;   //[1~N)的数   取得是左闭右开区间
//            for (int i = 0; i < N; i++){
//                System.out.print(arr[i]+"  ");
//            }
//            System.out.println();
//            System.out.println("重复数是："+arr[N-1]);
//            System.out.println();
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

//            int x1 = 0;
//            //找出那个重复元素
//            for (int i=1;i<=N-1;i++){             //让0和  1-1000之间所有的数异或
//                x1 = (x1^i);
//            }
//            for (int i=0;i<N;i++){              //异或出来的结果再和所有值出现一次的值异或
//                x1 = x1^arr[i];
//            }
//            System.out.println("我认为的重复数是："+x1);
//
            //方法二：构造数组法
            int helper[] = new int[1999];
            //数组默认值为0
            for (int i=0;i<1999;i++){
                helper[arr[i]] ++;
            }
            for (int i=0;i<1999;i++){
                if (helper[arr[i]]==1){
                    System.out.println(arr[i]-1);
                    return;
                }

            }


        }


        public static void CreateRandomList(int arr[]){
            int temp ;
            for (int i=0;i<1999;i++) {           //执行一千次
                //int index = new Random().nextInt(1000);  //取下标0~1000
                int a = new Random().nextInt(1999);  //取下标0~1998
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


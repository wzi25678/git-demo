import java.util.Random;

public class 生成不重复的随即数组 {



    怎样创建一个供其他函数调用的工具包？？？？？？？？？？？


}
    public static void 生成不重复的随即数组(int arr[]){
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
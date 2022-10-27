import java.util.*;

public class 库函数内构的排序方法 {
    public static void main(String[] args) {
        int N = 1000;
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1);         //产生一个1-1000之间的数
        }
        CreateRandomList(arr);
        //***********************************************
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("========================================================");


        //Arrays.sort为库函数排序方法
        Arrays.sort(arr);       //默认从小到大排序
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("========================================================");
        // CreateRandomList(arr);
        //类型错误了吧？应该是。Arrays.sort(arr,Comparator.reverseOrder());
        MyCompare mc = new MyCompare();
        // Arrays.sort(arr[],mc);
        class MyCompare implements Comparator<Integer> {

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1 > o2 ? -1 : (o1 == o2 ? 0 : 1);
            }

        }


    }

    public static void CreateRandomList(int arr[]) {
        int temp;
        for (int i = 0; i < 1000; i++) {           //执行一千次
            //int index = new Random().nextInt(1000);  //取下标0~1000
            int a = new Random().nextInt(1000);  //取下标0~1998
            // int b = new Random().nextInt(1000);  //取下标0~1000
            //然后随便两个位置换一下
            temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
        }
    }
}
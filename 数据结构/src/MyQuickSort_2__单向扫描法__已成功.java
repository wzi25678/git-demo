import java.util.Arrays;
import java.util.Scanner;

public class MyQuickSort_2__单向扫描法__已成功 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i=0;i<arr.length;i++) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
        quickSort(arr,0,arr.length-1);
       // System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left<right){
            int p = Partion(arr,left,right);
            //真正排序要交给Partion函数
            quickSort(arr,left,p-1);
            quickSort(arr,p+1,right);
        }

    }

    private static int Partion(int[] arr, int left, int right) {
        int pivot = arr[left];   //设置pivot为枢纽
        int begin = left+1;    //同时换指针来进行移动
        //left来用来记录下一次的起始位置
        int end = right;
        //right同理
        while(begin<=end){
            if (arr[begin]<=pivot){
                begin++;
            }
            else{
                //交换arr[left]和arr[right]
                int temp = arr[begin];
                arr[begin] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
        //结束循环时：
        /*
        left：指在最左边
        right:指在最右边
        begin/end指在arr[pivot]应该在的位置坐标
         */
        //循环退出，此时让pivot到该位置上来
        int temp = arr[left];
        arr[left] = arr[end];
        arr[end] = temp;

        return end;



    }

}

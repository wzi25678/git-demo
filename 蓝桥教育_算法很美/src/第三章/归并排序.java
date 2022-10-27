package 第三章;

import java.util.Scanner;

public class 归并排序 {
    /*
    归并排序的重点，        在于              分解后的合并。
     */
    public static void main(String[] args) {
    //分解之后，low/mid/high进行排序
    //关键在于之后的merge合并

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
        int arr [] = {10,9,8,7,6,5,4,3,2,1};


        int temp[] = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        MergeSort(arr, 0,arr.length-1, temp);
        //还需要一个temp数组记录merge中的数据
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void  MergeSort(int[] arr,int left, int right, int[] temp){
        if (left < right){
            int mid = (left + (right-left)/2 );
           MergeSort(arr, left, mid, temp);//左归并递归
           MergeSort(arr, mid+1, right, temp);//右归并递归
           //先一直拆拆拆拆拆，反向递归来实现归并排序
           merge(arr, left, mid, right, temp);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int low1 = left;//用来表示左子序列的初始下标
        int low2 = mid+1;//用来表示右子序列的初始下标
        int t = 0;    //用来表示临时数组的下标
        while(low1 <= mid && mid <= right) {
            //如果左边的有序序列当前元素小于等于右边的有序序列当前元素
            //就将左边的当前元素放到临时数组中
            //然后两者的索引分别后移
            if(arr[low1] <= arr[mid]) {
                temp[t] = arr[low1];
                low1++;
                t++;
            }else {
                temp[t] = arr[mid];
                t++;
                mid++;
            }
        }
    }

}

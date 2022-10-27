package 递归_查找_排序;

import java.util.Arrays;

public class 旋转数组的最小数字 {
    public static void main(String[] args) {
        //斐波那契数列.FibonacciSeries(10);      //调用包里的其它函数


        //用取模的方式实现数组调换位置
        /*
        例：   5   2   1    3   4
        变成   1   2   3    4   5
         */
    int arr[] = { 5   ,2,   1,    3,   4};
    Arrays.sort(arr);           //Arrays.sort  不返回类型，只负责把arr顺序排好
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        ReverseArrays(arr);
    }
    public static void ReverseArrays(int arr[]){
        for (int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

package 递归_查找_排序;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {7,6,10,5,3,9,8,1,2,4};
        System.out.println("排序之前："+ Arrays.toString(arr));
        int arr2[] = 希尔排序(arr);
        System.out.println("排序之后："+Arrays.toString(arr2));
        }
    public static int [] 希尔排序 (int[] arr2) {
        int n = arr2.length;
        int gap = n/2;
        int i,j,temp;
        while(gap>0){       //直到gap没有为止

        }
        return arr2;

    }
    }


import java.util.Scanner;

public class 双向_QuickSort {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i=0;i<arr.length;i++) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {1,3,7,3,8,9,5,33,4,99,999};
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
    static void quickSort(int[] arr,int p,int r) {
        if(p<r) {
            int q = Parttion(arr,p,r);
            quickSort(arr,p,q-1);//递归调用左边排序
            quickSort(arr,q+1,r);//递归调用右边排序
        }
    }
    static void print(int[] arr) { //已经分成两组有序，直接输出数组
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static int Parttion(int[] arr, int p, int r) {
        int pivot = arr[p];
        int  sp =p+1;
        int bigger = r;
        while(sp<=bigger) {
            if(arr[sp]<pivot) {
                sp++;
            }
            else {
                swap(arr,sp,bigger);
                bigger--;
            }
        }
        //保证了左边都是比pivot小的，右边都是比pivot大的

        swap(arr,p,bigger);
        //返回pivot的位置
        return bigger;
    }
    static void swap(int[] arr, int sp, int bigger) {
        int temp = arr[sp];
        arr[sp] = arr[bigger];
        arr[bigger] = temp;
    }
}
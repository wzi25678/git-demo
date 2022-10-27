import java.util.Scanner;

public class My_QuickSort__已完成 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        QuickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void QuickSort(int arr[],int left,int right){
        if (left >=right ){
            //结束本趟循环
            return;
        }
        int pivot = arr[left];
        int low = left;
        int high = right;
        //建立基准
        while(low < high){
            //右一下，
            while(arr[high]>=pivot && low < high){
                high--;
            }
            //直到找到第一个不满足arr[right]不大于pivot的。
            if (low < high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                //基准 和 当前right  互换位置
            }
            //此时基准占了arr【right】的位置
            //左一下
            while(arr[low]<=pivot && low < high){
                low++;
            }
            if (low < high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        //完成了一趟快速排序
        //只有当所有趟的左右指针都相同时，才算结束快速排序
        //你这种方法会导致栈溢出，栈是后进先出的算法
        QuickSort(arr,left,high-1);
        QuickSort(arr,high+1,right);
        //这个地方得用两个指针，标记出所能作用的区间域值。
    }
}

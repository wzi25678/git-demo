import java.util.Arrays;

public class 双向扫描_MyQuickSort {
    public static void main(String[] args) {
        int arr[] = {7,6,10,5,3,9,8,1,2,4};
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    public static void QuickSort(int arr[],int left,int right){
        if (left >=right ){
            //结束本趟循环
            return;
        }

        //用begin和end来进行本趟移动的两个指针移动
        int pivot = arr[left];
        int begin = left;
        int end = right;

        while(begin!=end){
            while(arr[end]>=pivot && begin <end){
                end--;
            }
          //  if (begin<end) Swap(pivot,end);


            while (arr[begin]<=pivot && begin < end){
                begin++;
            }
            if (begin<end) Swap(end,begin);
        }
        //退出循环，说明一趟排序已经结束
        arr[left] = arr[begin];
        arr[begin] = pivot;
        QuickSort(arr,left,begin-1);
        QuickSort(arr,begin+1,right);

    }
    public static void Swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }

}

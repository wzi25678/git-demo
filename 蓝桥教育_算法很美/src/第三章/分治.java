package 第三章;

public class 分治 {
    public static void main(String[] args) {
        /*
        1.分
        2.治
        3.合
         */

        //1.快速排序
        int arr[] = {7,6,10,5,3,9,8,1,2,4};
        QuickSort(arr,0,arr.length-1);
        //排序数组，起始排序位置，终止排序位置
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void QuickSort(int arr[],int left,int right){
        if (left>=right){
            return;
            //左右指针交汇，排序终止
        }
        int l = left;
        int r = right;
        //因为每一组的left/right可能有所不同
        //记录当前左右指针的位置
        //然后用r，l来进行操作，因为用left和right可能会影响到其他数据

        int pivot = arr[left];
        //每次默认左边第一个为基准
        //基准枢纽
            while (left!=right){
                //左右指针不交汇的时候进行循环
                while (arr[r]>=pivot && l<r){
                    right--;
                }
                //while不成立且指针不越界时：
                    if (l<r){
                        int temp = pivot;
                        arr[left] = arr[right];
                        arr[right] = temp;
                    }
                //先执行右边，再执行左边
                while(arr[left]<=pivot&&left<right){
                    left++;
                }
                //while不成立且指针不越界时：
                if (l<r){            //当前的left》pivot
                    int temp = pivot;
                    arr[right] = arr[left];
                    arr[left] = temp;
                }
            }
            arr[left] = arr[l];
            arr[l] = pivot;
        QuickSort(arr,left,l-1);
        QuickSort(arr,l+1,right);
    }
}

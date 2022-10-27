public class MyQuickSort_2__双向扫描法__已成功 {
    public static void main(String[] args) {
         int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
        quickSort(arr,0,arr.length-1);
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left>=right){
            return;
        }
        int low = left;
        int high = right;
        int pivot = arr[left];   //定枢纽
        while(low < high){
            while (arr[high]>=pivot  && high > low){
                high--;
            }
            //此处可实现pivot与arr【high】的交换
            while(arr[low]<=pivot  && high >low){
                low++;
            }

            if (low<high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        arr[left] = arr[high];
        arr[high] = pivot;


        quickSort(arr,left,high-1);
        quickSort(arr,high+1,right);

    }
    }


    /*
    我用：
    left/right表示左右搜索区间
    begin/end来进行指针的移动
     */
//    private static void quickSort(int[] arr, int left, int right) {
//        if (left<right){
//            int pivot = Partition(arr,left,right);
//            //真正排序要交给Partion函数
//            quickSort(arr,left,pivot-1);
//            quickSort(arr,pivot+1,right);
//        }
//    }

//    private static int Partition(int[] arr, int left, int right) {
//
//        int pivot = arr[left];
//        int begin = left+1;
//        int end = right;
//        while (begin<=end){
//            while (arr[end]>pivot || begin <=end){
//                end--;
//            }
//            //此处可以arr[end]和arr[left]交换，实现移动pivot的值
//            //但我采用直接让end和begin进行交换
//            while (arr[begin]<=pivot || begin <= end){
//                begin++;
//            }
//            if (begin < end ){
//                int temp = arr[begin];
//                arr[begin] = arr[end] ;
//                arr[end] = arr[begin];
//            }
//
//        }
//        //=======================================================================================
//        //此时一趟循环结束
//        int temp = arr[left];
//        arr[left] = arr[end];
//        arr[end] = temp;
//        return end;
//    }
//}

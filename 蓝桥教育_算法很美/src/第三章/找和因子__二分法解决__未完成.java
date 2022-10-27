package 第三章;

public class 找和因子__二分法解决__未完成 {
    //已排序数组可以使用二分法，实现lg(n)级别的运算
    //二元组找和为10的两个数
    static int low,high,mid;
    public static void main(String[] args) {
        int arr [] = {-8,-4,-3,0,2,4,5,8,9,10};

        报个错，怕你忘了。

        //二重循环：
        System.out.println("方法一：        二重循环法");
        for (int i = 0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==10){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        System.out.println("方法二：        折半优化");
        for (int i = 0;i<arr.length;i++){
            low = i;
            high = arr.length-1;
            mid = low + (high-low)/2;
            BinarySearch(arr,low,high);
        }

    }

    private static void BinarySearch(int arr[],int low,int high) {
        if (mid >=arr.length || low==high || mid <=0|| mid==low || mid==high){
           return;
        }
        if (arr[low]+arr[mid]==10){
            System.out.println(arr[low]+" "+arr[mid]);
            return;
        }
        else if (arr[low]+arr[mid]<10){
            mid = mid + (high-mid)/2;
            BinarySearch(arr,low,high);
            return;
        }
        else
            mid = mid - (mid-low)/2;
            BinarySearch(arr,low,mid);
            return;
    }
}

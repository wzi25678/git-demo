package 递归_查找_排序;

public class 递归下的数组求和 {
    static int count;
    public static void main(String[] args) {
        int arr[] = new int[100];
        for (int i=0;i<100;i++){
            arr[i] = i+1;
        }
        count = 0;
        for (int i=0;i<100;i++){
            count+=arr[i];
        }
        System.out.println(count);
        count = 0;

        //CountArray(arr,0)这是我构造的求和函数
        //求和过程为当前位置的值加上下一个位置的值
        //终止条件为，最后一个元素补上以后，不再加值。
        System.out.println(CountArray(arr,0) );
    }
    static int CountArray(int arr[],int index) {
        if (index == arr.length-1) {
             return arr[arr.length-1];
        } else {
            return arr[index]+CountArray(arr,index+1);
        }
    }
}

import java.util.Arrays;

public class 单向扫描_MyQuickSort {
    public static void main(String[] args) {
        int arr[] = {1,56,845,662,52,54,66,25,96,34,12};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void QuickSort(int A[],int p,int r){
        if (p<r){
            int q = partition(A, p, r);   //当前pivot所在的最终位置
            QuickSort(A,p,q-1);         //下一趟排序的位置
            QuickSort(A,q+1,r);         //下一趟排序的位置
        }
    }

    public static int partition(int A[],int p,int r){
        //p为起点，r为终点
        int pivot = A[p];   //起点设置为pivot

        int sp = p+1;     //起始位置
        int bigger = r;    //终点位置
        while (sp<=bigger){
            if (A[sp]<=pivot){
                sp++;
            }
            else {
                int temp = A[sp];
                A[sp] = A[bigger];
                A[bigger] = temp;
                //可能换过去的A[bigger]的值也比pivot大，但是不要紧，它会换回来到下一个位置
                bigger--;
            }
        }
        int temp = p;
        p = bigger;
        bigger= p;
        return bigger;
    }
}

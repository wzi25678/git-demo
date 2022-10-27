import java.util.Random;

public class 最佳加法表达式 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;         //存你输入的1~N的所有整数
        }
        //最后一个来一个随机数
        CreateRandomList(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("--------------------------------------------------------------------");
        int n = new Random().nextInt(4)+1;   //n表示【1-4】之间的数
        

    }








    public static void CreateRandomList(int arr[]){
        int temp ;
        for (int i=0;i<10;i++) {           //执行一千次
            //int index = new Random().nextInt(1000);  //取下标0~10
            int a = new Random().nextInt(10);  //取下标 0~9
            temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
        }
    }
}

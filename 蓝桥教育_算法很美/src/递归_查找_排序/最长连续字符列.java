package 递归_查找_排序;

public class 最长连续字符列 {
    /*
    1 9 2 5 7 3 4 6 8 0
    3 4 6 8
     */


    //模拟过程的方法求解


    public static void main(String[] args) {
        //两根指针跟着跑，用一个length来记录MaxLength。
        //记录战线
        int [] arr = { 1 ,9, 2, 5, 7, 3, 4, 6, 8, 0};
        int count[] = new int[arr.length];
        int index = 0;     //标记位置
        int max = 0;     //记录最大长度
        int length = 1;
        System.out.println("index标记法");
        for (int i=0;i<arr.length-1;i++){
            //递增情况时
            if (arr[i+1]>arr[i]){
                length++;     //即该数+其后面一个数
                continue;
            }
            else{
                //不递增情况时:


                if (length>max){
                    max = length;
                    for (int k=0;k<length;k++,index++){
                        count[k] = arr[index];
                    }
                    length = 1;
                    index = (i+1);

                }
                //当前长度不大于最大长度
                else{
                    index = (i+1);
                    length = 1;
                }
            }
        }
        for (int j=0;j<arr.length;j++){
            if (count[j]!=0){
                System.out.print(count[j]+" ");
            }
       }
        System.out.println("==============================================================================");
        System.out.println("暴力法：");
        for (int i=0;i<arr.length-1;i++){
            for (int j=i;j<arr.length-1;j++){
                if (arr[j+1]>arr[j]){
                     length++;     //即该数+其后面一个数
                    continue;
                }
                //当不大于时
                else {
                    //如果当前长度大于记录到的最大长度
                    if (length>max){
                        max = length;
                        for (int k=0;k<length;k++,i++){
                            count[k] = arr[i];
                        }
                        length = 1;
                    }
                    //当前长度不大于最大长度
                    else{
                        length = 1;
                    }
                }
            }
        }
        for (int j=0;j<arr.length;j++){
            if (count[j]!=0){
                System.out.print(count[j]+" ");
            }
        }





//        int a  = 2;
//        double res = Math.pow(a,10);
//        System.out.printf("%.0f",res);   //double  float均为浮点型
//                                        //char int 为整型
//      //  System.out.printf("%.0f",Math.pow(a,10));
    }

}

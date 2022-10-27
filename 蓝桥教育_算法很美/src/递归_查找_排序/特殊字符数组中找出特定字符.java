package 递归_查找_排序;

public class 特殊字符数组中找出特定字符 {
    /*
    "a" "ac" "ad" "b" " " "ba"          比较b
    返回4
     */
    public static void main(String[] args) {
        String str = "a ac ad b   ba";
        //构造字符串数组，分别储存
        String arr[] = new String[str.length()];
        arr=str.split(" ");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("=============================");
//        arr=str.split(" ");
        System.out.println(arr);
        //数组名保存的是该数组首元素所在的地址。
    }
}

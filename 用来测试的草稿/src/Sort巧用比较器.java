
import java.util.Arrays;
import java.util.Comparator;

public class Sort巧用比较器 {

    /**
     * Arrays.sort() 逆序排列
     * @author lyf3312
     *
     */
        public static void main(String[] args) {
            Integer[] nums = {12,33,5,-9,233,2299,-987,2,0,1,8};
            //利用Arrays.sort() 逆序排列nums,
            //注: 要逆序排列的数组，不能使用基本数据类型，必须使用基本类型对应的类

            //任何可以排序的对象，包括基本类型对应的类（Integer,Double,Character,Byte等）
            //都实现了内部比较器接口comparable。

            //正序排
            Arrays.sort(nums);
            for(int i : nums) {
                System.out.print(i+"\t");
            }

            //利用外部比较器逆序排序
            MyCompare mc = new MyCompare();
            Arrays.sort(nums,mc);

            System.out.println();
            for(int i : nums) {
                System.out.print(i+"\t");
            }
        }
    }

    //外部比较器
    class MyCompare implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            // TODO Auto-generated method stub
            return o1 > o2 ? -1 :(o1==o2 ? 0 :1);
        }


    }


package 进制艺术;

public class 浮点实数的二进制表示 {
    public static void main(String[] args) {
        //二进制追加法
        double num = 0.3;
        //小数判断二进制，采用的是乘二追加的原则
        StringBuilder sb  = new StringBuilder("0.");     //字符串拼接
        while(num>0){
            double r = num*2;
            if (r>1){
                sb.append("1");
                num = r-1;
            }
            else {
                sb.append("0");
                num = r;
            }
            if (sb.length()>1000){              //二进制很多的小数无法精确表示
                System.out.println("无法精确表示");
                System.out.println(sb.toString());
                return;
            }
        }
        System.out.println(sb.toString());
    }
}

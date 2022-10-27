package 递归_查找_排序;

public class 汉诺塔问题 {
    public static void main(String[] args) {
        printHanoiTower(3,"A","B","C");
    }

    private static void printHanoiTower(int N, String from, String to, String assist) {
        if (N==1){
            System.out.println("Move "+N+" From "+from+" to "+to);
            return;
        }

        printHanoiTower(N-1,from,assist,to);


        System.out.println("Move "+N+" From "+from+" to "+to);


        printHanoiTower(N-1,assist,to,from);

    }

}

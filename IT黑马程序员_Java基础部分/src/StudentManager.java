import java.util.Scanner;
import  java.util.ArrayList;
public class StudentManager {
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);

        System.out.println("选择1？");
        System.out.println("选择2？");
        System.out.println("选择3？");
        System.out.println("选择4？");
        System.out.println("选择5？");
        String line = sc.nextLine();
        switch (line){
            case "1":           //如果是字符1？
                break;
            case "2" :
                break;
            case "3":
                break;   //continue只适合于循环语句switch  or   for
            default:
                break;
        }
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);
        System.out.println("添加学生成功");*/
    }
    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号： ");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名： ");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄： ");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地： ");
        String address = sc.nextLine();

        Student s = new Student();




    }
}

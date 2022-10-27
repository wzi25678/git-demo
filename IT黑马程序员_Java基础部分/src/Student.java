public class Student {          //学生类的创建
    //Alt +  Ins 键，可以自动生成类方法体的创建。
    private String name;
    private String sid;
    private int age;
    private String address;
    public Student() { }
    public Student(String name, String sid, int age, String address) {
        this.name = name;
        this.sid = sid;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

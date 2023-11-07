package Bai11_Object_Class;

public class Student {
    private String name = "Nguyễn Văn A";
    private int age = 40;
    private String address = "HCM";
    private String phone = "123456";

    public void displayInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(phone);
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {

        //Khai báo đối tượng thuộc lớp Student
        Student sv1 = new Student();
        sv1.displayInfo();
        sv1.getName();

        Student sv2 = new Student();
        sv2.getName();
    }
}

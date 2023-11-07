package Bai14_TinhKeThuaVaDongGoi.TinhKeThua;

public class Student extends Person {

    private String phone;
    private String address;

    public Student(String name, int age, float height, String phone, String address) {
        super(name, age, height); //Đảm bảo đúng cấu trúc ở class Cha
        this.phone = phone;
        this.address = address;
    }

    public void getInfo() {
        super.getInfo(); //Hàm này nó sẽ hiểu từ class CHA
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }

    public String getPhone() {
        getInfo(); //Hàm này nó sẽ hiểu từ class CON
        System.out.println(name);
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        Student student = new Student("Linh", 30, 165, "0123456789", "Hà Nội");
        student.getInfo();
        student.getName();
//        System.out.println(student.getPhone());
//        System.out.println(student.getAddress());
    }
}

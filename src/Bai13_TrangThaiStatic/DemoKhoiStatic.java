package Bai13_TrangThaiStatic;

public class DemoKhoiStatic {

    public String name;
    public int age;
    public static String className = "Đại học Bách Khoa Hà Nội";

    static {
        System.out.println("Đây là khối static");
    }

    public static void main(String[] args) {
        System.out.println("1. " + className);
        System.out.println("2. " + className);
        System.out.println("3. " + className);
    }

    static {
        System.out.println("Đây là khối static");
    }

}

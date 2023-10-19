package Bai3_Bien_KieuDuLieu;

public class Student {

    public static int a = 20; // Đây là biến toàn cục (instance)
    public String ten = "An";

    public static void sayHello() {
        int b = 10; // Đây là biến local
        b = b + tinhLaiSuat(); //Giá trị là 10000000
        System.out.println("Gia tri cua n la: " + b);
    }

    public static int tinhLaiSuat(){
        int laiSuat = 10000000;
        return laiSuat;
    }

    public static void main(String[] args) {
        String NAME = "Anh Tester";
        int c = 15; //Khai báo biến nhưng chưa có giá trị khởi tạo
        String get_Account_Customer = "admin@example.com";

        System.out.println(NAME);
        System.out.println(c);
        System.out.println(get_Account_Customer);

        System.out.println(a);
    }
}

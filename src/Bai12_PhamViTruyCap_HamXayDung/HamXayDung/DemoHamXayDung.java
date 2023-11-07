package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHamXayDung {

    //Khai báo
    public String name;
    public int age;

    //Khai báo hàm xây dựng
    public DemoHamXayDung() {
        System.out.println("Tôi nằm trong hàm xây dựng");

        //Khởi tạo giá trị
        name = "Java for Tester";
        age = 20;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        DemoHamXayDung demoHamXayDung = new DemoHamXayDung();
        demoHamXayDung.showInfo();
    }
}

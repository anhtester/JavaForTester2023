package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHamXayDungCoThamSo {

    //Khai báo
    public String name;
    public int age;

    //Hầu như luôn có
    public DemoHamXayDungCoThamSo() {
        System.out.println("Đây là hàm xây dựng 0 tham số");
    }

    //Khai báo hàm xây dựng
    public DemoHamXayDungCoThamSo(String name, int age) {
        System.out.println("Đây là hàm xây dựng 2 tham số");

        //Khởi tạo giá trị
        this.name = name;
        this.age = age;
    }

    public DemoHamXayDungCoThamSo(String name, int age, String address) {
        System.out.println("Đây là hàm xây dựng 3 tham số");

        //Khởi tạo giá trị
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void showInfo(String abc) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void showInfo(int abc) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        DemoHamXayDungCoThamSo demoHamXayDung1 = new DemoHamXayDungCoThamSo("Tươi", 27);
        demoHamXayDung1.showInfo();

        DemoHamXayDungCoThamSo demoHamXayDung2 = new DemoHamXayDungCoThamSo("Linh", 29);
        demoHamXayDung2.showInfo();

        DemoHamXayDungCoThamSo demoHamXayDung3 = new DemoHamXayDungCoThamSo("Linh", 29, "Hà Nội");
        demoHamXayDung3.showInfo();

        DemoHamXayDungCoThamSo demoHamXayDung4 = new DemoHamXayDungCoThamSo();
        demoHamXayDung4.showInfo();
    }
}

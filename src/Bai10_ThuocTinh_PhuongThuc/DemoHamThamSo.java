package Bai10_ThuocTinh_PhuongThuc;

public class DemoHamThamSo {

    //Khai báo hàm có 2 tham số với kiểu dữ liệu tương ứng
    public static int tong2SoNguyen(int number1, int number2) {
        return number1 + number2;
    }

    public static void showInformation(String name, int age, String address) {
        System.out.println("HỌ VÀ TÊN: " + name);
        System.out.println("TUỔI: " + age);
        System.out.println("ĐỊA CHỈ: " + address);
    }

    public static float tinhDienTich(float chieuDai, float chieuRong) {
        return chieuDai * chieuRong;
    }

    public static void main(String[] args) {
        System.out.println("Tổng 2 số nguyên: " + tong2SoNguyen(15, 10));

        showInformation("Hân", 20, "An Giang");
        showInformation("Trường", 30, "Hậu Giang");
        showInformation("Tươi", 40, "Hà Giang");

        System.out.println("DIỆN TÍCH: " + tinhDienTich(10, 5.5F));

    }
}

package Bai10_ThuocTinh_PhuongThuc;

import java.util.ArrayList;

public class DemoPhuongThuc {

    int number = 21;

    public void kiemTraSoChan() {
        if (number % 2 == 0) {
            System.out.println("Là số chẵn");
        } else {
            System.out.println("Là số lẻ");
        }
    }

    public ArrayList<Integer> timSoChan(int number) {
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                arrayList.add(i);
            }
        }
        return arrayList; //Trả về 1 arrayList đã chứa những giá trị số chẵn
    }

    //Khai báo hàm KHÔNG trả về giá trị
    public void displayInfo() {
        System.out.println("Hello Student");
        System.out.println("Địa chỉ của tôi ở: " + getAddress());
    }

    //Khai báo hàm CÓ trả về giá trị loại String
    public String getAddress() {
        return "HCM";
    }

    public static String getName() {
        return "Linh";
    }

    public static float chieuDai() {
        return 13.5F;
    }

    public static int chieuRong() {
        return 10;
    }

    public static void showInfo() {
        System.out.println("Tính diện tích hình chữ nhật");
    }

    public static float tinhDienTich() {
        return chieuDai() * chieuRong();
    }

    public static float tinhChuVi() {
        return (chieuDai() + chieuRong()) * 2;
    }

    public static void main(String[] args) {
        //Cách gọi lại để sử dụng Phương thức
        DemoPhuongThuc demo = new DemoPhuongThuc();
        demo.displayInfo(); //Vì hàm này KHÔNG có từ khoá static, nên cần thông qua đối tượng class

        getName(); //Vì hàm này CÓ từ khoá static

        System.out.println(demo.tinhChuVi());
        System.out.println(demo.tinhDienTich());

        demo.kiemTraSoChan();

        //In ra giá trị số chẵn từ ArrayList trong hàm timSoChan
        for (int soChan : demo.timSoChan(100)) {
            System.out.print(soChan + ", ");
        }

    }

}

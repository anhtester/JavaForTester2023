package Bai15_TinhDaHinh_TruuTuong.TinhDaHinh;

public class KetQua {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.tinhTong(5, 10));
        System.out.println(calculator.tinhTong(5, 10, 15));

        System.out.println(calculator.phepNhan(2, 3));
        System.out.println(calculator.phepNhan(2.5, 4));
        System.out.println(calculator.phepNhan(2.5, 4, 5));
        System.out.println(calculator.phepNhan(2.5, 4, 5, 10));

    }
}

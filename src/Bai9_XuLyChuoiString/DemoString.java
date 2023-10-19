package Bai9_XuLyChuoiString;

public class DemoString {
    public static void main(String[] args) {
        //Khai báo biến dạng chuỗi
        String name = "Anh Tester";

        //Một hằng chuỗi chỉ đơn giản là một chuỗi trực tiếp
        //được đặt trong dấu ngoặc kép, không cần thông qua một biến để lưu trữ
        //"Automation Test" là hằng chuối
        System.out.println("Automation Test".toUpperCase());

        //Được phép sử dụng các hàm xử lý trong lớp Strinh để biến tấu giá trị chuỗi theo ý của mình
        //Cắt, ghép (nối chuỗi), tách, in hoa, in thường, tìm kiếm vị trí,...
        String str1 = "Automation Test".replace(" ", "-");
        System.out.println(str1);

        //Nối chuỗi
        //Dùng dấu + để ghép chuỗi lại với nhau
        String fullName = "HỌ VÀ TÊN: " + name;
        System.out.println(fullName);
    }
}

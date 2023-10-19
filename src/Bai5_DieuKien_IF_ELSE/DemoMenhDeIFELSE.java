package Bai5_DieuKien_IF_ELSE;

public class DemoMenhDeIFELSE {
    public static void main(String[] args) {

        String address = "Can Tho";
        String phone = "123456";
        boolean checkLogin = true;
        int a = 5;
        int b = 10;

        if (address.equals("Can Tho 123")) {
            System.out.println("Địa chỉ là Cần Thơ");
        } else {
            System.out.println("Địa chỉ là các tỉnh khác");
        }

        if (checkLogin == false) {
            System.out.println("Login success"); //Đi đến được trang Dashboard
        } else {
            System.out.println("Invalid email or password");
        }

    }
}

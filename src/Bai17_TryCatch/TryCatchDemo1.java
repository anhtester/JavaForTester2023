package Bai17_TryCatch;

public class TryCatchDemo1 {
    public static void main(String[] args) {

        //Xử lý ngoại lệ bằng try catch trong Java
        try {
            int data = 5 / 0;
        } catch (ArithmeticException e) {
            //In ra màn hình tên ngoại lệ
            System.out.println(e);
        }
        System.out.println("Phép chia cho 0");
    }
}

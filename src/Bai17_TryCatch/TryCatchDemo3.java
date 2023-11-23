package Bai17_TryCatch;

public class TryCatchDemo3 {
    public static void main(String[] args) {
        try {
            int data = 5 / 0;
        } finally {
            System.out.println("Lỗi từ hàm chia cho 0");
        }
        System.out.println("Finished!");
    }
}

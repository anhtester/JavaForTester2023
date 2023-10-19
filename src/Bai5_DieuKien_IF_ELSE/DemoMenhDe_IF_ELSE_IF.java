package Bai5_DieuKien_IF_ELSE;

public class DemoMenhDe_IF_ELSE_IF {
    public static void main(String[] args) {
        int marks = 101;

        if (marks < 50) {
            System.out.println("Tạch!");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Xếp loại D");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Xếp loại C");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Xếp loại B");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Xếp loại A");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("Xếp loại A+");
        } else {
            System.out.println("Giá trị không hợp lệ!");
        }
    }
}

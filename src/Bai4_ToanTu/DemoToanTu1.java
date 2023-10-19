package Bai4_ToanTu;

public class DemoToanTu1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a + b); //30
        System.out.println(a % 2); //0
        System.out.println(a += b); //a = a + b = 30
        //System.out.println(a -= b);

        System.out.println("Giá trị của a: " + a);
        a = 10;
        System.out.println("Giá trị của a: " + a);

        System.out.println(a > 5 && b > 0 && a == c); //đúng && đúng && đúng  => true
        System.out.println(a < 5 || b > 50 || a == c); //sai || sai || đúng => true
    }
}

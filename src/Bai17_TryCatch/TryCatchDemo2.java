package Bai17_TryCatch;

public class TryCatchDemo2 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[3] = 4;
            System.out.println("arr[3 = " + arr[3]);

            int data = 0;
            int div = 10 / data;
            System.out.println("Average = " + div);

            String obj = null;
            System.out.println(obj.length());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("Finished!");
    }
}
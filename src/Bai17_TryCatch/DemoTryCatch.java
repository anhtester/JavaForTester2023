package Bai17_TryCatch;

public class DemoTryCatch {
    public void setTimeout(String timeout){
        System.out.println("Set timeout: " + Integer.parseInt(timeout));
        System.out.println("Đã set xong !!");
    }

    public static void main(String[] args) {
        DemoTryCatch demoTryCatch = new DemoTryCatch();

        demoTryCatch.setTimeout("10s");
    }
}

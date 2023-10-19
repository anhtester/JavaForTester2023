package Bai5_DieuKien_IF_ELSE;

public class DemoSwitchCase {
    public static void main(String[] args) {

        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }

        String browser = "edge"; //Giá trị config chung
        switch (browser) {
            case "chrome":
                System.out.println("Run Chrome browser...");
                //Code auto cho UI trên trình duyệt
                break;
            case "edge":
                System.out.println("Run Edge browser...");
                break;
            case "firefox":
                System.out.println("Run Firefox browser...");
                break;
            default:
                System.out.println("Run Chrome browser...");
        }

        String platform = "window"; //Giá trị config chung
        switch (browser) {
            case "window":
                System.out.println("Run Chrome browser...");
                //Code auto cho UI trên trình duyệt
                break;
            case "macos":
                System.out.println("Run Edge browser...");
                break;
            case "linux":
                System.out.println("Run Firefox browser...");
                break;
            default:
                System.out.println("Run Chrome browser...");
        }

    }
}

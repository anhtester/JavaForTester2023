package Bai16_DesignPattern.PageObjectModel.common;

public class BaseTest {

    private String browser = "EDGE";

    public void createDriver() {
        System.out.println("Mở trình duyệt: " + browser);
    }

    public void closeDriver() {
        System.out.println("Đóng trình duyệt: " + browser);
    }
}

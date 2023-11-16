package Bai16_DesignPattern.PageObjectModel.pages;

public class LoginPage {

    //Khai báo các biến giá trị dành riêng cho trang Login (từng page class)
    private String URL = "https://crm.anhtester.com/admin/authentication";

    //Khai báo hàm xây dựng để truyền tham số vào cho từng page class
    public LoginPage() {
        //Truyền tham số gì đó
        //Cụ thể trong Test Automation là một driver để điều khiển browser
    }

    //Khai báo các đối tượng element trên website
    //Trong ví dụ mình dùng kiểu String thay vì WebElement nhé
    private String inputEmail = "//input[@id='email']";
    private String inputPassword = "//input[@id='password']";
    private String buttonLogin = "//button[normalize-space()='Login']";

    //Khai báo các hàm xử lý cho riêng trang Login này
    public void setEmail(String email) {
        System.out.println("Điền giá trị email: " + email);
        System.out.println("Đối tượng email: " + inputEmail);
    }

    public void setPassword(String password) {
        System.out.println("Điền giá trị password: " + password);
        System.out.println("Đối tượng password: " + inputPassword);
    }

    public void clickLoginButton() {
        System.out.println("Click nút Login button: " + buttonLogin);
    }

    public void loginCRM(String email, String password) {
        System.out.println("Đi đến trang web: " + URL);
        setEmail(email);
        setPassword(password);
        clickLoginButton();
    }

    public void verifyLoginSuccess(){
        System.out.println("Verify login success.");
    }

    public void verifyLoginFail(){
        System.out.println("Verify login fail.");
    }

}

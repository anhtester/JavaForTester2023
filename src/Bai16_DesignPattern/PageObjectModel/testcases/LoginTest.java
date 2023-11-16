package Bai16_DesignPattern.PageObjectModel.testcases;

import Bai16_DesignPattern.PageObjectModel.common.BaseTest;
import Bai16_DesignPattern.PageObjectModel.pages.LoginPage;

public class LoginTest extends BaseTest {

    //Khai báo đối tượng từng class page cần thiết để dùng cho class test cases
    LoginPage loginPage;

    public void testLoginSuccess(){
        loginPage = new LoginPage();
        System.out.println("*****TEST CASE LOGIN SUCCESS*****");
        createDriver();
        //Truyền giá trị email và password đúng
        loginPage.loginCRM("admin@example.com", "123456");
        loginPage.verifyLoginSuccess();
        closeDriver();
    }

    public void testLoginWithEmailInvalid(){
        loginPage = new LoginPage();
        System.out.println("*****TEST CASE LOGIN FAIL*****");
        createDriver();
        //Truyền giá trị email sai
        loginPage.loginCRM("admin123@example.com", "123456");
        loginPage.verifyLoginFail();
        closeDriver();
    }

    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();

        loginTest.testLoginSuccess();
        System.out.println("===========================");
        loginTest.testLoginWithEmailInvalid();
    }

}

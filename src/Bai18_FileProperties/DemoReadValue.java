package Bai18_FileProperties;

import Bai18_FileProperties.helpers.PropertiesHelper;

public class DemoReadValue {
    public static void main(String[] args) {

        //Gọi hàm loadAllFiles trước tiên để load tất cả các file properties vào chung bộ nhớ
        PropertiesHelper.loadAllFiles();

        //Sau đó gọi hàm getValue để lấy giá trị theo tên key
        System.out.println("BROWSER: " + PropertiesHelper.getValue("browser"));
        System.out.println("URL: " + PropertiesHelper.getValue("url"));
        System.out.println("EMAIL: " + PropertiesHelper.getValue("email"));
        System.out.println("PASSWORD: " + PropertiesHelper.getValue("password"));

    }
}

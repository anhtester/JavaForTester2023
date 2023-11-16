package Bai18_FileProperties;

import Bai18_FileProperties.helpers.PropertiesHelper;

public class DemoSetValue {
    public static void main(String[] args) {
        //Trước tiên chỉ định file cần set giá trị vào
        //Dùng đường dẫn tương đối
        //Ví dụ file local.properties
        PropertiesHelper.setFile("src/Bai18_FileProperties/local.properties");

        //Gọi hàm setValue để gán giá trị theo key
        PropertiesHelper.setValue("author", "Anh Tester");
    }
}

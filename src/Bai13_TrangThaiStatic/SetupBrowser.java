package Bai13_TrangThaiStatic;

import constants.ConfigData;

public class SetupBrowser {

    public static void main(String[] args) {
        System.out.println("Chạy với trình duyệt: " + ConfigData.BROWSER_NAME);
        ConfigData.clickElement();
        System.out.println(ConfigData.PASSWORD);
    }

}

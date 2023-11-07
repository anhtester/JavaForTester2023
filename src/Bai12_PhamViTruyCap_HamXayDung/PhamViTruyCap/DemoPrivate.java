package Bai12_PhamViTruyCap_HamXayDung.PhamViTruyCap;

public class DemoPrivate {

    private String name = "Anh Tester";

    private void showInfo(){
        System.out.println("Hello, i am An");
    }

    public String getName(){
        return name;
    }

    private int VAT = 10;
    private int tongTien = 1000000;

    public int tinhLaiSuat(){
        return ((tongTien * VAT)/100)*6;
    }

}

package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class Student {
    //Không khai bo từ khoá phạm vi truy cập nào
    //Thì nó sẽ hiểu là phạm vi truy cập Default
    int age = 30;
    String phone = "123456789";

    protected String getPhone(){
        return phone;
    }

    public int getAge(){
        return age;
    }

}

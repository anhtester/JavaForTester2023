package Bai12_PhamViTruyCap_HamXayDung.PhamViTruyCap;

import Bai12_PhamViTruyCap_HamXayDung.HamXayDung.Student;

//Từ khoá extends đại diện cho sự kế thừa class
public class ThongTin extends Student{

    public static void main(String[] args) {
        DemoPrivate demoPrivate = new DemoPrivate();
        System.out.println(demoPrivate.getName());

        DemoDefault demoDefault = new DemoDefault();
        System.out.println(demoDefault.age);

        DemoProtected demoProtected = new DemoProtected();
        demoProtected.getAddress();

        ThongTin thongTin = new ThongTin();
        thongTin.getPhone(); //Gọi được phạm vi protected khác package khi kế thừa
        //Nếu bỏ kế thừa ra, thì nó sẽ lỗi không gọi được hàm getPhone()

        Student student = new Student();
        student.getAge();

    }
}

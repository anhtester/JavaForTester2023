package Bai13_TrangThaiStatic;

public class DemoHamStatic {

    public String name;
    public int age;
    public static String className = "Đại học Bách Khoa Hà Nội";

    public String getName(){
        return name;
    }

    public static void getInfo(){
        System.out.println(className); //Biến static

        DemoHamStatic demoHamStatic = new DemoHamStatic();
        System.out.println(demoHamStatic.name); //Biến thông thường

        System.out.println(demoHamStatic.getName());
    }
}

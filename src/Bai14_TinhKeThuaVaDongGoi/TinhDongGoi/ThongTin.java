package Bai14_TinhKeThuaVaDongGoi.TinhDongGoi;

public class ThongTin {
    public static void main(String[] args) {

        Student student1 = new Student();
        //Gán giá trị thông qua hàm set
        student1.setName("Đạt");
        student1.setAge(25);
        student1.setPhone("12345");

        //array sv1 = select * from student where id = 1
        //sv1.name, sv1.age

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getPhone());

        Student student2 = new Student();
        //Gán giá trị thông qua hàm set
        student2.setName("Linh");
        student2.setAge(29);
        student2.setPhone("56789");

        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getPhone());

    }
}

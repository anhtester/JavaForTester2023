package Bai14_TinhKeThuaVaDongGoi.TinhKeThua;

public class Teacher extends Person {

    private double luong;

    public Teacher(String name, int age, float height, double luong) {
        super(name, age, height);
        this.luong = luong;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Thảo", 30, 170, 30000000);
        teacher.getInfo();
        System.out.println("Lương: " + teacher.luong);
    }

}

package Bai14_TinhKeThuaVaDongGoi.TinhKeThua;

public class Person {

    public String name;
    public int age;
    public float height;
    private int count;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void getInfo() {
        System.out.println("Full Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);
    }

    public String getName(){
        return name;
    }

    public float getHeight(){
        return height;
    }

    public static void main(String[] args) {
        Person person = new Person("Đạt", 40, 175);

    }
}
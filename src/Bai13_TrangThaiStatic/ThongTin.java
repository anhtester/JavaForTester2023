package Bai13_TrangThaiStatic;

public class ThongTin {

    public void getInfo(){
        DemoBienStatic demoBienStatic1 = new DemoBienStatic();
        System.out.println(demoBienStatic1.className);

        DemoBienStatic demoBienStatic2 = new DemoBienStatic();
        System.out.println(demoBienStatic2.className);

        System.out.println(DemoBienStatic.className);
    }

    public static void main(String[] args) {

        System.out.println(DemoBienStatic.className);

    }
}

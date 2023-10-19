package Bai6_VONG_LAP;

public class VongLapWhile {
    public static void main(String[] args) {

        //Vòng lặp vô tận
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//        }

        //Vòng lặp while
        int i = 10;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        //Vòng lặp do while
        do{
            System.out.println(i);
        }while (i < 10);
    }
}

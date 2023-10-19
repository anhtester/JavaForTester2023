package Bai6_VONG_LAP;

public class VongLapFOR_CaiTien {
    public static void main(String[] args) {

        int number[] = {5, 7, 20, 10, 9}; //int
        String name[] = {"Hoa", "Linh", "Trường", "Hân"}; //String

        //String sinhvien[] = //Read File Excel / JSON / Code Auto lấy ra / Select trong SQL / Gọi API

        for(int i : number){
            if(i == 30){
                System.out.println("Có số 30 tồn tại");
            }
        }

        for (String ten : name){
            if(ten.equals("An")){
                System.out.println("Linh có mặt");
            }
        }

    }
}

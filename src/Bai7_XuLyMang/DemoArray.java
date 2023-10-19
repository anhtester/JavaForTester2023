package Bai7_XuLyMang;

public class DemoArray {
    public static void main(String[] args) {

        //Khai báo và khởi tạo độ dài mảng
        String sinhvienArray[] = new String[3];

        //Gán giá trị cho mảng sinhvienArray
        sinhvienArray[0] = "Linh";
        sinhvienArray[1] = "Trường";
        sinhvienArray[2] = "Tươi";
        //sinhvienArray[3] = "Xuân"; //Vượt ngưỡng độ dài quy định

        //Truy xất giá trị thủ công thông qua vị trí
        System.out.println(sinhvienArray[0]);
        System.out.println(sinhvienArray[2]);

        //Duyệt mảng để truy xuất giá trị đồng loạt
        //Dùng vòng lặp FOR để duyệt mảng
        System.out.println("Độ dài mảng: " + sinhvienArray.length);
        //Cách 1 dùng FOR đơn giản
        for (int i = 0; i < sinhvienArray.length; i++) {
            //Biến i sẽ tăng từ 0 đến độ dài của mảng trừ 1 đơn vị (vị trí cuối cùng)
            System.out.println(sinhvienArray[i]);
        }

        System.out.println("=============COPY GIÁ TRỊ SANG MẢNG KHÁC===========");
        String svArray[] = new String[2];
        //Copy giá trị từ mảng sinhvienArray sang mảng svArray
        for (int i = 0; i < sinhvienArray.length; i++) {
            //Gán giá trị tại vị trí của mảng 1 cho mảng 2
            svArray[i] = sinhvienArray[i];
        }

        System.out.println("========================");
        //In mảng svArray ra
        for (int i = 0; i < svArray.length; i++) {
            System.out.println(svArray[i]);
        }


    }
}

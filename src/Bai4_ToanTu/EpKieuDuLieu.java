package Bai4_ToanTu;

public class EpKieuDuLieu {
    public static void main(String[] args) {

        //ép kiểu dữ liệu thu hẹp
        float c = 35.8781428f;
        int b = (int)c + 1; //Ép về kiểu nhỏ hơn - Lưu được tới 2 tỷ mốt

        //Mở rộng kiểu dữ liệu
        long L = b; //Biến L được phép lưu biến b vì nó rộng hơn b - Lưu tới triệu tỷ

        System.out.println(c);
        System.out.println((int)c);
        System.out.println(b);
        System.out.println(L);

        //Chuyển kiểu Số về dạng Chuỗi
        String numberString = String.valueOf(b);
        System.out.println(numberString + 40);

        //Chuyển kiểu Chuỗi về dạng số
        System.out.println(Integer.parseInt(numberString) + 40);
        System.out.println(Float.parseFloat(numberString) + 40);
        System.out.println(Long.parseLong(numberString) + 40);
        System.out.println(Double.parseDouble(numberString) + 40);
    }
}

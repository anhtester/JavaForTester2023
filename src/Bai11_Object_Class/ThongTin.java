package Bai11_Object_Class;

public class ThongTin {
    float vat = 10;
    double hocphi = 1500000;

    public double getVat(){
        return vat;
    }

    public double getHocPhi(){
        return hocphi;
    }

    public static void main(String[] args) {
        Student sv1 = new Student(); //Cách khai báo và khởi tạo giá trị cho 1 lớp đầy đủ
        sv1.displayInfo();
        sv1.getName();
        sv1.getName();
        sv1.getName();
        sv1.getName();
        sv1.getName();

        //Cách khai báo kiểu Annonymous
        new Student().displayInfo();
        new Student(); //Khởi tạo giá trị cho class Student (nếu có hàm xây dựng)
        new Student().displayInfo();
        new Student().displayInfo();
        new Student().displayInfo();
        new Student().displayInfo();
        new Student().displayInfo();

        ThongTin tt1 = new ThongTin();
        tt1.getHocPhi();
        ThongTin tt2 = new ThongTin();
        tt2.getVat();
    }
}

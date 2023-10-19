package Bai8_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DemoArrayList {
    public static void main(String[] args) {

        //Cách khai báo thứ 1
        List<String> list = new ArrayList<>();

        //Cách khai báo thứ 2 - lấy trực tiếp loại của thằng con để khai báo
        //ArrayList, Vector, LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Selenium");
        arrayList.add("Appium");

        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.indexOf(1));
        System.out.println(arrayList.contains("ABC"));

        //Object là từ khoá đại diện cho tất cả các kiểu dữ liệu
        //Gồm String, int, float, long,...

        //Phụ thuộc vào phiên bản JDK. Chỉ dùng được từ JDK 10
        //Nếu JDK8 thì không có var
        var arrayList2 = new ArrayList<>();
        arrayList2.add(10);
        arrayList2.add("Anh Tester");
        arrayList2.add(13.6);

        for (Object value : arrayList2){
            System.out.println(value);
        }

        ArrayList<Object> arrayList3 = new ArrayList<>();
        arrayList3.add("Selenium");
        arrayList3.add(123);
        arrayList3.add(12.5);
        for (Object value : arrayList3){
            System.out.println(value);
        }

    }
}

package Bai8_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoCollectionList {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(12);
        listNumber.add(52);
        listNumber.add(14);
        listNumber.add(42);
        listNumber.add(42);

        listNumber.set(3, 60); //Cập nhật giá trị

        listNumber.remove(1);//Xoá giá trị 52
        System.out.println(listNumber.size());
        System.out.println(listNumber.isEmpty());
        System.out.println(listNumber.indexOf(14));
        System.out.println(listNumber.contains(42));

        System.out.println("===Truy xuất đồng loạt hết các giá trị không thông qua vị trí===");
        for (int value : listNumber){
            System.out.println(value);
        }

        System.out.println("===Truy xuất thông qua vị trí cụ thể===");
        System.out.println(listNumber.get(2));


        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("https://anhtester.com/lesson/java-for-tester-collection-trong-java-voi-arraylist-set-map");
        linkedList.add("https://viettuts.vn/images/java/java-collection/he-thong-cap-bac-colection-trong-java.png");

        System.out.println("Các phần tử của LinkedList");
        System.out.print("\t" + linkedList + "\n");

    }
}

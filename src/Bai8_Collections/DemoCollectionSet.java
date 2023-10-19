package Bai8_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoCollectionSet {
    public static void main(String[] args) {
        //Set - List - Map

        //Khai báo kiểu Set với loại HashSet
        //Không có sắp xếp được
        System.out.println("====HASHSET====");
        Set<String> stringSet = new HashSet<>();
        stringSet.add("KJGUYF827049878");
        stringSet.add("2988746378KUGSJYVF");
        stringSet.add("KJGUYF8270498788245"); //Hiểu giá trị bị trùng sau cùng

        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("KJGUYF8270498788279587"));
        stringSet.clear();

        for (String value : stringSet){
            System.out.println(value);
        }

        System.out.println("====TREESET====");
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("124");
        treeSet.add("ABC");
        treeSet.add("BDKUGS7264");
        treeSet.add("ABA");
        treeSet.add("123");
        //treeSet.stream().sorted();

        for (String value : treeSet){
            System.out.println(value);
        }
    }
}

package Bai8_Collections;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {

        //Khai báo kiểu dữ liệu Map
        Map<String, String> map = new HashMap<>();

        //Thêm giá trị dạng key=value
        map.put("name", "Anh Tester");
        map.put("age", "30");
        map.put("address", "Cần Thơ");

        //Truy xuất giá trị thông qua Key
        System.out.println(map.get("name"));

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

    }
}

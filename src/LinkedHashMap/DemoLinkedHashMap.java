package LinkedHashMap;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> ages = new LinkedHashMap<>();

        ages.put("Hải", 26);
        ages.put("Minh", 30);
        ages.put("An", 22);

        System.out.println(ages);
    }
}

// Ưu điểm của LinkedHashMap
//1. Giữ thứ tự phần tử
//
//Khác với HashMap, khi in ra sẽ theo đúng thứ tự thêm vào.
//
//2. Truy cập khá nhanh (gần như HashMap)
//
//Tốc độ gần như HashMap → O(1).
//
//3. Dùng để làm cache (LRU Cache)
//
//Vì LinkedHashMap có thể thiết lập access order
//→ phần tử được truy cập gần nhất sẽ được đưa lên đầu.


// Nhược điểm của LinkedHashMap
//1. Tốn bộ nhớ hơn HashMap
//
//Vì nó dùng doubly-linked list để giữ thứ tự.
//
//2. Chậm hơn HashMap một chút
//
//Do phải duy trì thêm danh sách liên kết.
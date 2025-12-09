package TreeMap;

import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();


        students.put(2, "Hải");
        students.put(1, "Minh");
        students.put(3, "An");


        System.out.println(students);
    }
}
// Ưu điểm của TreeMap
//
//Tự sắp xếp key (có thứ tự)
//
//Tìm kiếm theo phạm vi rất mạnh (firstKey, lastKey, higherKey...)
//
//Dữ liệu luôn được tổ chức đẹp và dễ duyệt

// Nhược điểm
//
//Chậm hơn HashMap (vì phải sắp xếp) → O(log n)
//
//Không cho key = null
//
//Tốn tài nguyên hơn
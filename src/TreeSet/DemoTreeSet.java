package TreeSet;

import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> names = new TreeSet<>();

        names.add(1);
        names.add(2);
        names.add(7);
        names.add(6);
        names.add(4);
        names.add(7);


        System.out.println(names);
    }
}

// Ưu điểm của TreeSet
//1. Tự động sắp xếp
//
//Các phần tử luôn được sắp theo thứ tự tăng dần (natural order).
//
//2. Không cho phép trùng lặp
//
//Giống các Set khác → tự loại bỏ phần tử trùng.
//
//3. Tìm kiếm, lấy phần tử theo thứ tự rất thuận tiện
//
//Ví dụ:
//first() → phần tử nhỏ nhất
//last() → phần tử lớn nhất
//
//higher(x) → phần tử lớn hơn x
//
//lower(x) → phần tử nhỏ hơn x
//
//4. Dựa trên Red-Black Tree ⇒ luôn cân bằng
//
//Thời gian xử lý ổn định.


// Nhược điểm (Disadvantages) của TreeSet
//1. Hiệu năng chậm hơn HashSet
//
//Mọi thao tác đều phải sắp xếp → O(log n), trong khi HashSet chỉ O(1).
//
//2. Không lưu được null
//
//Vì null không thể so sánh để sắp xếp.
//
//3. Tốn tài nguyên hơn
//
//Do TreeSet dùng cây nhị phân cân bằng → cần nhiều thao tác hơn.
//
//4. Bắt buộc phần tử phải Comparable
//
//Nếu là object tự định nghĩa → bạn phải implement Comparable hoặc cung cấp Comparator.
//
//5. Không truy cập theo index
//ví dụ : set.get(0); // lỗi

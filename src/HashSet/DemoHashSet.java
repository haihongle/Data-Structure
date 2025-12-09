package HashSet;

import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Minh hải");
        names.add("Hải");
        names.add("Minh");
        names.add("An");
        names.add("Hải");  // phần tử trùng -> bị loại bỏ
        names.add("Minh hải 2");

        System.out.println(names);
    }
}
//Ưu điểm của HashSet
//✔ Nhanh (do dùng hashing)
//
//Thao tác tìm kiếm và thêm rất nhanh.
//
//✔ Không có phần tử trùng lặp
//
//Rất phù hợp cho:
//
//lọc trùng email
//
//danh sách ID
//
//danh sách tag
//
//kiểm tra phần tử đã xuất hiện hay chưa


// Nhược điểm của HashSet
//Không có thứ tự
//
//Không phù hợp nếu bạn cần in theo:
//
//thứ tự chèn
//
//thứ tự tăng dần
//
// Không truy cập theo index
//
//Không thể gọi get(0) như ArrayList.
//
//Tốn bộ nhớ hơn so với List
//
//Do sử dụng bảng băm.
package ArrayList;

import java.util.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Tạo ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Thêm phần tử
        names.add("Hải");
        names.add("Minh");
        names.add("Trang");
        names.add("An");

        // In các phần tử
        System.out.println("Danh sách tên:");
        System.out.println(names);

        // Lấy phần tử theo index
        System.out.println("\nPhần tử thứ nhất: " + names.get(0));

        // Sửa phần tử
        names.set(1, "Minh Updated");

        // Xóa phần tử
        names.remove("An");

        // Duyệt danh sách bằng for-each
        System.out.println("\nDuyệt ArrayList:");
        for (String n : names) {
            System.out.println(n);
        }

        // Kích thước danh sách
        System.out.println("\nSố lượng phần tử: " + names.size());
    }
}
//ArrayList dùng để lưu trữ các phần tử dữ liệu
//
//Linh hoạt hơn mảng (array)
//
//Tự động tăng kích thước
//
//Thêm/xoá dễ dàng
//
//Truy cập bằng index
//
//Chấp nhận dữ liệu trùng lặp

//ưu điểm : ArrayList truy cập nhanh
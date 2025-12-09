package LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        // Thêm phần tử
        names.add("Hải");
        names.add("Minh");
        names.add("Trang");

        // Thêm vào đầu danh sách
        names.addFirst("An");

        // Thêm vào cuối danh sách
        names.addLast("Hoàng");

        // In danh sách
        System.out.println("LinkedList:");
        System.out.println(names);

        // Lấy phần tử
        System.out.println("Phần tử đầu: " + names.getFirst());
        System.out.println("Phần tử cuối: " + names.getLast());

        // Xoá phần tử
        names.remove("Minh");
        names.removeFirst();
        names.removeLast();

        // Duyệt danh sách
        System.out.println("Duyệt LinkedList:");
        for (String n : names) {
            System.out.println(n);
        }
    }
}
//
//LinkedList dùng để Lưu trữ nhiều phần tử dữ liệu
//
//Thêm phần tử
//
//Xoá phần tử
//
//Sửa phần tử
//
//Duyệt phần tử
//
//Chấp nhận dữ liệu trùng lặp

//ưu điểm : LinkedList thêm/xoá nhanh
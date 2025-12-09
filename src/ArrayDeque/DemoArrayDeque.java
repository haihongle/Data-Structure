package ArrayDeque;

import java.util.ArrayDeque;

public class DemoArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10); // thêm đầu
        deque.addLast(20);  // thêm cuối
        deque.addFirst(5);  // thêm đầu

        System.out.println(deque);

        deque.removeLast(); // xoá cuối
        System.out.println(deque);
    }
}
//ArrayDeque là gì?
//
//Deque = Double Ended Queue → hàng đợi 2 đầu.
//
//ArrayDeque là cấu trúc hàng đợi được triển khai bằng mảng động, cho phép:
//
//Thêm/xoá ở đầu (front)
//
//Thêm/xoá ở cuối (back)
//➜ Rất nhanh → O(1).
//
//Nó thay thế Stack và LinkedList trong nhiều trường hợp.
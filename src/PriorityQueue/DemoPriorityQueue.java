package PriorityQueue;

import java.util.PriorityQueue;

public class DemoPriorityQueue {
    public static void main(String[] args){
        PriorityQueue pq = new PriorityQueue();

        pq.add(30);
        pq.add(20);
        pq.add(40);
        pq.add(50);
        pq.add(60);

        System.out.println(pq);

        System.out.println("Lấy phần tử ưu tiên nhất: " + pq.poll()); // 5
        System.out.println("Lấy tiếp: " + pq.poll());
    }
}
//PriorityQueue
//
//Là hàng đợi ưu tiên, các phần tử tự động sắp xếp theo thứ tự ưu tiên (mặc định là tăng dần).
//
//Không giống Queue bình thường (FIFO), PriorityQueue lấy phần tử nhỏ nhất ra trước.
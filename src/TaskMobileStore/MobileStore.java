package TaskMobileStore;

import java.util.*;

public class MobileStore {
    public static void main(String[] args) {

        // 1. Array — danh sách hãng cố định
        // dùng Array khi số lượng phần tử cố định( không thêm/xóa)
        String[] brands = {"Apple", "Samsung", "Xiaomi", "Oppo"};
        System.out.println("Hãng có trong cửa hàng: " + Arrays.toString(brands));


        // 2. ArrayList — danh sách sản phẩm
        //dùng khi Cần thêm/xóa sản phẩm liên tục
        ArrayList<String> products = new ArrayList<>();
        products.add("iPhone 15");
        products.add("Galaxy S23");
        products.add("Xiaomi 13");
        products.add("Oppo Reno 10");

        System.out.println("\nSản phẩm đang bán: " + products);

        products.remove("Xiaomi 13");
        System.out.println("Sau khi xóa: " + products);


        // 3. LinkedList — hàng chờ khách hàng
        LinkedList<String> customerQueue = new LinkedList<>();
        //dùng LinkedList khi thêm/xóa sản phẩm liên tục
        customerQueue.addLast("Khách 1");
        customerQueue.addLast("Khách 2");
        customerQueue.addLast("Khách 3");

        System.out.println("\nHàng chờ khách: " + customerQueue);

        String next = customerQueue.removeFirst();
        System.out.println("Gọi phục vụ: " + next);
        System.out.println("Hàng chờ còn lại: " + customerQueue);


        // 4. HashMap — bảng giá
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("iPhone 15", 25000000);
        priceMap.put("Galaxy S23", 18000000);
        priceMap.put("Oppo Reno 10", 12000000);

        System.out.println("\nGiá của iPhone 15: " + priceMap.get("iPhone 15") + " VNĐ");


        // 5. Map — cấu hình hệ thống (chỉ đọc)
        Map<String, String> config = Map.of(
                "app", "Mobile Store Manager",
                "version", "1.0",
                "region", "VN"
        );
        //chỉ dùng Map khi không thay đổi dữ liệu

        System.out.println("\nCấu hình hệ thống: " + config);
    }
}

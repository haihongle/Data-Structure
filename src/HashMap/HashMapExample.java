package HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> ages = new HashMap<>();

        // Thêm phần tử (key, value)
        ages.put("Hải", 25);
        ages.put("Minh", 22);
        ages.put("Trang", 20);

        // Lấy value theo key
        System.out.println("Tuổi của Hải: " + ages.get("Hải"));

        // Kiểm tra tồn tại
        System.out.println("Có chứa key 'Trang' không? " + ages.containsKey("Trang"));

        // Xóa theo key
        ages.remove("Minh");

        // Duyệt toàn bộ HashMap
        System.out.println("Duyệt HashMap:");
        for (String key : ages.keySet()) {
            System.out.println(key + " - " + ages.get(key));
        }
    }
}

//Ưu điểm của HashMap
//1. Tốc độ truy xuất và thêm phần tử rất nhanh (O(1))
//
//HashMap dùng băm (hashing), nên tìm kiếm, chèn, xóa thường rất nhanh.
//
//Nhanh hơn so với ArrayList, LinkedList, TreeMap.
//
//2. Cho phép lưu dữ liệu dạng key–value
//
//Mỗi phần tử gồm:
//key → value
//
//Tra cứu theo key rất tiện.
//
//3. Key không được trùng
//
//HashMap tự tránh lỗi key trùng.
//
//Nếu thêm key trùng → nó ghi đè value cũ.
//
//4. Cho phép chứa value trùng lặp + null
//
//value có thể trùng
//
//key có thể là null (nhưng chỉ 1 lần)
//
//5. Linh hoạt và dùng nhiều trong thực tế
//
//Ví dụ:
//
//Lưu tài khoản theo username
//
//Lưu sản phẩm theo ID
//
//Lưu số điện thoại theo tên
//


// Nhược điểm của HashMap
//1. Không giữ thứ tự phần tử
//
//HashMap không đảm bảo thứ tự khi in ra.
//
//Nếu cần thứ tự → dùng LinkedHashMap.
//
//2. Tốn bộ nhớ hơn
//
//Do cơ chế hashing + buckets → tốn RAM hơn list.
//
//3. Dễ xảy ra va chạm hash (collision)
//
//Khi nhiều key có hash giống nhau → hiệu năng giảm.
//
//4. Không thread-safe
//
//Không dùng an toàn trong môi trường đa luồng.
//→ nếu cần thread-safe → dùng ConcurrentHashMap.
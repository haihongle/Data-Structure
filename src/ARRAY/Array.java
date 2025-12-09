package ARRAY;

public class Array {
    //Mảng rỗng
    int[] emptyArr = {};

    //Mảng số nguyên
    int[] numbers = {5, 2, 9, 1, 7};

    //Mảng chuỗi (String array)
    String[] names = {"Hải", "An", "Minh", "Trang"};

    //Mảng ký tự (char array)
    char[] letters = {'a', 'b', 'c', 'd'};

    //Mảng 2 chiều
    int[][] scores = {
            {90, 85, 88},
            {70, 95, 80},
            {100, 90, 92}
    };

    public static void main(String[] args) {

        Array arr = new Array();

        // In mảng 1 chiều
        System.out.println("Mảng số nguyên:");
        for (int x : arr.numbers) System.out.print(x + " ");
        System.out.println();

        System.out.println("\nMảng chuỗi:");
        for (String x : arr.names) System.out.print(x + " ");
        System.out.println();

        System.out.println("\nMảng ký tự:");
        for (char x : arr.letters) System.out.print(x + " ");
        System.out.println();

        // In mảng 2 chiều
        System.out.println("\nMảng 2 chiều (scores):");
        for (int i = 0; i < arr.scores.length; i++) {
            for (int j = 0; j < arr.scores[i].length; j++) {
                System.out.print(arr.scores[i][j] + " ");
            }
            System.out.println();
        }
    }

}

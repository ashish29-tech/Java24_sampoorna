package Lec_12;

public class Search_2D_Matrix_II_BruteForce {
//	Tumhara code actually general case solve karta hai: O(m × n)
//	👉 Lekin kyunki yahan matrix square hai (5×5), isko simplify karke bolte hain: O(n²)
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        int target = 5;

//        boolean ans = searchMatrix(matrix, target);
//        System.out.println(ans);
        System.out.println(searchMatrix(matrix, target));
        System.out.println(searchMatrix(matrix, target));
        

    }
//    Why [0] specifically?
//    kisi bhi valid 2D matrix me pehli row representative hoti hai
//    usse columns ka size mil jata hai

    public static boolean searchMatrix(int[][] matrix, int target) {
//    	matrix.length meaning number of rows
//    	matrix[0].length meaning number of columns

        int m = matrix.length;
//        matrix[0] isliye liya hai because pehli row ko reference bana ke columns count karte hain.
//        matrix[0].length: first row me kitne elements hain... yani columns count
        int n = matrix[0].length; //matrix ki 0th row (first row)

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
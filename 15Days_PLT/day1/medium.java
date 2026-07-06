//74. Search a 2D Matrix

import java.util.*;

public class medium {

    public boolean searchMatrix(int[][] matrix, int target) {
        //Type your code here...
        int r =0 , c = matrix[0].length-1;
        
        while(r<matrix.length && c>=0){
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] < target) r++;
            else c--;

        }
        return false;
        
    }


    private static int[][] parseMatrix(String s) {
        s = s.substring(2, s.length() - 2);    
        String[] rows = s.split("\\],\\[");

        int[][] matrix = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] nums = rows[i].split(",");
            matrix[i] = new int[nums.length];
            for (int j = 0; j < nums.length; j++) {
                matrix[i][j] = Integer.parseInt(nums[j].trim());
            }
        }
        return matrix;
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read single-line matrix
        String matrixStr = sc.nextLine();

        // Read target
        int target = sc.nextInt();

        int[][] matrix = parseMatrix(matrixStr);

        Solution sol = new Solution();
        System.out.println(sol.searchMatrix(matrix, target));

        sc.close();
    }
}

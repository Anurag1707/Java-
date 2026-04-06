// package lect2;



public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {5, 6, 7},
            {9, 10, 11}
        };

        int top = 0, bottom = 2;
        int left = 0, right = 2;

        

        while (top <= bottom && left <= right) {

            // Top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
                
            }
        }
    }
}

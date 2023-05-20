// Print Spiral

// For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
// a. First row(left to right)
// b. Last column(top to bottom)
// c. Last row(right to left)
// d. First column(bottom to top)
//  Mind that every element will be printed only once.


// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'M' column values separated by a single space.
// Output format :
// For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

// Output for every test case will be printed in a seperate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^3
// 0 <= M <= 10^3
// Time Limit: 1sec
// Sample Input 1:
// 1
// 4 4 
// 1 2 3 4 
// 5 6 7 8 
// 9 10 11 12 
// 13 14 15 16
// Sample Output 1:
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
// Sample Input 2:
// 2
// 3 3 
// 1 2 3 
// 4 5 6 
// 7 8 9
// 3 1
// 10
// 20
// 30
// Sample Output 2:
// 1 2 3 6 9 8 7 4 5 
// 10 20 30 






import java.util.Scanner;

class Main {
    public static void spiralPrint(int[][] matrix, int rows, int columns) {
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;
        int direction = 0;
        
        while (top <= bottom && left <= right) {
            if (direction == 0) {
                // Print the top row from left to right
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
            } else if (direction == 1) {
                // Print the right column from top to bottom
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
            } else if (direction == 2) {
                // Print the bottom row from right to left
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            } else if (direction == 3) {
                // Print the left column from bottom to top
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
            
            // Update the direction
            direction = (direction + 1) % 4;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int rows = scanner.nextInt();
            int columns = scanner.nextInt();

            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            spiralPrint(matrix, rows, columns);
            System.out.println();
        }

        scanner.close();
    }
}

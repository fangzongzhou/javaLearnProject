package isToeplitzMatrix;

public class Solution {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        // Write your code here
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        for (int curColumnNum = 0; curColumnNum < columnCount; curColumnNum++) {
            int indexNum = matrix[0][curColumnNum];
            for (int curRowNum = 0; curRowNum < rowCount; curRowNum++) {
                if ((curColumnNum + curRowNum) % columnCount == 0) {
                    indexNum = matrix[curRowNum][(curColumnNum + curRowNum) % columnCount];
                }
                if (indexNum != matrix[curRowNum][(curColumnNum + curRowNum) % columnCount]) {
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        System.out.println(isToeplitzMatrix(matrix));
    }
}

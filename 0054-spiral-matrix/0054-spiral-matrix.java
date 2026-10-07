import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        
        // Edge case: check if the matrix is empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // top 
            for (int j = startcol; j <= endcol; j++) {
                result.add(matrix[startrow][j]); // Add to list instead of printing
            }

            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                result.add(matrix[i][endcol]);
            }

            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                // Prevent duplicate processing in single-row matrices
                if (startrow == endrow) {
                    break;
                }
                result.add(matrix[endrow][j]);
            }

            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                // Prevent duplicate processing in single-column matrices
                if (startcol == endcol) {
                    break;
                }
                result.add(matrix[i][startcol]);
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        
        return result; 
    } 
}

//Task
//Given two positive integers m (width) and n (height), fill a two-dimensional list (or array) of size m-by-n in the following way:
//
//(1) All the elements in the first and last row and column are 1.
//
//(2) All the elements in the second and second-last row and column are 2, excluding the elements from step 1.
//
//(3) All the elements in the third and third-last row and column are 3, excluding the elements from the previous steps.
//
//And so on ...
//
//Examples
//create_box(5, 8) should return
//
//[[1, 1, 1, 1, 1],
// [1, 2, 2, 2, 1],
// [1, 2, 3, 2, 1],
// [1, 2, 3, 2, 1],
// [1, 2, 3, 2, 1],
// [1, 2, 3, 2, 1],
// [1, 2, 2, 2, 1],
// [1, 1, 1, 1, 1]]
package kyu_7;

public class SpiralingBox {
    public static int[][] createBox(int width, int length)
    {
        int[][] box = new int[length][width];

        // Fill in the values
        for (int i = 0; i < Math.min(width, length) / 2 + Math.min(width, length) % 2; i++) {
            for (int j = i; j < width - i; j++) {
                box[i][j] = i + 1;
                box[length - 1 - i][j] = i + 1;
            }
            for (int j = i + 1; j < length - i - 1; j++) {
                box[j][i] = i + 1;
                box[j][width - 1 - i] = i + 1;
            }
        }

        return box;
    }
}

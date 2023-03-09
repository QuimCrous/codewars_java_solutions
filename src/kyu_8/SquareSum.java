//Complete the square sum function so that it squares each number passed into it and then sums the results together.
//
//For example, for [1, 2, 2] it should return 9 because
//1
//2
//+
//2
//2
//+
//2
//2
//=
//9
//1
//2
// +2
//2
// +2
//2
// =9.
package kyu_8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SquareSum {
    public static int squareSum(int[] n)
    {
        //Your Code
        return Arrays.stream(n).map(num -> num*num).sum();
    }
}

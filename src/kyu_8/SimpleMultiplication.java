//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
package kyu_8;

public class SimpleMultiplication {
    public static int simpleMultiplication(int n) {
        //your code here
        return n%2 == 0 ? n*8 : n*9;
    }
}

//In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is to convert that string to either lowercase only or uppercase only based on:
//
//make as few changes as possible.
//if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
//For example:
//
//solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
//solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
//solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
//More examples in test cases. Good luck!
package kyu_7;

public class FixStringCase {
    public static String solve(final String str) {
        int countLower = 0;
        int countUpper = 0;

        // Count the number of uppercase and lowercase letters
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                countUpper++;
            } else {
                countLower++;
            }
        }

        // Convert the string to either all uppercase or all lowercase
        if (countLower >= countUpper) {
            return str.toLowerCase();
        } else {
            return str.toUpperCase();
        }
    }
}

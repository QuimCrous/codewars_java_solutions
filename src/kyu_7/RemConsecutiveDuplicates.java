//Your task is to remove all consecutive duplicate words from a string, leaving only first words entries. For example:
//
//"alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"
//
//--> "alpha beta gamma delta alpha beta gamma delta"
package kyu_7;

public class RemConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String s){
        //solution
        String[] words = s.split(" ");
        String result = words[0] + " ";
        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(words[i-1])){
                result += words[i] + " ";
            }
        }

        return result.trim();
    }
}

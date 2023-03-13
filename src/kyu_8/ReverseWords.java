//Complete the solution so that it reverses all of the words within the string passed in.
//
//Words are separated by exactly one space and there are no leading or trailing spaces.
//
//Example(Input --> Output):
//
//"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
package kyu_8;

public class ReverseWords {
    public static String reverseWords(String str){
        //write your code here...
        String[] strArray = str.split(" ");
        String result = "";
        for (int i = 0; i < strArray.length; i++) {
            result += strArray[strArray.length-1-i] + " ";
        }
        return result.trim();
    }
}

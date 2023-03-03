//Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.
//
//Example:
//
//"riley" --> "Hello Riley!"
//"JACK"  --> "Hello Jack!"
package kyu_7;

public class GreetMe {
    public static String greet(String name){
        String s1 = name.substring(0,1).toUpperCase();
        String s2 = name.substring(1).toLowerCase();
        return "Hello " + s1.concat(s2)+"!";
    }
}

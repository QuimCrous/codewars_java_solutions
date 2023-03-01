package kyu_8;//Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
//
//For example,
//
//[true,  true,  true,  false,
//  true,  true,  true,  true ,
//  true,  false, true,  false,
//  true,  false, false, true ,
//  true,  true,  true,  true ,
//  false, false, true,  true]
//The correct answer would be 17.
//
//Hint: Don't forget to check for bad values like null/undefined


import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        AtomicInteger counter = new AtomicInteger();
        Arrays.stream(arrayOfSheeps).forEach((sheep) -> {
            if (sheep == true) {
                counter.getAndIncrement();
            }
        });
        return counter.get();

    }
}



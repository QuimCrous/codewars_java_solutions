import kyu_7.ArrayPacking;
import kyu_7.CountDig;
import kyu_7.Progression;
import kyu_8.Barycenter;
import kyu_8.Counter;
import kyu_8.Kata;
import kyu_8.XX_XY;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //kyu_8.Kata 8 kyu
        //Counting sheep...
        Boolean[] prob ={true,  true,  true,  false, true,  true,  true,  true,true,  false, true,  false, true,  false, false, true,true,  true,  true,  true ,false, false, true,  true};
        System.out.println(Counter.countSheeps(prob));

        //kyu_8.Kata 8 kyu
        //Unexpected parsing
        Boolean isBusy = true;
        System.out.println(Kata.getStatus(isBusy));

        //kyu_8.Kata 8 kyu
        //Determine offspring sex based on genes XX and XY chromosomes
        String sperm = "XX";
        System.out.println(XX_XY.chromosomeCheck(sperm));

        //Kata 8 kyu
        //Localize The Barycenter of a Triangle
        double[] x = {4, 6};
        double[] y = {12, 4};
        double[] z = {10, 10};
        double[] result = Barycenter.barTriang(x,y,z);
        Arrays.stream(result).forEach((el) -> System.out.println(el));

        //Kata 7 kyu
        //Count the Digit
        int n =5750;
        int d= 0;
        System.out.println(CountDig.nbDig(n,d));

        //Kata 7 kyu
        //Arithmetic progression
        System.out.println(Progression.arithmeticSequenceElements(1,1,10));

        System.out.println(ArrayPacking.packArray(new int[] {24, 85, 0}));

    }
}
//Unfinished Loop - Bug Fixing #1
//Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!

package kyu_8;

import java.util.ArrayList;
import java.util.List;

public class InfiniteLoopSolv {
    public static List CreateList(int number)
    {
        List list = new ArrayList();
        //In the loop wasn't added the part to +1 to the counter, so it didn't arrive at the condition to end the loop
        for(int count = 1; count <= number;count++)
        {
            list.add(count);
        }

        return list;
    }
}

package day02;

import java.util.Arrays;

public class C03_ArraysEqual {
    //2 array esit mi ?

    public static boolean arrayEqual(Object[] a, Object[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}

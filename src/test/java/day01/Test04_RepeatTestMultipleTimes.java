package day01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_RepeatTestMultipleTimes {
    //Testi tekrarlatmak istiyorsam
    @RepeatedTest(5)
    @Disabled
    void testSubString(){
        assertEquals("Java", "Java cok güzel".substring(0,4));
    }
    Random rm = new Random();
    @RepeatedTest(5)
    void testRepeat(){
        int sayi = rm.nextInt(10);
        int sayi2 = rm.nextInt(10);
        assertEquals(sayi+sayi2,Math.addExact(sayi,sayi2));
    }
}

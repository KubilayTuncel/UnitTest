package day01;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test05_PerformanceTest {
    @Test
    void testPrintPerformance() {
        assertTimeout(Duration.ofSeconds(1),
                ()-> IntStream.rangeClosed(1,100000).forEach(System.out::println)); //IntStream bize bir integer akis saglar
                                                                            //arkasinda ilk eleman ve son elemani veriyorum.
    }

    //2.örnek
    @Test
    void testPerformans() {
        assertTimeout(Duration.ofMillis(100),
                ()->IntStream.rangeClosed(1,5000).reduce((x,y)->Math.addExact(x,y)));
    }
}

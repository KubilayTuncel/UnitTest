package day01;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test06_GroupingTests {

    //amacimiz : Ayni sinifda birbirleriyle iliskili testleri gruplamak icin kullanilir

    @Nested
    class testMultiply{
        @ParameterizedTest
        @CsvSource(value = {
           "-12, -4, 3", "-12, 4, -3", "12, -4, -3"
        })
        void testMultiplyWithNonZero(int rs, int sayi1, int sayi2){
            assertEquals(rs, Math.multiplyExact(sayi1,sayi2));
        }

        @ParameterizedTest
        @CsvSource(value = {
                "0, -4, 0", "0, 0, -3", "0, -4, 0"
        })
        void testMultiplyWithZero(int rs, int sayi1, int sayi2){
            assertEquals(rs, Math.multiplyExact(sayi1,sayi2));
        }
    }

    @Nested
    class testAdd{
        @ParameterizedTest
        @CsvSource(value = {"-1, -4, 3", "1, 4, -3", "-7, -4, -3"})
        void testAddWithNoneZero(int rs, int sayi1, int sayi2){
            assertEquals(rs, Math.addExact(sayi1, sayi2));
        }

        @ParameterizedTest
        @CsvSource(value = {"-4, -4, 0", "1, 1, 0", "0, -4, 4"})
        void testAddWithZero(int rs, int sayi1, int sayi2){
            assertEquals(rs, Math.addExact(sayi1, sayi2));
        }
    }
}

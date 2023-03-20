package day02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C02_FirstTwoLastCharsSameTest {
    C02_FirstTwoLastCharsSame obj = new C02_FirstTwoLastCharsSame();

    @ParameterizedTest
    @CsvSource(value = {"true, ABAB", "true, BABA", "false, ABCD", "true, AB", "false, B"})
    void checkIfFristTwoLastTwoAreSameTest(boolean rs, String str){
        assertEquals(rs, obj.FirstTwoLastCharsSame(str));
    }
}

package day02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_StringModifyTest {
    C01_StringModify stringModify;

    @BeforeEach
    void setup(){
        stringModify = new C01_StringModify();
    }

    @ParameterizedTest
    @CsvSource(value = {"BC, AABC", "BA, ABA", "BC, BAC"})
    void deleteA(String expected, String actual){
        assertEquals(expected,stringModify.deleteAIfIsInFirstTwoPosition(actual));
    }

    @AfterEach
    void tearDown(){
        stringModify = null;
    }
}

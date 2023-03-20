package day01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_ParameterizedTest {

    @Test
    void testLength() {
        assertTrue("Mirac".length()>0);
        assertTrue("Osman".length()>0);
        assertTrue("Seyma".length()>0);
        assertTrue("Beyza".length()>0);
    }

    //daha kullanisli olan parametreli test methodumuzu yaziyoruz.
    @ParameterizedTest
    @ValueSource(strings = {"Mirac", "Osman", "Seyma", "Beyza"})
    void testLength2(String str){
        assertTrue(str.length()>0);
    }

    //baska bir örnek
    @Test
    void testUpperCase() {
        String str1 = "merhaba";
        String str2 = "Java";
        String str3 = "Test";

        assertEquals("MERHABA", str1.toUpperCase());
        assertEquals("JAVA", str2.toUpperCase());
        assertEquals("TEST", str3.toUpperCase());
    }

    //coma-seperated özelligi kullaniyorum
    // ekstra bir islem yapacaksak CsvSource kullanarak key, value seklinde calisabiliyoruz.
    @ParameterizedTest
    @CsvSource(value =
            {
                    "MERHABA, Merhaba",
                    "JAVA, Java",
                    "TEST, Test"
            })
    void testUpperCase2(String str1, String str2){
        assertEquals(str1,str2.toUpperCase());
    }

    //3. Örnek
    @ParameterizedTest
    @CsvSource(value = { //assetTrue ya da False yerine assertEquals ile tek line da islemi cözdük.
            "true, java, a",
            "true, junit, u",
            "false, hello, a"
    })
    void testContains(Boolean b1, String str1, String str2){
        assertEquals(b1,str1.contains(str2));
    }
}

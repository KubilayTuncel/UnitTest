package day01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test02_DisplayName {

    @Test
    @DisplayName("Test parseInt() methoduna nümeric olmayan argüman gönderildiginde firlatilan exception u test ediyor.")
    void testException(){
        String str = "Merhaba";

        assertThrows(NumberFormatException.class, ()->{
           Integer.parseInt(str);
        });
    }
}

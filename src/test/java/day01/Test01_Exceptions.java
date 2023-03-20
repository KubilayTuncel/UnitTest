package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_Exceptions {

    @Test
    public void testException() {
        String str = "Merhaba JUnit";
        assertThrows(NullPointerException.class, ()->{ // bu test exception firlatiyor mu firlatmiyor mu onu check ediyoruz.
            System.out.println("testException calisti.");
        });
    }

    @Test
    public void testException2(){
        int sayi1 = 5;
        int sayi2 = 0;
        assertThrows(ArithmeticException.class,()->{
            System.out.println(sayi1/sayi2);
        });
    }

    @Test
    void testException3(){
        assertThrows(ArithmeticException.class,()->divide(1,0));
    }

    private int divide(int a, int b){
        return a/b;
    }
}

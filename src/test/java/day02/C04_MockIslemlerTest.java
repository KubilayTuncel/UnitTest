package day02;

import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.mockito.Mockito.*;


public class C04_MockIslemlerTest {

    @Test
    void islemler(){
        C04_MockIslemler dummyObject = Mockito.mock(C04_MockIslemler.class);
        dummyObject.ekleOgrenci("Kasim");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.guncelleOgrenci("Ahmet");

        verify(dummyObject).ekleOgrenci("Kasim");
        verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");

    }

    //methodun kac kere cagirildigini test edelim
    @Test void testKacDefaCagirildi() {
        C04_MockIslemler obj = Mockito.mock(C04_MockIslemler.class);

        obj.ekleOgrenci("Ahmet");
        obj.ekleOgrenci("Ahmet");
        obj.ekleOgrenci("Mehmet");

        verify(obj, times(2)).ekleOgrenci("Ahmet");

        //Halide parametresi ile ekleOgrenci() methodu hic cagrilmama kontrol etmek istersek
        verify(obj, times(0)).ekleOgrenci("Halide");

        //herhangi bir parametre ile cagirilmayan method

        verify(obj, never()).silOgrenci(anyString());

        //methodun en az 2 defa cagirildigi durumu test edelim
        verify(obj, atLeast(2)).ekleOgrenci("Ahmet");
    }

    //methodlarin cagirilma sirasini test edebiliriz. Hatta girilen value'lari da kontrol ediyor.
    @Test
    void siraliCagirilma() {
        C04_MockIslemler obj = Mockito.mock(C04_MockIslemler.class);

        obj.ekleOgrenci("Ahmet");
        obj.ekleOgrenci("Hüseyin");
        obj.silOgrenci("Ahmet");

        InOrder inOrder = inOrder(obj);

        inOrder.verify(obj).ekleOgrenci("Ahmet");
        inOrder.verify(obj).ekleOgrenci("Hüseyin");
        inOrder.verify(obj).silOgrenci("Ahmet");
    }
}

package day02;

public class C02_FirstTwoLastCharsSame {

    //ilk 2 ve son 2 karakteri ayni olan kelimeyi bulan method

    public boolean FirstTwoLastCharsSame(String str) {

        if (str.length()<2) return false;
        if (str.length()==2) return true;

        String firstTwoChars = str.substring(0,2);
        String lastTwoChars = str.substring(str.length()-2);
        return firstTwoChars.equals(lastTwoChars);
    }
}

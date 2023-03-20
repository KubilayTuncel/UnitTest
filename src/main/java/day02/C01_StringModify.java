package day02;

public class C01_StringModify {

    //Task: kelimenin ilk iki harf icerisinde A varsa silinsin,
    //kelimelerin hepsi büyük harf olarak verilecek.

    public String deleteAIfIsInFirstTwoPosition(String str){
        if (str.length()<=2) return  str.replace("A","");
        String firstTwoChars = str.substring(0,2);
        String afterFirstTwoChars = str.substring(2);
        return  firstTwoChars.replaceAll("A","") + afterFirstTwoChars;
    }
}

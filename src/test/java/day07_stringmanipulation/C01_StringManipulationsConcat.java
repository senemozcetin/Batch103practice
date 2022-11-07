package day07_stringmanipulation;

import java.util.Scanner;

public class C01_StringManipulationsConcat {


    public static void main(String[] args) {
        // Kullanicidan ismini ve soyismini girmesini isteyin, sonrasinda konsola
        // kullanici nasil girerse girsin buyuk harfalerle yazdirin
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ad ve soyadinizi giriniz");

        String isim = input.nextLine(), soyisim =input.nextLine();

        String tamisim= isim.concat(" "+soyisim).toUpperCase();

        System.out.println("Tam isim : "+ tamisim);

        /** substring()
         //substring() in iki kullanimi vardir.
         //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
         //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar. Sonuc ise String dir.
         */

        //10.index dahil sonuna kadar verilen Stringi yazdiriniz
        String cumle = "Her dert Java gibi olsa";
        System.out.println("Her dert Java gibi olsa >>> "+ cumle.substring(10));// gibi olsa



        //son 10 harfi yazdirin >>>>gibi olsa:
        System.out.println("Her dert Java gibi olsa >>> "+ cumle.substring(cumle.length()-9));


        // ilk 10 karakteri yazdirma yontemi//Her dert J
        System.out.println(cumle.substring(0,10));//Her dert J



        // 11.ci karakterden sonuna kadar olan Stringi yazdiralim
        System.out.println(cumle.substring(10));//ava gibi olsa




    }
}

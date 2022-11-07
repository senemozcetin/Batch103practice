package day07_stringmanipulation;

import java.util.Scanner;

public class C06_StringManipulationsLength {
    public static void main(String[] args) {

        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */

        String cumle= "Bugun hava yagmurlu";
        System.out.println(cumle.length());//19

        String str1="";
        System.out.println(str1.length());//0

        String str2=" ";
        System.out.println(str2.length());//1


        // Kullanicidan ismini ve soyismini isteyin
        // Isim mi soyisim mi daha uzun yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println("Isim daha uzun");
        }else if (soyisim.length()>isim.length()){
            System.out.println("soyisim daha uzun");
        }else if (isim.length()==soyisim.length()){
            System.out.println("Isim ve soyisim uzunlugu esittir");
        }


        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        System.out.println("Lutfen 4 karakterli bir kelime giriniz");
        String kelime= scan.nextLine();
        System.out.println(kelime.length());

        if (kelime.length()==4){
            char bir= kelime.charAt(0);
            char iki= kelime.charAt(1);
            char uc= kelime.charAt(2);
            char dort= kelime.charAt(3);

            System.out.println("Tersten yazilmis hali :"+dort+uc+iki+bir);

        }else if (kelime.length()>4){
            System.out.println("Girdiginiz kelime 4 karakterden fazla");
        }else if (kelime.length()<4){
            System.out.println("Girdiginiz kelime 4 karakterden az");
        }






























    }
}

package practiceAdvanced.practice02;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    public static void main(String[] args) {
        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

        Scanner input= new Scanner(System.in);
        System.out.println("Adinizi ve soyadinizi aralarinda bosluk olacak sekilde girin");
        String adSoyad= input.nextLine();
        String ad =adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyad= adSoyad.substring(adSoyad.indexOf(" ")+1);

        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+soyad);
    }
}

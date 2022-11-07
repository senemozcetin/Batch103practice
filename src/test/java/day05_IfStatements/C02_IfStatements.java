package day05_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {


        //Kullanicidan yasini isteyin
        //65 ve daha buyukse "Emekli olabilirsin"
        //65ten kucukse " Emekli olamazsin ? sene daha calisman lazim" yazdirin


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi pozitif sayi olarak giriniz...");
        int yas = input.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.print("Emekli olamazsin ");
            System.out.println(65-yas + " sene daha calismalisin");
        }

        // Nested if else
        if (yas >= 0) {
            if (yas >= 65) {
                System.out.println("Emekli Olabilirsin");
            } else {
                System.out.println(" Emekli olamazsin...");
                System.out.println(65 - yas + " sane daha calismalisin...");
            }
        } else {
            System.out.println(" Lutfen  sifirdan buyuk bir sayi giriniz");
        }



    }
}

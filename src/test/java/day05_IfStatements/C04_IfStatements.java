package day05_IfStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {


        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz..." + "\n Kadin icin K \n Erkek icin E harfini giriniz..");
        char cinsiyet= input.next().toUpperCase().charAt(0);

        System.out.println("Yasinizi giriniz");
        double yas= input.nextDouble();
        if (cinsiyet=='K'){
            if (yas<0 || yas>120){
                System.out.println("Lutfen dogru yas degerini giriniz..");
            }else if (yas>60){
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olamazsin "+ (60-yas)+ "yil daha calismalisin");
            }


        }else if (cinsiyet=='E'){
            if (yas<0 || yas>120){
                System.out.println("Lutfen dogru yas degerini giriniz..");
            }else if (yas>65){
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olamazsin " + (65 - yas) + "yil daha calismalisin");

            }
        }else System.out.println("Lutfen gecerli bir harf giriniz");


    }
}

package day05_IfStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

         //Soru 1) Kullanicidan maas icin bir teklif isteyin ve
        // asagidaki degerlere gore cevap yazdirin.
        //Teklif 20.000’in uzerinde ise “Kabul ediyorum” ,
        //10000 – 20.000 arasinda ise “Konusabiliriz”,
        //10.000’nin altinda ise “Maalesef Kabul edemem” yazdirin


        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen maas icin bir teklif yaziniz...");
        double maas = input.nextDouble();
        if (maas>20000){
            System.out.println("Kabul ediyorum...");
        }else if (maas>=10000 && maas<20000){
            System.out.println("Konusabiliriz...");
        }else if (maas<10000){
            System.out.println("Maalesef kabul edemem...");
        }

    }
}

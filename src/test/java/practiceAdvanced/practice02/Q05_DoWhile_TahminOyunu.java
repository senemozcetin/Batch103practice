package practiceAdvanced.practice02;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;
        int rastgeleSayi = (int)(Math.random()*100)+1;

        do {
            System.out.println("0-100 arası bir sayı tahmini giriniz");
            sayi = input.nextInt();
            if(sayi==rastgeleSayi){
                System.out.println("Tebrikler!!");
            } else if (sayi<rastgeleSayi) {
                System.out.println("Daha büyük bir sayı giriniz");
            }else {
                System.out.println("Daha küçük bir sayı giriniz");
            }
        }while (sayi!=rastgeleSayi);
    }
    }


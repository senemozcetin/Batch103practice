package day06nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {


         /*
            TASK :
               Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
               Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
               3 basamaklı degilse çift olup olmadigini kontrol edin.
               Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
               Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."

          */

        Scanner scan = new Scanner(System.in);
        System.out.println("0dan buyuk bir tamsayi giriniz");
        int sayi = scan.nextInt();

        String result = sayi>99 && sayi<1000 ? "3 basamakli" :
                (sayi%2==0 ? "3 basamakli olmayan cift sayi" :
                        "3 basamakli olmayan tek sayi");

        System.out.println(result);






    }
}

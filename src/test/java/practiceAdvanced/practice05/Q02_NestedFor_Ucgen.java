package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q02_NestedFor_Ucgen {
     /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Satir sayisini giriniz");
         int satir= input.nextInt();

         for (int i=0; i<satir;i++){
             for (int j=satir-i; j>1; j--){
                 System.out.print(" ");
             }
            for (int k=0; k<=i; k++){
                System.out.print("* ");
            }
             System.out.println();
         }
     }
}

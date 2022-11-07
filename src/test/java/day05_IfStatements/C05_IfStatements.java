package day05_IfStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {


        //Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen iki sayi griniz..");
        double sayi1= input.nextDouble();
        double sayi2= input.nextDouble();

        if (sayi1<sayi2){
            System.out.println("Buyuk olmayan sayi:" + sayi1);
        } else if (sayi1>sayi2) {
            System.out.println("Buyuk olmayan sayi:"+ sayi2);
        }else System.out.println("Sayilar birbirine esit..");


        System.out.println(sayi1==sayi2 ? "Sayilar esit" : sayi1>sayi2 ? sayi2 : sayi1);

    }
}

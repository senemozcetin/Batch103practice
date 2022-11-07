package day07_stringmanipulation;

import java.util.Scanner;

public class C08_StringManipulations {

    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        // @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        // @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

        String email="abc@gmail.co**";
        String arananMetin="@gmail.com";

        if(!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");

        }else if(email.endsWith(arananMetin)){
            System.out.println("Email adresiniz kaydedildi ");
        }else
            System.out.println("lutfen yazimi kontrol edin");




    }

}

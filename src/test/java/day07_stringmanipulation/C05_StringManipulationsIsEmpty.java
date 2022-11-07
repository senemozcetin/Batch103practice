package day07_stringmanipulation;

import java.util.Scanner;

public class C05_StringManipulationsIsEmpty {
    public static void main(String[] args) {


        String str1 = "Hi";
        System.out.println(str1.isEmpty());// false


        String str2="";
        System.out.println(str2.isEmpty());// true

        String str3= " ";
        System.out.println(str3.isEmpty());// false

        // Kullanicidan alacaginiz bir String te bosluk karakterini olup olmadigini kontrol ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str4= scan.nextLine();

        if (str4.contains(" ")){
            System.out.println("Bu String space icerir");
        }else{
            System.out.println("Bu String space icermiyor");
        }



    }
}

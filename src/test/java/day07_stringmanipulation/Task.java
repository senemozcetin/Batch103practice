package day07_stringmanipulation;

public class Task {

    public static void main(String[] args) {

        /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali
          */

                   String password= "abc123/.";
                   if (password.length()>7 &&
                           password.replace(" ","").length()>7 &&
                           password.replace("[^A-Z]","").length()>0 &&
                           password.endsWith(".")){
                       System.out.println("Gecerli password");
                   }else {
                       System.out.println("Gecersiz password");
                   }






    }
}

package practiceAdvanced.practice04;

public class Q05_StringBuilderPalindrome {
    public static void main(String[] args) {
        //Bir String degerin polindrome olup olmadigini kontrol eden kodu yaziniz

//        String str= "ali";
//        String reverse="";
//
//        for (int i=str.length()-1; i>-1;i--){
//            reverse += str.charAt(i);
//        }
//        System.out.println(reverse);
//        if (str.equalsIgnoreCase(reverse)){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Palindrome degil");
//        }

        String str = "nazan1";
        StringBuilder stb = new StringBuilder(str);
        String stbReverse = stb.reverse().toString();

        if (str.equals(stbReverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome degil");
        }












    }
}

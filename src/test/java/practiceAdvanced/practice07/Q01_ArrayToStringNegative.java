package practiceAdvanced.practice07;

import java.util.Arrays;

public class Q01_ArrayToStringNegative {
    public static void main(String[] args) {
        /*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */

        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

        System.out.println(Arrays.toString(arr));
        String str= "";
        for (String w:arr){

        }
        System.out.println(str);
       String strNegative = str.replace("Is","IsNOT");
        System.out.println(strNegative);
    }
}

package practiceAdvanced.practice05;

public class Q03 {

    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan
    // bir method oluşturunuz.(Method overloading kullanınız)

    public static void main(String[] args) {
        Hacim hacim = new Hacim();
       int kupunHacmi= hacim.hacimHesapla(5);
       int karePrizma= hacim.hacimHesapla(5,6);
        int dikdortgenPrizma= hacim.hacimHesapla(5,6,1);
        System.out.println("karePrizma = "+ karePrizma);
        System.out.println("dikdortgenPrizma = "+dikdortgenPrizma);
        System.out.println(hacim.hacimHesapla(10));//1000

    }
}

package ekstraIfStatement;

public class NestedIf {
    public static void main(String[] args) {

        int i =10;
        if (i==10 || i<15){
            if (i<15)
                System.out.println("i kucuk 15");
            if (i<12)
                System.out.println("i kucuk 12 too");

        }else {
            System.out.println("i buyuk 15");
        }
    }
}

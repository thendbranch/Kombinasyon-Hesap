// https://app.patika.dev/
// https://app.patika.dev/thendbranch


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
            N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı
            farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
            N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

            Kombinasyon formülü
            C(n,r) = n! / (r! * (n-r)!)
         */

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen kombinasyonu giriniz..");
        System.out.print("N : ");
        int n = input.nextInt();
        System.out.print("r : ");
        int r = input.nextInt();

        int faktorn = 1;
        int faktorr = 1;
        int faktornr = 1;

        for (int i = 1; i <= n; i++) {
            faktorn *= i;
        }
        for (int j = 1; j <= r; j++) {
            faktorr *= j;
        }
        for (int t = 1; t <= (n-r); t++) {
            faktornr *= t;
        }
        int hesap = (faktorn / (faktorr * faktornr));
        System.out.println("C(N,r) = " + hesap);
    }
}
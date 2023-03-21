import java.util.Scanner;

public class hangiGun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yılı girin: (ör, 2023): ");
        int yil = input.nextInt();

        System.out.println("Ayı girin: 1-12: ");
        int ay = input.nextInt();

        System.out.println("Aydan bir gün girin: 1-31: ");
        int gun = input.nextInt();

        if (ay == 1 || ay == 2) {
            ay += 12;
            yil--;
        }

        int k = yil % 100;
        int j = (int) (yil / 100);
        int q = gun;
        int m = ay;
        int h = (q + (int)((26 * (m + 1)) / 10.0) + k + (int)(k / 4.0) + (int)(j / 4.0) + (5 * j)) % 7;

        if (h == 0) {
            System.out.println("Cumartesi");
        } else if (h == 1) {
            System.out.println("Pazar");
        } else if (h == 2) {
            System.out.println("Pazartesi");
        } else if (h == 3) {
            System.out.println("Salı");
        } else if (h == 4) {
            System.out.println("Çarşamba");
        } else if (h == 5) {
            System.out.println("Perşembe");
        } else if (h == 6) {
            System.out.println("Cuma");
        }else{
            System.out.println("Geçerli tarih girmediniz.");
        }
    }
}

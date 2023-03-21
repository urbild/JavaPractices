package nesneOdakliProgramlama;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Hesap hesap = new Hesap("Aykut Karnap","123456",2000);
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");
    }
}

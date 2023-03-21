import java.util.Scanner;

public class krediKartiNumaraGecerlilik {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Kredi Kartınızın Numarasını Girin: ");
        long number = in.nextLong();

        System.out.println(cins(number) + " " + (isValid(number) ? "geçerli numara" : "geçersiz numara"));

    }

    public static boolean isValid(long number){
        boolean valid =
                (getSize(number) >= 13 && getSize(number) <= 16) &&
                        (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                                prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                        ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

        return valid;
    }
    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }
    public static int getDigit(int number){
        if (number < 9)
            return number;
        else
            return number / 10 + number % 10;
    }
    public static int sumOfOddPlace(long number){
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }
    public static boolean prefixMatched(long number,int d){
        return getPrefix(number, getSize(d)) == d;
    }
    public static int getSize(long d){
        String num = d + "";
        return num.length();

    }

    public static long getPrefix(long number, int k){
        if (getSize(number) > k)  {
            String num = number + "";
            return  Long.parseLong(num.substring(0, k));
        }
        return number;
    }

    public static String cins(long number) {
        String a = number + "";
        char ilkBas = a.charAt(0);
        String ikiBas = a.substring(0,1);
        long x = Long.parseLong(String.valueOf(ilkBas));
        long y = Long.parseLong(ikiBas);
        if(x==4){
            System.out.print("Visa ");
        } else if (x==5) {
            System.out.print("Master ");
        } else if (x==6) {
            System.out.print("Discover ");
        } else if (x==3) {
            if(y==36)
                System.out.print("AE ");//American Express
        }else {
            System.out.print("UYY ");
        }
        return a;
    }
}

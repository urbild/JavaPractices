package KullaniciInterface;

public class Main {
    public static void main(String[] args) {
        SignUpManager sum = new SignUpManager(new ComplexUserCheck());

        sum.signUp(new User(1,"Aykut",22));
    }
}

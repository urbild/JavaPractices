package KullaniciInterface;

public class SignUpManager {
    public SignUpManager(IUserCheck iUserCheck) {
        this.iUserCheck = iUserCheck;
    }

    private IUserCheck iUserCheck;
    public void signUp(User user){
        if(iUserCheck.checkUser(user)){
            System.out.println("Kayıt başarılı: " + user.getName());
        }else{


            System.out.println("Kayıt başarısız.");

        }

    }
}

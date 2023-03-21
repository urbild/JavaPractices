package KullaniciInterface;

public class AgeUserCheck implements IUserCheck{

    @Override
    public boolean checkUser(User user) {
        if(user.getAge()>=18){
            return true;
        }
        return false;
}
}

package KullaniciInterface;

public class ComplexUserCheck  implements IUserCheck{

    @Override
    public boolean checkUser(User user) {
        if(user.getAge()>=18 && user.getName().startsWith("A")){
            return true;
        }
        return false;
    }
}

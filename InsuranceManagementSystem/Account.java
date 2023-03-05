import java.util.ArrayList;
import java.util.List;


public class Account {
    enum AuthenticationStatus {SUCCESS, FAIL}
    private User user;
    private List<Insurance> insuranceList;
    private AuthenticationStatus status;

    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public List<Insurance> getInsuranceList() {return insuranceList;}
    public void setInsuranceList(List<Insurance> insuranceList) {this.insuranceList = insuranceList;}
    public AuthenticationStatus getStatus() {return status;}
    public void setStatus(AuthenticationStatus status) {this.status = status;}

    public void login(String email, String password) throws InvalidAuthenticationException{
        if(this.user.getEmail().equals(email) && this.user.getPassword().equals(password)){
            setStatus(AuthenticationStatus.SUCCESS);
            System.out.println("Giriş Başarılı!");
        } else {
            setStatus(AuthenticationStatus.FAIL);
            throw new InvalidAuthenticationException("Kullanıcı bilgileri hatalı !");
        }
    }

    public void addAddress(Address address) {
        System.out.println("Adres ekleme");
    }
    public void removeAddress(Address address) {
        System.out.println("Adres çıkarma");
    }
    public boolean isLogin(){
        if (getStatus() == AuthenticationStatus.FAIL)
            return false;
        else
            return true;
    }
}

class Individual extends Account{

}

class Enterprise extends Account{

}

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts;



    public Account login(String email, String password){
        Account temp = null;
        for(Account account : accounts){
            try {
                account.login(email,password);
                if(account.isLogin()){
                    System.out.println("Account Manager Girişi Başarılı!");
                    temp = account;
                    break;
                }else{
                    System.out.println("Account Manager Girişi Başarısız!");
                }
            }catch (InvalidAuthenticationException e) {
                throw new RuntimeException(e);
            }

        }
        return temp;
    }
}

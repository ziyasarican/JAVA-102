public class InvalidAuthenticationException extends Throwable {
    public InvalidAuthenticationException(String error){
        super(error);
        System.out.println("Invalid password !");
    }
}

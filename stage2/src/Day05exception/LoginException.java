package Day05exception;

public class LoginException extends Exception {
    public LoginException(){

    }

    public LoginException(String message){
        super(message);
    }
}

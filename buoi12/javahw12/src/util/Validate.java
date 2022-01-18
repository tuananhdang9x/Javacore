package util;

public class Validate {
    static final String ACCOUNT_REGEX ="^.{8,16}$";

    public static boolean validateAccount(String accountNumber){
        if(accountNumber.matches(ACCOUNT_REGEX)){
            return true;
        }else {
            return false;
        }
    }

}

package util;

public class Validate {
    static final String PHONE_REGEX ="^.{10,11}$";
    static final String EMAIL_REGEX ="^(.+)@(.+)$";
    static final String ID_REGEX = "^(KH[0-9].{6})$";

    public static boolean validatePhoneNumber(String phoneNumber){
        if(phoneNumber.matches(PHONE_REGEX)){
            return true;
        }
        return false;
    }

    public static boolean validateEmail (String email){
        if(email.matches(EMAIL_REGEX)){
            return true;
        }
        return false;
    }
    public static boolean validateID (String id){
        if(id.matches(ID_REGEX)){
            return true;
        }
        return false;
    }
}

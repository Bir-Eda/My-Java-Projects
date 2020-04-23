package fifthmethodpackage;

public class PasswordAgain {
    public static void main(String[] args) {
        System.out.println(checkPassword("abcde"));
    }
    public static String checkPassword(String password){
        if(password.length() < 6){
            return "Password must be at least 6 character";
        }
        else
            return "Ok";
    }
}

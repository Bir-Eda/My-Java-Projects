package fifthmethodpackage;

public class Password {
    public static void checkpass(String password) {
        if (password.length() >= 6) {
            System.out.println("yes");
        } else {
            System.out.println("Password must be 6 characters");
        }
    }

    public static void main(String[] args) {
        Password.checkpass("abcdge");
    }



    /*public static void passwordCheck(String pass){
        if (pass.length()>= 6) {
            System.out.println("Yes");
        } else {
            System.out.println("password must be at least 6 character");

        }
    }*/
}
//public static void main(String[] args) {
// passwordCheck("abcdef");
//}
//}


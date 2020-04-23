package secondifstatementspackage;

import java.util.Scanner;

public class IfReview {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String password= "Password";
        String userName="user";
        System.out.println("user name");
        String user= scan.next();
        System.out.println("Password");
        String pass=scan.next();

        if(user.equals(userName)&&password.equals(pass)){
            System.out.println("Welcome your page");
        }else{
            System.out.println("User Name or password is wrong");
        }

    }
}

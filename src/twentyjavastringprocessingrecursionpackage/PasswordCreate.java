package twentyjavastringprocessingrecursionpackage;

import java.util.ArrayList;
import java.util.List;

public class PasswordCreate {
    public static void main(String[] args) {
        System.out.println(checkMyPassword("154A%c"));
    }

    public static int counDigits(String password) {
        String numbers = "0123456789";
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (numbers.contains(password.substring(i, i + 1))) {
                count++;
            }
        }
        return count;
    }

    public static int countLower(String password) {
        String lower_case ="abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (lower_case.contains(password.substring(i, i + 1))) {
                count++;
            }
        }
        return count;
    }

    public static int countUpper(String password) {
        String upper_case ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (upper_case.contains(password.substring(i, i + 1))) {
                count++;
            }
        }
        return count;
    }

    public static int countSpecial(String password) {
        String special_character = "!@#$%^&*()-+";
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (special_character.contains(password.substring(i, i + 1))) {
                count++;
            }
        }
        return count;
    }

        public static int checkMyPassword(String password){
            int digits=counDigits(password);
            int lowers= countLower(password);
            int uppers=countUpper(password);
            int special=countSpecial(password);
            if (password.length() < 6) {
                return 6 - password.length();
            } else {
                List<Integer> counts = new ArrayList<>();
                counts.add(digits);
                counts.add(lowers);
                counts.add(uppers);
                counts.add(special);
                int zeroCount=0;
                for(int count : counts){
                    if (count==0){
                        zeroCount++;
                    }
                }
                return zeroCount;

            }

        }
    }


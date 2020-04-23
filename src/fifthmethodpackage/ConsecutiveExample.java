package fifthmethodpackage;

public class ConsecutiveExample {
    public static void consecutive(String text){
        text+="  ";
        for(int i=0; i<text.length()-1; i++){

            if(text.charAt(i)!=text.charAt(i+1)){

                System.out.print(text.charAt(i));
            }

        }

    }

    public static void main(String[] args) {
        ConsecutiveExample.consecutive("12112asddde"); //"aaabbbcc"
    }

}

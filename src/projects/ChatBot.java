package projects;

public class ChatBot {
    public static void main(String[] args) {
        String arr[] = new String[7];
        arr[0]="Hello";
        arr[1]="How";
        arr[2]= "are";
        arr[3]="you";
        arr[4]="?";
        arr[5]="Today";
        arr[6]= "Honey";
       int index= (int)(Math.random()*7);
        System.out.println(index);
        System.out.println(arr[index]);


        }
    }

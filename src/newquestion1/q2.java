package newquestion1;

import org.w3c.dom.ls.LSOutput;

public class q2 {

    public static void main(String[] args) {

        //  System.out.println(x);

        int x = 100;
        int a = x++; // 101
        int b = ++x;  // 102
        int c=x++; //  103

        int d=(a<b) ? (a<c) ? a: (b<c) ? b: c: x;
        System.out.println(d);
//        if(a<b) {
//            System.out.println();
//        }
//            if(a<c){
//                System.out.println(a);
//            }
//            else if(b<c){
//                System.out.println(b);
//            }
//            else{
//                System.out.println(d);
//            }
        }

    }

// sorunun cevabi 100
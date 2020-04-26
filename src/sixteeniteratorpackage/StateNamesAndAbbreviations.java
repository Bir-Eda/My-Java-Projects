package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class StateNamesAndAbbreviations {
    public static void main(String[] args) {
        String states[]={"Arizona", "CA","NY","Nevada", "abc"};
        listStates(states,"abb");
        listStates(states,"full");
        listStates(states,"asd");
        System.out.println(returnStateList(states, "abb"));
        System.out.println(returnStateList(states, "full"));
        System.out.println(returnStateList(states,"asd"));
    }
    public static void listStates(String states[], String way) {
        if(way.equals("abb")) {
            for (String state : states) {
                if (state.length() == 2) {
                    System.out.println(state);
                }
            }
        }
        else if(way.equals("full")) {
            for (String state : states) {
                if (state.length() > 2) {
                    System.out.println(state);
                }
            }
        }
        else{
            System.out.println("Invalid parameter");
        }
    }
    public static List<String> returnStateList(String states[],String way ){
        List<String> st=new ArrayList<String>();
        if(way.equals("abb")) {
            for (String state : states) {
                if (state.length() == 2) {
                    System.out.println(state);
                }
            }
        }
        else if(way.equals("full")) {
            for (String state : states) {
                if (state.length() > 2) {
                    System.out.println(state);
                }
            }
        }
        else{
            System.out.println("Invalid parameter");
        }
        return st;

    }
}

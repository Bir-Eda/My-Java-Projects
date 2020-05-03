package twentyjavastringprocessingrecursionpackage;

public class CreateStringBuilderStrValue {
    public static void main(String[] args) {
        StringBuilder myBuilder=new StringBuilder("Very interesting part");
       StringBuilder sentence = myBuilder.reverse();
        //StringBuilder sentence = new StringBuilder(sentence().toString()); //create a new object
        System.out.println(sentence);
       //myBuilder.reverse();
       // System.out.println(myBuilder);
        System.out.println(myBuilder.capacity());
        if(myBuilder.equals(sentence)){
            System.out.println("They are same");
        }
        else{
            System.out.println("They are not same");
        }
        myBuilder.append(" This is new String just");
        System.out.println(myBuilder);
        System.out.println(myBuilder.capacity());
        myBuilder.append(" This is another String just added");
        System.out.println(myBuilder);
        System.out.println(myBuilder.capacity());
    }
}

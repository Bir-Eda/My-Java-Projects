package nineteenenumpackage;

public class SwitchEnum {
    enum Level {
        Java,
        Selenium,
        SQL,
    }

    public static void main(String[] args) {
        Level myLevel = Level.SQL;
        switch (myLevel){
            case SQL:
                System.out.println("High level");
                break;
            case Selenium:
                System.out.println("Practice is good");
                break;
            case Java:
                System.out.println("Solve more problem");
                break;

       }
    }
}

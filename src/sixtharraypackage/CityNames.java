package sixtharraypackage;

public class CityNames {
    public static void main(String[] args) {
        String[] ctiyNames = {"New york", "Los Ag", "Ann Arbor", "Chicago", "Minneo", "Albuq", "Salt lake"};

        for (int i = 0; i <=6; i++) {
            System.out.println(ctiyNames[i]);
        }
        System.out.println("-----------");

        for (int j = ctiyNames.length; j > 0; j--) {
            System.out.println(ctiyNames[j - 1]);

        }
        System.out.println("--------------");

        for (int i = 0; i < ctiyNames.length; i++) {  //ilk for ile ayni ciktiyi alir, duz
            System.out.println(ctiyNames[i]);

        }
        System.out.println("--------");

        for(int k=6; k< ctiyNames.length; k--){ // ikinci for ile ayni ciktiyi alir, tersten
            System.out.println(ctiyNames[k]);
        }



    }
}

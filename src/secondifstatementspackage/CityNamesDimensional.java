package secondifstatementspackage;
import java.util.Scanner;
public class CityNamesDimensional{
public static void main(String[] args) {
        String[][] cities = createRandomDimCities(4, 3);
        //fisrtLetterA(cities);
        //reverseString(cities);
        cityNameA_H(cities);

        }

public static String[][] createRandomDimCities(int rows, int cols) {
        String cities[] = {"Boston", "New York", "Atlanta", "Huston", "Denver", "Boulder", "Chicago", "Portland", "Albany"};
        String[][] randomCities = new String[rows][cols];
        int index;
        for (int i = 0; i < randomCities.length; i++) {
        for (int j = 0; j < randomCities[i].length; j++) {
        randomCities[i][j] = cities[(int) (Math.random() * cities.length)];

        }
        }
        return randomCities;
        }

    /*public static void fisrtLetterA(String[][] cities) {
        //String cities[] = {"Boston", "New York", "Atlanta", "Huston", "Denver", "Boulder", "Chicago", "Portland", "Albany"};
        for (String[] row : cities) {
            if (String city:
            row){
                if (cities.charAt(0) == 65) {
                    System.out.println(city);
                }

            }
        }
    }*/
public static void cityNameA_H(String[][]cities) {
        for (int i = 0; i < cities.length; i++) {
        for (int j = 0; j < cities[i].length; j++) {
        if ((char) cities[i][j].charAt(0) >= 65 && (char) cities[i][j].charAt(0) <= 72) {
        System.out.println(cities[i][j]);
        }
        }
        }
        }}


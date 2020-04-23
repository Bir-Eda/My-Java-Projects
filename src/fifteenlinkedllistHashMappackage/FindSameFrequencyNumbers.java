package fifteenlinkedllistHashMappackage;
import java.util.HashMap;
public class FindSameFrequencyNumbers {
    public static void main ( String[] args ) {
        int[] myArr = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7, 7, 7, 8, 8, 8, 9};
        findOccur(myArr);
    }
    public static void findOccur ( int[] myArr ) {
        HashMap < Integer, Integer > numbers = new HashMap <> ( );
        int  count=0;
        for ( int i = 0 ; i < myArr.length ; i++ ) {
            for ( int j = 0 ; j < myArr.length ; j++ ) {
                if ( myArr[i] == myArr[j] ) {
                    count++;
                }
            }
            numbers.put ( myArr[i] , count );
            count=0;
        }
        System.out.println ( numbers );
    }

}

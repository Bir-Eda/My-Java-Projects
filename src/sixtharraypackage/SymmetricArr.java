package sixtharraypackage;

public class SymmetricArr {
    public static void symetricArray(int []array){
        int index=array.length-1;  //last element
        int counter=0;
        for(int i=0; i<array.length; i++) {
            if (array[i]!= array[index]){  // array[i] current arrayin ilk elemani demek
                counter++;
            }
            index--;
            System.out.println("index:"+index);

        }
        System.out.println("counter:"+counter);

        if(counter==0){
            System.out.println("Symetric");
        }
        else{
            System.out.println("Not Symetric");
        }
    }
    public static void main(String[] args) {
        int []myArr={1,2,3,4,3,2,1}; //symetric numara koy yada koyma sonucu soyleyecek.symetricse symetric degilse degil
        symetricArray(myArr);
    }
}

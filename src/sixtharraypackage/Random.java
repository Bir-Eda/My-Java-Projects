package sixtharraypackage;

public class Random {
    public static void createIntRandom(int n){
        int []array= new int[n];
        for(int i=0; i<array.length; i++){
            array[i]= (int)(Math.random()*4000+1000);
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        createIntRandom(8); //parantez icine kac sayi verirsen o kadar random sayi verir
    }
}

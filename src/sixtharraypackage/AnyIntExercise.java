package sixtharraypackage;

public class AnyIntExercise {
    public static void main(String[] args) {
        int sum=0;
        int arr[]={12,45,6};
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }System.out.println(sum);
        System.out.println("-----------\n");

        int array[]= {1,2,3,4,5,6,7,8};
        for(int i=0; i<8; i++){
            if(array[i] %2==0){
                System.out.println(array[i]);
            }
        }
        System.out.println("-------------\n");

        String arry[]={"agfr","hfjfgu","kl","l"};
        int counter=0;
        for(int i=0; i<arry.length; i++){
            if(arry[i].length()<4){
                System.out.println(arry[i]);
                counter++;
            }

        }
        System.out.println(counter);
        System.out.println("----------\n");

        int num[]={1,2,3,4,5,6,7,8,9};
        int arraylength=num.length;
        int half=arraylength/2+1;
        int []firstHalf= new int[half];
        for(int i=0; i<half; i++){
            firstHalf[i]=num[i];
        }
        int[]secondHalf= new int[num.length-half];
        int index=0;
        for(int i=half; i<num.length; i++){
            secondHalf[index]=num[i];
            index++;
        }
        System.out.println("First");
        for(int i=0; i<firstHalf.length; i++){
            System.out.println(firstHalf[i]);
        }
        System.out.println("Second");
        for(int i=0; i<secondHalf.length; i++){
            System.out.println(secondHalf[i]);
        }
    }
}

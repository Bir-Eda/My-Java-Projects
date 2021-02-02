package interview_questions.overloading_overriding;

public class Zer {
    public static void main(String[] args) {
        int arr[] = {0,0,4, 0, 0, 3,6,9,0,1,2};
        int n = arr.length;
        zero(arr, n);
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }


        public static int[] zero( int array[], int number){
            int count = 0;
            for (int i = 0; i < number; i++)
                if (array[i] != 0)
                    array[count++] = array[i];
            while (count < number)
                array[count++] = 0;

            return array;
            }
        }



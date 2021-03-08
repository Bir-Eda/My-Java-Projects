package interview_questions.overloading_overriding;

public class BubleSort {
    public static void main(String[] args) {
        int array[]={9,1,8,2,7,3,0,3,8,2};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }
    public static void bubbleSort(int arr[]){
          int n=arr.length;
          int temp;

          for(int i=0; i<n; i++){
              for(int j=1; j<n-i; j++){
                  if(arr[j-1]> arr[j]){
                      temp=arr[j-1];
                      arr[j-1]=arr[j];
                      arr[j]=temp;
                  }

              }
          }
    }

}




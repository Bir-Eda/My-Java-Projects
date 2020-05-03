package twentyjavastringprocessingrecursionpackage;

public class SlotMachineArrayListT {
    public static void main(String[] args) {
    String arr[]={"@","@","@"};
        System.out.println(isJackpot(arr));
    }
    public static boolean isJackpot(String arr[]){
        String element=arr[0];
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals(element)){
                return false;
            }
        }
        return true;
    }
}

package ninepackageinheritance;

public class ArrayOpsParent {
    protected int index;
    protected int indexString;

    public ArrayOpsParent() {
        this.index = 0;
        this.indexString = 0;
    }

    public int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
            this.index=i;
            return this.index;
            }
        }
         this.index=-1;
        return this.index;
    }
    public int findIndex(String []arr, String value){
        for(int i=0; i<arr.length; i++){
            if(arr[i].equalsIgnoreCase(value)){
                this.indexString=i;
            }
        }
        return this.indexString;

    }

    @Override
    public String toString() {
        return "ArrayOpsParent{" +
                "index=" + index +
                ", indexString=" + indexString +
                '}';
    }
}


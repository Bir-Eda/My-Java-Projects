package ninepackageinheritance;

public class ArrayOpsTest {
    public static void main(String[] args) {
        ArrayOpsParent myArr=new ArrayOpsParent();
        int []arr= {1,2,3,4,5,6,6,7};
        int index=myArr.findIndex(arr, 6);
        System.out.println(index);
        ArrayStat myStat=new ArrayStat(arr);
        System.out.println(myStat.findAverage());
        System.out.println(myStat.findMax());
        System.out.println(myStat.findMin());
        int maxIndex=myStat.findMaxIndex();
        System.out.println(maxIndex);

    }
}

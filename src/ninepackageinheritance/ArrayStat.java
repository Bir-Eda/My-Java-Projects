package ninepackageinheritance;

import java.util.Arrays;

public class ArrayStat extends ArrayOpsParent {
    private int [] arr;
    private double average;
    private int min;
    private int max;

    public ArrayStat(int[] arr) {
       super();
        this.arr = arr;
        this.average = average;
        this.min = min;
        this.max = max;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    public double findAverage(){
        int total=0;
        for(int i=0; i<this.arr.length; i++){
            total+= this.arr[i];
        }
        this.average=total/this.arr.length;
        return this.average;
    }
    public int findMin(){
        this.min=this.arr[0];
        for(int i=1; i<this.arr.length;i++) {
            if (this.arr[i] < this.min) {
                this.min = this.arr[i];
            }
        }
        return this.min;
        }
        public int findMax(){
            this.min=this.arr[0];
            for(int i=1; i<this.arr.length;i++) {
                if (this.arr[i] > this.max) {
                    this.max = this.arr[i];
                }
            }
            return this.max;
        }
        public int findMaxIndex(){
        super.index = super.findIndex(this.arr, this.findMax());
        return super.index;
        }

    @Override
    public String toString() {
        return "StatArray{" +
                "arr=" + Arrays.toString(arr) +
                ", average=" + average +
                ", min=" + min +
                ", max=" + max +
                ", index=" + index +
                ", indexString=" + indexString +
                '}';
    }
}


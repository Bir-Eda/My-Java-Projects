package ocaquestionsvp;

 class Q42 {
    int ns;
    static int s;
    Q42(int ns){
        if(s<ns){
            s=ns;
            this.ns=ns;

            //0<50 -->  2.step    s=50, ns=50    son step   s=125   ns=50     ==50<125
            //50<125  -->  1.step  s=125   ns=125      ==
            //125<100  --> s=125  ns=0  125<100 olamayacagi icin ns ilk default degeri olan 0~i alir

        }
    }
    void doPrint(){
        System.out.println("ns = "+ ns+" s = "+s);
    }
}
      class TestA{
    public static void main(String[] args) {
      Q42 ref1=new Q42(50);
        Q42 ref2=new Q42(125);
        Q42 ref3=new Q42(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();


    }     //???????
}

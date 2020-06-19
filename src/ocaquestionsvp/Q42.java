package ocaquestionsvp;

 class Q42 {
    int ns;
    static int s;
    Q42(int ns){
        if(s<ns){
            s=ns;
            this.ns=ns;
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
        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);

    }     //???????
}

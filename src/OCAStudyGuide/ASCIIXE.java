package OCAStudyGuide;

public class ASCIIXE {

    int count;
    public void salmon(){
         count=4;
        int resul=count+2;
        System.out.println(resul);
    }
    public static void main(String[] args) {
        int a=123;
        int b=0xe;  // 0x hexadesimel 0-9 ve A-F
        int c=0b1; //  0b binary 0-1
        System.out.println(a+b);

        ASCIIXE m= new ASCIIXE();
       // System.out.println(m.salmon());
            m.salmon();

    }
}

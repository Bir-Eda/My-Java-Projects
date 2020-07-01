package ocaquestionsvp3;

class Q123ClassTest{
        int a1;
        public static void doProduct(int a){
            a=a*a;
        }
        public static void doString(String s){
            s.concat(" "+s);
        }
            public static void main(String[] args) {
                Q123ClassTest item=new Q123ClassTest();
                item.a1=11;
                String sb="Hello";
                Integer i=10;
                doProduct(i);
                doString(sb);
                doProduct(item.a1);
                System.out.println(i+" "+sb+" "+item.a1);

            }
    }

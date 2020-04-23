package firstdatatypepackage;


    public class FormatQuestion {
        public static void main(String[] args) {
            String say = "Java is fun";
            System.out.format("Do you think %s \n", say);
            double sayi = 78.89;
            System.out.format("Yes %%%f of the people thinks it is fun\n", sayi);
            System.out.format("Yes %%%.2f of the people thinks it is fun", sayi);


        }

    }

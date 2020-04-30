package nineteenenumpackage;

public class GoogleYahooSafari {

        public enum Search {
            Google("www.google.com"),
            Yahoo("www.yahoo.com"),
            Safari("www.safari.com");

            private String motors;

            Search(String motors) {
                this.motors = motors;
            }

            public String getMotors() {
                return this.motors;
            }

            public static void main(String[] args) {
                for(Search Engine: Search.values()){
                    System.out.println(Engine+" = "+Engine.motors);

                }
            }
            }
            }

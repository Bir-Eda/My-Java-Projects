package nineteenenumpackage;

public enum WeekDays {
        Sunday("Sunday Funday", true),
        Monday("Marketing monday"),
        Tuesday("Trendy tuesday"),
        Wednesday("Wellness Wednesday"),
        Thursday("Thankfull Thursday"),
        Friday("Foodie friday"),
        Saturday("Social Saturday", true);

        private String daysGreeting;
        private boolean isWeekend;

        WeekDays(final String daysGreeting) {
            this.daysGreeting = daysGreeting;
        }

        WeekDays(final String daysGreeting, final boolean isWeekend) {
            this.daysGreeting = daysGreeting;
            this.isWeekend = isWeekend;
        }
        public String getDaysGreeting() {
            return daysGreeting;
        }
        public boolean isWeekend() {
            return isWeekend;
        }
    public static void main(String[] args) {
        WeekDays day1 = WeekDays.Friday;
        WeekDays day2 = WeekDays.Saturday;
        System.out.print(day1 + " : ");
        System.out.println(day1.getDaysGreeting());
        System.out.print(day2 + " : ");
        System.out.println(day2.getDaysGreeting());
        System.out.println(day2.isWeekend());

        if(day1.isWeekend()) System.out.println(day1 + " is weekend");
        if(day2.isWeekend()) System.out.println(day2 + " is weekend");
    }


}



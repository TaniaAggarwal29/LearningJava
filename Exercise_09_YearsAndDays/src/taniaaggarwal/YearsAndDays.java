package taniaaggarwal;

public class YearsAndDays {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
            return;
        }
        int years, days;
        days = (int)(minutes/(24*60));
        years = days / 365;
        days %= 365;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}

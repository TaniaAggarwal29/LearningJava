package taniaaggarwal;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;

        double milesPerHour = kilometersPerHour / 1.609;
        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour == -1)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " Km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}

package taniaaggarwal;

public class Main {

    public static void main(String[] args) {

        double var1 = 20.00d;
        double var2 = 80.00d;

        double remainder = ((var1 + var2)*100.00d) % 40.00;
        boolean isZero = (remainder == 0);

        System.out.println("Is Remainder zero? : " + isZero);
        if (!isZero)
            System.out.println("Got some Remainder!");

    }
}

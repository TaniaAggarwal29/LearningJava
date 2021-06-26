package taniaaggarwal;

public class UnitConverter {

    public static void main(String[] args) {
        System.out.println(calcFootAndInchesToCentimeters(105));
        System.out.println(calcFootAndInchesToCentimeters(4, 10));
    }

    public static double calcFootAndInchesToCentimeters(double feet, double inches){
        if (feet<0 || inches<0 || inches>12)
            return -1;
        return (feet*12*2.54 + inches*2.54);
    }

    public static double calcFootAndInchesToCentimeters(double inches){
        if (inches<0)
            return -1;
        double feet = (int)inches / 12;
        inches %= 12;
        return calcFootAndInchesToCentimeters(feet, inches);
    }
}

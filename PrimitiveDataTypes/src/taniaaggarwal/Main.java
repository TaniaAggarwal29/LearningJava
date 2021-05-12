package taniaaggarwal;

public class Main {

    public static void main(String[] args) {

        /* 1. Integer - 32 bits */

        int maxIntVal = Integer.MAX_VALUE;
        int minIntVal = Integer.MIN_VALUE;
        System.out.println("Maximum Integer Value : " + maxIntVal); // 2147483647
        System.out.println("Minimum Integer Value : " + minIntVal); // -2147483648
        System.out.println("Busted Max value - Integer Overflow : " + (maxIntVal + 1)); // -2147483648
        System.out.println("Busted Min value - Integer Underflow : " + (minIntVal - 1)); // 2147483647

        // for better readability, can also be written like:
        int IntNum = 2_147_483_647; //This is the maximum number integer can store
                                    //If we try to store number greater than this, it'll throw an error
        System.out.println("IntNum = " + IntNum); //2147483647

        /* 2. Byte - 8 bits */

        byte maxByteVal = Byte.MAX_VALUE;
        byte minByteVal = Byte.MIN_VALUE;
        System.out.println("Maximum Byte value : " + maxByteVal); // 127
        System.out.println("Minimum Byte value : " + minByteVal); // -128

        /* 3. Short - 16 bits */
        
        short maxShortVal = Short.MAX_VALUE;
        short minShortVal = Short.MIN_VALUE;
        System.out.println("Maximum Short value : " + maxShortVal); // 32767
        System.out.println("Minimum Short value : " + minShortVal); // -32768
        
        /* 4. Long - 64 bits */
        
        long maxLongVal = Long.MAX_VALUE;
        long minLongVal = Long.MIN_VALUE;
        System.out.println("Maximum Long value : " + maxLongVal); // 9223372036854775807
        System.out.println("Minimum Long value : " + minLongVal); // -9223372036854775808
        
        //when initializing with a literal value, we must add L at the end to specify that this is long.
        //else the literal will be treated as integer
        //and will throw if we take a number out of range of integers.
        long myNumber = 2_147_483_647_123L;
        System.out.println(myNumber);

        /* Casting */

        int intNum = maxIntVal / 2;
        byte byteNum = (byte) (maxByteVal / 2); //this will give error if not type-casted into byte
        //reason: java will by default treat (maxByteVal / 2) as integer.

        /* 5. Float - 32 bits (Single precision number) */

        float maxFloatVal = Float.MAX_VALUE;
        float minFloatVal = Float.MIN_VALUE;
        System.out.println("Maximum Float value : " + maxFloatVal); // 3.4028235E38
        System.out.println("Minimum Float value : " + minFloatVal); // 1.4E-45

        /* 6. Double - 64 bits (Double precision number) */

        double maxDoubleVal = Double.MAX_VALUE;
        double minDoubleVal = Double.MIN_VALUE;
        System.out.println("Maximum Double value : " + maxDoubleVal); // 1.7976931348623157E308
        System.out.println("Minimum Double value : " + minDoubleVal); // 4.9E-324

        float floatVal = 5.25f;
        //if we don't put f at the end, java will take it as default 'double' and throw an error.
        double doubleVal = 5.25d;
        //we can skip putting d since by default it will be taken as double.

        /* 7. Char - 16 bits */

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("Character (as it is) : " + myChar);
        System.out.println("Character (with unicode) : " + myUnicodeChar);
        //go to unicode-table.com to check unicodes for characters.

        /* 8. Boolean */
        boolean trueValue = true;
        boolean falseValue = false;
    }
}

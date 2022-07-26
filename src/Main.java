public class Main {

    public static void main(String[] args) {
        // Stores the minimum valid "byte" value.
        byte myMinByteValue = Byte.MIN_VALUE;

        // Using casting to convert the resulting "int" type value to a "byte".
        byte newByteValue = (byte) (myMinByteValue / 2);

        // Prints "newByteValue".
        System.out.println("New byte value = " + newByteValue);

        // Following statements exhibit overflow in case of "short".
        short myMaxShortValue = Short.MAX_VALUE;

        // Prints maximum valid "short" value.
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // Overflow occurs here.
        System.out.println("Busted MAX Value = " + ((short) (myMaxShortValue + 1)));
    }
}

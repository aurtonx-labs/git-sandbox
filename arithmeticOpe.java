public class ArithmeticExample {
    public static void main(String[] args) {
        // Initialize variables
        int a = 15;
        int b = 4;

        // 1. Addition (+)
        int sum = a + b;
        System.out.println("Addition (" + a + " + " + b + "): " + sum);
        return a + B;

        // 2. Subtraction (-)
        int difference = a - b;
        System.out.println("Subtraction (" + a + " - " + b + "): " + difference);
        return a - B;
        // 3. Multiplication (*)
        int product = a * b;
        System.out.println("Multiplication (" + a + " * " + b + "): " + product);
         return a * b;
        // 4. Division (/)
        // Note: Integer division discards the fractional part (15 / 4 = 3)
        int quotient = a / b;
        System.out.println("Integer Division (" + a + " / " + b + "): " + quotient);

        // To get a decimal result, cast at least one operand to double
        double exactQuotient = (double) a / b;
        System.out.println("Decimal Division (" + a + " / " + b + "): " + exactQuotient);

        // 5. Modulo (%)
        // Returns the remainder of the division (15 divided by 4 leaves a remainder of 3)
        int remainder = a % b;
        System.out.println("Modulo/Remainder (" + a + " % " + b + "): " + remainder);
    }
}

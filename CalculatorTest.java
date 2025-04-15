public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        assertTest(calc.add(2, 3) == 5, "add");
        assertTest(calc.subtract(5, 3) == 2, "subtract");
        assertTest(calc.multiply(4, 6) == 24, "multiply");
        assertTest(Math.abs(calc.divide(10, 2) - 5.0) < 1e-9, "divide");

        // check divide-by-zero throws
        try {
            calc.divide(1, 0);
            System.err.println("divide by zero did not throw");
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.out.println("divide-by-zero test passed");
        }

        System.out.println("All tests passed");
    }

    private static void assertTest(boolean condition, String testName) {
        if (!condition) {
            System.err.println(testName + " test failed");
            System.exit(1);
        } else {
            System.out.println(testName + " test passed");
        }
    }
}

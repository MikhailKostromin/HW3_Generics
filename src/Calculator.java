public class Calculator {
    public static <T extends Number, N extends Number> double sum(T a, N b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, N extends Number> double subtract(T a, N b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number,N extends Number> double multiply(T a, N b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, N extends Number> double divide(T a, N b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + Calculator.sum(5, 3.5));          // Выводит: Sum: 8.5
        System.out.println("Multiply: " + Calculator.multiply(4, 2.5)); // Выводит: Multiply: 10.0
        System.out.println("Divide: " + Calculator.divide(9.0, 3));    // Выводит: Divide: 3.0
        System.out.println("Subtract: " + Calculator.subtract(7, 2.5)); // Выводит: Subtract: 4.5
    }
}

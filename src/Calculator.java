public class Calculator {
    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }
    public static <T extends Number> double divide(T a, T b) {
        if (b.doubleValue()==0){
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

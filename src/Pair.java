/*
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого
из составляющих пары, а также переопределение метода toString(),
возвращающее строковое представление пары.
 */

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<Double, Integer> pair2 = new Pair<>(3.14, 42);

        System.out.println(pair1); // Выводит: (1, One)
        System.out.println(pair2); // Выводит: (3.14, 42)

        pair1.setFirst(2);
        pair2.setSecond(50);

        System.out.println(pair1); // Выводит: (2, One)
        System.out.println(pair2); // Выводит: (3.14, 50)
    }
}
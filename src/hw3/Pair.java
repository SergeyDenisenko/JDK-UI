package hw3;

/**
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение метода toString(), возвращающее строковое представление пары.
 */
public class Pair <T1, T2> {
    private T1 arg1;
    private T2 arg2;

    public Pair(T1 arg1, T2 arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public T1 getFirst() {
        return arg1;
    }

    public T2 getSecond() {
        return arg2;
    }

    @Override
    public String toString() {
        return "First: " + arg1.toString() + "\nSecond: " + arg2.toString();
    }
}

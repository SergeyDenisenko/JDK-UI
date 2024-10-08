package calculator;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.

 */
public class Calculator {
    
    public static <T1 extends Number, T2 extends Number> double sum(T1 a, T2 b)
    {
        return a.doubleValue() + b.doubleValue();
    }
    
    public static <T1 extends Number, T2 extends Number> double multiply(T1 a, T2 b)
    {
        return a.doubleValue() * b.doubleValue();
    }
    
    public static <T1 extends Number, T2 extends Number> double divide(T1 a, T2 b)
    {
        return a.doubleValue() / b.doubleValue();
    }
    
    public static <T1 extends Number, T2 extends Number> double subtract(T1 a, T2 b)
    {
        return a.doubleValue() - b.doubleValue();
    }
}

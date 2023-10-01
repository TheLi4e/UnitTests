package Task5;

import org.junit.jupiter.api.Test;

public class Test1 {
    public static void main(String[] args) {
//        assertConditionA();
//        assertConditionB();
        sum(1234567890, 999999999);
    }
    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 3 : "Много отдыхать вредно";
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    public static void assertConditionB() {
        int x = 0;
        assert x >= 0;
    }

    public static int sum(int a, int b) {
        long result = (long) a+b;
        assert result < Integer.MAX_VALUE : "Переполнение переменной";
        return a+b;
    }
}

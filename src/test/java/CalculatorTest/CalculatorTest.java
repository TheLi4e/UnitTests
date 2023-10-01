package CalculatorTest;

import Task7.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    /**
     * Утверждение расчета суммы покупок с применением скидки
     */
    @Test
    public void calculatingDiscountShouldCorrect(){
        double result = 4500.0;
        double resultTest = Calculator.calculateDiscount(5000, 10);
        assertEquals(result, resultTest, "Некорректное вычисление скидки");
    }

    // Тестирование исключений


    /**
     * Исключение сумма покупок меньше рубля
     */
    @Test
    public void purchaseAmountCannotLessOne(){
        String messageException = "Неправильная сумма покупки";
        Exception exception = assertThrows(ArithmeticException.class, () ->
                Calculator.calculateDiscount(0,10));
        assertEquals(messageException, exception.getMessage());
    }

    /**
     * Исключение процент скидки меньше нуля
     */
    @Test
    public void discountAmountCannotLessZero(){
        String message = "Неправильный размер скидки";
        Exception exception = assertThrows(ArithmeticException.class, () ->
                Calculator.calculateDiscount(1000, -5));
        assertEquals(message, exception.getMessage());
    }
}

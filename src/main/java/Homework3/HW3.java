package Homework3;

public class HW3 {
    //Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
    //переданное число четным или нечетным:
    public static boolean evenOddNumber(int n){
        if (n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
   // Разработайте и протестируйте метод numberInInterval,
    //который проверяет, попадает ли переданное число в интервал (25;100)

    public static boolean numberInInterval(int n){
        if (n > 24 && n < 101) return true;
        else return false;
    }
}

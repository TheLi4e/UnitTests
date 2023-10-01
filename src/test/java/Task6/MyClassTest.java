package Task6;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {
    private static List<Integer> list1;
    private static List<Integer> list2;
    private static List<String> list3;

    @Test
    public void sumListShouldBeCorrect(){
        list1 = new ArrayList<>(Arrays.asList(1,2,3));
        list2 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2,4,6));
        List <Integer> resultTest =  MyClass.sumLists(list1, list2);
        assertEquals(result, resultTest, "Сумма списков не верна!");
    }

    @Test
    public void findMaxShouldFindMaxElement(){
        list1 = new ArrayList<>(Arrays.asList(1,2,3));
        list2 = new ArrayList<>(Arrays.asList(1,2,3));
        int result = 3;
        int resultTest = MyClass.findMax(list1);
        assertEquals(result, resultTest, "Метод не находит большее число");
    }

    @Test
    public void filterStringShouldFilterListCorrect(){
        list3 = new ArrayList<>(Arrays.asList("Hello", "GeekBrains", "My", "Friends"));
        List<String> result = new ArrayList<>(Arrays.asList("GeekBrains", "Friends"));
        List<String> resultTest = MyClass.filterStrings(list3, 7);
        assertEquals(result, resultTest, "Метод не фильтрует list3 по заданному условию");
    }
}

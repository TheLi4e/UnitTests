package Homework4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    // Создаем заглушку для BookRepository
    @Mock
    private BookRepository mockBookService;

    // Внедряем заглушку в BookService
    @InjectMocks
    private BookService bookService;


     //Тест findBookById

    @Test
    public void findBookById() {

        when(mockBookService.findById("1")).thenReturn(new Book("1", "SomeTitle", "SomeAuthor"));

        String expectIdBook = "1";
        String currentIdBook = bookService.findBookById("1").getId();
        //Слежение за вызовами методов
        verify(mockBookService,times(1)).findById("1");
        // Проверяем корректность поиска
        assertEquals(expectIdBook, currentIdBook, "Некорректный ID");
    }

    //Тест findAllBooks

    @Test
    public void findAllBooksShouldReturnListBooks() {
        //метод должен вернуть 4 книги
        when(mockBookService.findAll())
                .thenReturn(new ArrayList<>(Arrays.asList(
                        new Book("1"),
                        new Book("2"),
                        new Book("3"),
                        new Book("4")
                )));

        int expectedSizeListBooks = 4;
        int currentSizeListBooks = bookService.findAllBooks().size();
        // Слежение за вызовами методов
        verify(mockBookService, times(1)).findAll();
        // Проверка корректности поиска
        assertEquals(expectedSizeListBooks,
                currentSizeListBooks,
                "Некорректное количество книг");
    }
}
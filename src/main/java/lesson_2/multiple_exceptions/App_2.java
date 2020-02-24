package lesson_2.multiple_exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App_2 {
    // пугаем ПРЕДКОМ исключений
    public static void main(String[] args) throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}

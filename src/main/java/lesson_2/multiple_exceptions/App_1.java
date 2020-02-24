package lesson_2.multiple_exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class App_1 {
    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        f0();
        f1();
    }
    public static void f0() throws EOFException {}
    public static void f1() throws FileNotFoundException {}
}

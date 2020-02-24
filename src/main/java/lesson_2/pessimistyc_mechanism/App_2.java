package lesson_2.pessimistyc_mechanism;

public class App_2 {
    public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
        throw new Exception(); // а кидаем только Exception
    }
}

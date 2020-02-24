package lesson_2.catch_or_throws;

public class App_2 {
    public static void main(String[] args) {
        try {
            throw new Throwable();
        } catch (Exception e) {
            // ...
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

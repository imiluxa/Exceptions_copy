package lesson_1.system_err;

public class App {
    public static void main(String[] args) {
        System.out.println("sout");
        throw new Error();
    }
}

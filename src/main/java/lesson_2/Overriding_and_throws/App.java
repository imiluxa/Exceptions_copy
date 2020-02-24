package lesson_2.Overriding_and_throws;

public class App {
    public static void main(String[] args) {
        // тут все компилируется, Demo.test хотел Parent и мы дали ему подтип - Child
        Demo.test(new Child());
    }
}

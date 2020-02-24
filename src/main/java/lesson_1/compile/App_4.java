package lesson_1.compile;

public class App_4 {
    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            System.out.println("Bad ...");
        }
        return width * height;
    }

}

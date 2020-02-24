package lesson_1.compile;

public class App_5 {
    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            return -1; // специальное "неправильное" значение площади
        }
        return width * height;
    }
}

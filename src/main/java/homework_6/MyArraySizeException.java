package homework_6;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Размер введенного массива некорректный!");
    }
}

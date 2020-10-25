package homework_6;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(String message) {
        super("Некорректные данные "+message);
    }
}

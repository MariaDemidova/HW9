package demidova.exceptions;

public class MyArraySizeException extends SomeArrayException{
    public MyArraySizeException() {
        super("Размер массива должен быть 4x4");
    }
}

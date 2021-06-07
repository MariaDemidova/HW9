package demidova.exceptions;

public class MyArrayDataException extends SomeArrayException{
    public MyArrayDataException(int a, int b) {
        super(String.format("Ошибка преобразвания инта в ячейке [%d, %d]", a + 1, b + 1));
    }
}

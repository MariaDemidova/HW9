package demidova;

import demidova.exceptions.SomeArrayException;

public class Main {

    public static void main(String[] args) {
        String[][] arr1 = {
                {"1", "2", "3", "4" },
                {"2", "3", "3", "3" },
                {"6", "2", "3", "4" },
                {"3", "2", "3", "4" }
        };
        String[][] arr2 = {
                {"1", "2" },
                {"2", "3", "3", "3" },
                {"6", "2", "3", "4" },
                {"3", "2", "3", "4" }
        };
        String[][] arr3 = {
                {"1", "2", "2", "2" },
                {"2", "3", "f", "3" },
                {"6", "2", "3", "4" },
                {"3", "2", "3" }   //не получается, чтоб находил обе ошибки :(
        };
        try {
            System.out.println("Сумма элементов массиваа: " + ConvertArray.convertAndSumm(arr1));
        } catch (SomeArrayException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("Сумма элементов массиваа: " + ConvertArray.convertAndSumm(arr2));
        } catch (SomeArrayException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println("Сумма элементов массиваа: " + ConvertArray.convertAndSumm(arr3));
        } catch (SomeArrayException e) {
            System.err.println(e.getMessage());
        }
    }
}

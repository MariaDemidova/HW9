package demidova;

import demidova.exceptions.MyArrayDataException;
import demidova.exceptions.MyArraySizeException;

public class ConvertArray {

    public static int convertAndSumm(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int summ = 0;

        if (4 != arr.length) throw new MyArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            if (4 != arr[i].length) throw new MyArraySizeException();
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    summ += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return summ;
    }
}

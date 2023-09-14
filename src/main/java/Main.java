public class Main {
    public static void main(String[] arg) {
        String[][] array = new String[][]{{"1", "1", "1", "1"}, {"1", "1", "1", "!"}, {"1", "1", "1", "1"}, {"!", "/", "1", "1"}};
        try {
            System.out.println("Сумма элементов массива " + arrayCheck(array));
        } catch (MyArraySizeException ex) {
            System.out.println("Размер полученного массива не 4х4");
        } catch (MyArrayDataException e) {
            e.print();
        }
    }

    public static int arrayCheck(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int element = 0;
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                try {
                    element = element + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return element;
    }
}

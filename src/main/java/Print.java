
public class Print {

    // Задание №1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание №2
    public static void checkSumSign() {
        int a = 23;
        int b = -230;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание №3
    public static void printColor() {
        int value = -99;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (0 < value && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //Задание №4
    public static void compareNumbers() {
        int a = 23;
        int b = 230;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}

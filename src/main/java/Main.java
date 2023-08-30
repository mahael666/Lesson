import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ответ на задание №1 " + sumOfTwoNumbers(13,4));
        positiveOrNegativeNumber(0);
        System.out.println("Ответ на задание №3 " + numberСheck(-3));
        linePrinting("Привет, как дела?",5);
        System.out.println("Ответ на задание №5 " + definitionOfTheYear());
        arrayChange();
        arrayFilling();
        multiplicationOfElements();
        matrixDiagonalFilling();
        System.out.println("Ответ на задание №10 " + Arrays.toString(arrayOutput(15,5)));
    }
    // Задание №1
    public static boolean sumOfTwoNumbers(int a, int b){

        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    // Задание №2
    public  static void positiveOrNegativeNumber(int a){
        System.out.print("Ответ на задание №2 ");
        if (a >=0 ){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    // Задание №3
    public static boolean numberСheck(int a){
        return a < 0;
    }
    // Задание №4
    public static void linePrinting(String a, int b){
        int i =0;
        System.out.println("Ответ на задание №4 ");
        while (i < b) {
            System.out.println(a);
            i++;
        }
    }
    //Задание №5
    public static boolean definitionOfTheYear(){
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Введите год: ");
        year = input.nextInt();
        if ((year % 100 == 0) && (year % 400 == 0)){
            return true;
        }
        if ((year % 100 == 0) && (year % 400 != 0)){
            return false;
        }
        if (year % 4 == 0){
            return true;
        } else {
            return false;
        }
    }
    //Задание №6
    public static void arrayChange(){
        int[] array = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++){
        /*   switch (array[i]){
               case 0:
                   array[i]=1; break;
               case 1:
                   array[i]=0; break; */
           /* if(array[i]  % 2 != 0 ){
                array[i] = 0;
           } else{
                array[i] = 1;
            } */
            array[i] = (array[i] + 1) % 2;
        }
        System.out.println("Ответ на задание №6 " + Arrays.toString(array));
    }
    //Задание №7
    public static void arrayFilling(){
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        System.out.println("Ответ на задание №7 " + Arrays.toString(array));
    }
    //Задание №8
    public static void multiplicationOfElements(){
        int[] array = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < array.length; i++){
            if (array[i]<6){
                array[i]= array[i] * 2;
            }
        }
        System.out.println("Ответ на задание №8 " + Arrays.toString(array));
    }
    //Задание №9
    public static void matrixDiagonalFilling(){
        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            if (i == i){
                array[i][i] = 1;
                array[i][array.length - 1 - i] = 1;
            }
        }
        System.out.println("Ответ на задание №9 ");
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
    }
    //Задание №10
    public static int[] arrayOutput(int len, int initialValue){
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;
    }
}
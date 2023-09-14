public class MyArrayDataException extends Exception {
    public int i;
    public int j;
    MyArrayDataException(int i, int j){
        this.i = i;
        this.j = j;
    }
    public void print (){
        System.out.println("Ошибка в элементне " + i + "," + j);
    }


}

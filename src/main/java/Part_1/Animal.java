package Part_1;

public class Animal implements Run, Swim {
    static String animalName;
    public static int countAnimal = 0;

    public Animal(String animalName) {
        this.animalName = animalName;
        countAnimal++;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    @Override
    public void run(int distance) {
        System.out.println(animalName + " пробежал " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println(animalName + " проплыл " + distance + " м.");
    }
}

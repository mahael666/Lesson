package Part_1;

public class Dog extends Animal{
    private static int countDog = 0;
    public Dog(String animalName) {
        super(animalName);
        countDog++;
    }
    public static int getCountDog() {
        return countDog;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println(animalName + " не может бежать больше " + 500 + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println(animalName + " не может плыть больше " + 10 + " м.");
        }

    }}

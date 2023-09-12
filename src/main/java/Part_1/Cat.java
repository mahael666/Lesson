package Part_1;

import org.jetbrains.annotations.NotNull;

public class Cat extends Animal implements Eat {
    public boolean satiety;
    public static int countCat = 0;

    public Cat(String animalName) {
        super(animalName);
        satiety = false;
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    @Override
    public void run(int distance) {
        if (distance <= 150) {
            super.run(distance);
        } else {
            System.out.println(animalName + " не умеет бегать на дистанцию более " + 150 + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 0) {
            super.run(distance);
        } else {
            System.out.println(animalName + " не умеет плавать");
        }
    }

    @Override
    public void eat(int food, @NotNull Plate plate) {
        if (plate.getFood() < food) {
            return;
        }
        plate.setFood(-food);
        satiety = true;
    }
}

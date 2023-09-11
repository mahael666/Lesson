package Part_1;

public class AnimalApp {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Парсик");
        cats[2] = new Cat("Марсик");
        cats[3] = new Cat("Варсик");
        cats[4] = new Cat("Дарсик");

        Plate plate = new Plate(35);

        int food = 8;
        for (Cat cat : cats) {
            cat.eat(food++, plate);
            System.out.println(cat.satiety);
        }

        System.out.println("В тарелке осталось " + plate.getFood() + " еды.");
    }
}

public class Main {
    public static void main(String[] args) {
        Сollaborator.Сollaborator1.infoСollaborator();
        searchByOld();
    }

    public static void searchByOld() {
        Сollaborator[] collaboratorArray = new Сollaborator[5];
        collaboratorArray[0] = new Сollaborator("Куц Михаил Александрович", "Тестировщик", "mahael@gmail.com", 88005553535L, 45445, 27);
        collaboratorArray[1] = new Сollaborator("Иванов Иван Иванович", "Ученый", "scientis@gmail.com", 89543533545L, 66666, 40);
        collaboratorArray[2] = new Сollaborator("Сергеев Сергей Сергеевич", "Дизайнер", "design@gmail.com", 89678649863L, 77777, 57);
        collaboratorArray[3] = new Сollaborator("Любочина Любовь Львовна", "Менеджер", "manager@gmail.com", 86788763223L, 88888, 19);
        collaboratorArray[4] = new Сollaborator("Ахалаев Ахалай Ахалаевич", "Айти Лид", "itlid@gmail.com", 89877896565L, 99999, 30);

        for (int i = 0; i < collaboratorArray.length; i++) {
            if (collaboratorArray[i].age >= 40) {
                System.out.println(collaboratorArray[i]);
            }
        }
    }
}
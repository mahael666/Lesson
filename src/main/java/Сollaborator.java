public class Сollaborator {

    public String fullName;
    public String position;
    public String email;
    public long phoneNumber;
    public int salary;
    public int age;

    static Сollaborator Сollaborator1 = new Сollaborator("Куц Михаил Александрович", "Тестировщик", "mahael@gmail.com",
            88005553535L, 45445, 27);

    public Сollaborator(String fullName, String position, String email, long phoneNumber,
                        int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void infoСollaborator() {
        System.out.println("ФИО: " + fullName + " Должность: " + position + " email: " + email
                + " Номер телефона: " + phoneNumber + " Заработная плата: " + salary + " Возраст: " + age);
    }

    public String toString() {
        return "ФИО: " + this.fullName + " Должность: " + this.position + " email: " + this.email + " Номер телефона: "
                + this.phoneNumber + " Заработная плата: " + this.salary + " Возраст: " + this.age;
    }


}

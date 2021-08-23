package lesson5;

public class User {

    private int id;
    private String name;
    private String position;
    private String email;
    private int tel;
    private int salary;
    private int age;


    public User(int id, String name, String position, String email, int tel, int salary, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("id: " + id + "; Имя пользователя: " + name + "; Должность: " + position + "; Почта: " + email + "; Телефон: " + tel + "; Зарплата : " + salary + "; Возраст: " + age);
    }

    public int getAge() {
       return this.age;
    }

    public String getName() {
        return this.name;
    }
}


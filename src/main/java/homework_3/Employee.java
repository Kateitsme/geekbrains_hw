package homework_3;


public class Employee {

    private String name;
    private String email;
    private int age;
    private String position;
    //конструктор
    public Employee(String name, int age, String email, String position) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.position = position;
    }
    //сеттеры
    public void setAge(int age) {
        this.age = age;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    //геттеры
    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    //данные сотрудника
    public String PrintInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Имя: ").append(this.name);
        info.append(", возраст: ").append(this.age);
        info.append(", email: ").append(this.email);
        info.append(", должность: ").append(this.position);
        return info.toString();
    }
}


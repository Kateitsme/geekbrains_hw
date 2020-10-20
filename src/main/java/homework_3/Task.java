package homework_3;

public class Task {
    public static void main(String[] args) {
        Employee Marina = new Employee("Марина", 27, "himarina@ok.ru", "Разработчик");
        System.out.println(Marina.PrintInfo());
        Employee Katya = new Employee("Катя", 22, "katya@ok.ru", "Стажер");
        Group AT = new Group("Тестирование");
        AT.addEmployee(Marina, Katya);
        AT.delEmployee(Marina);
        Employee Julia = new Employee("Юлия", 30, "julia@ok.ru", "Стажер");
        AT.addEmployee(Julia);
        AT.delEmployees();
        Group MT = new Group("Ручное тестирование");
        MT.addEmployee(Marina, Katya, Julia);
        MT.delEmployee(Julia);
        MT.delEmployeeByIndex(1);
    }
}


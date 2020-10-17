package homework_3;

import java.util.Arrays;

public class Group {
    private String name;
    private Employee[] employees;
    private static int MAX = 10;

    public Group(String name) {
        this.name = name;
        this.employees = new Employee[MAX];
    }

    public void addEmployee(Employee...newEmployee) {
        for (Employee employee : newEmployee) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = employee;
                    System.out.println("В группу " + name + " добавлен сотрудник " + employee.getName());
                    break;
                }
            }
        }
    }

    public void delEmployeeByIndex(int index) {
        this.employees[index] = null;
        System.out.println("Сотрудник с индексом: " + index + " удалён из группы " + name);
    }

    public void delEmployee(Employee employeeForDel) {
        for (int i = 0; i < employees.length; i++) {
            if (employeeForDel.equals(employees[i])) {
                System.out.println("Сотрудник " + employees[i].getName() + " удалён из группы " + name);
                employees[i] = null;
                return;
            }
        }
    }

    public void delEmployees() {
        Arrays.fill(employees, null);
        System.out.println("Все сотрудники удалены из группы " + name);
    }
}

package ru.skypro;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[10];
        employeesArray[0] = new Employee("Плотников Андрей Михайлович", "Отдел кадров", 45_000);
        employeesArray[1] = new Employee("Кузнецова Анна Евгеньевна", "Отдел снабжения", 48_000);
        employeesArray[2] = new Employee("Лаврова Анна Михайловна", "Юридическиий отдел", 65_000);
        employeesArray[3] = new Employee("Мельникова Софья Арсентьевна", "Финансовая служба", 56_000);
        employeesArray[4] = new Employee("Золотарева Варвара Тимуровна", "Финансовая служба", 35_000);
        employeesArray[5] = new Employee("Миронов Иван Евгеньевич", "Информационный отдел", 37_000);
        employeesArray[6] = new Employee("Андреева Анастасия Глебовна", "Отдел снабжения", 32_000);
        employeesArray[7] = new Employee("Белов Макар Даниилович", "Отдел кадров", 27_000);
        employeesArray[8] = new Employee("Морозова Евдокия Ярославовна", "Финансовая служба", 41_000);
        employeesArray[9] = new Employee("Семенова Варвара Игоревна", "Информационный отдел", 30_000);

        getAllEmployeesAndPrint(employeesArray);
        System.out.println();

        spendMonthlyOnSalaryAndPrint(employeesArray);
        System.out.println();

        findMaxSalaryAndPrint(employeesArray);
        System.out.println();

        findMinSalaryAndPrint(employeesArray);
        System.out.println();

        findAverageSalaryAndPrint(employeesArray);
        System.out.println();

        fullNameEmployeesAndPrint(employeesArray);
        System.out.println();
    }

    public static void getAllEmployeesAndPrint(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void spendMonthlyOnSalaryAndPrint(Employee[] employees) {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Расходы на зарплаты в месяц = " + sum);
    }

    public static void findMinSalaryAndPrint(Employee[] employees) {
        Employee result = employees[0];
        float minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee   ;
            }
        }
        System.out.println("Минимальная зарплата в коллективе = " + result);
    }

    public static void findMaxSalaryAndPrint(Employee[] employees) {
        Employee result = employees[0];
        float maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        System.out.println("Максимальная зарплата в коллективе = " + result);
    }

    public static void findAverageSalaryAndPrint(Employee[] employees) {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeeCount++;
            }
        }
        float averageSalary =  sum / employeeCount;
        System.out.println("Средняя зарплата в коллективе = " + averageSalary);
    }

    public static void fullNameEmployeesAndPrint(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("ФИО сотрудника: " + employees[i].getFullName());
            }
        }
    }

    public static boolean addEmployee(Employee[] employees, Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                System.out.println("В книгу добавлен сотрудник " + newEmployee.getFullName());
                return true;
            }
        }
        System.out.println("Книга сотрудников заполнена. Добавить не удалось.");
        return false;
    }
}

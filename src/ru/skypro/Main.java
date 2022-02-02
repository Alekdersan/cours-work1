package ru.skypro;

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

        getAllEmployees(employeesArray);
        System.out.println();

        spendMonthlyOnSalary(employeesArray);
        System.out.println();

        findMaxSalary(employeesArray);
        System.out.println();

        findMinSalary(employeesArray);
        System.out.println();

        findAverageSalary(employeesArray);
        System.out.println();

        fullNameEmployees(employeesArray);
    }

    public static void getAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void spendMonthlyOnSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Расходы на зарплаты в месяц = " + sum);
    }

    public static void findMinSalary(Employee[] employees) {
        float minSalary = 100_000;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата в коллективе = " + minSalary);
    }

    public static void findMaxSalary(Employee[] employees) {
        float maxSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата в коллективе = " + maxSalary);
    }

    public static void findAverageSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        float averageSalary = sum / employees.length;
        System.out.println("Средняя зарплата в коллективе = " + averageSalary);
    }

    public static void fullNameEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО сотрудника: " + employees[i].getFullName());
        }
    }
}
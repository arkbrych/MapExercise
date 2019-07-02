package app;

import java.util.Scanner;

/**
 * @author Arkadiusz
 * Application addds name, surname and salary to map.
 * After that app is removes employee from the map.
 */
public class CompanyApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Company company = new Company();

        System.out.println("Write name");
        String name = input.nextLine();
        System.out.println("Write surname");
        String surname = input.nextLine();
        System.out.println("Write salary");
        int salary = input.nextInt();
        Employee employee = new Employee(name, surname, salary);
        company.addEmployeeToCompany(employee);

        System.out.println(company.getAllEmployees());

        company.removeBySurname("Brych");

        System.out.println(company.getAllEmployees());
    }
}

package app;

import java.util.*;

class Company {

    private Map<String, Employee> stringEmployeeMap = new HashMap<>();

    Employee findEmployeeBySurname(String surname) {
        Employee employee = stringEmployeeMap.get(surname);
        return employee;
    }

    void addEmployeeToCompany (Employee employee){
        stringEmployeeMap.put(employee.getSurname(),employee);
    }

    void removeEmployeeFromCompany (Employee employee){
        stringEmployeeMap.remove(employee.getSurname());
    }

    void removeBySurname (String surname){
        stringEmployeeMap.remove(surname);
    }

    Collection<Employee> getAllEmployees(){
        return stringEmployeeMap.values();
    }

    List<Employee> getAllEmployees2(){
        return new ArrayList<>(stringEmployeeMap.values());
    }
}

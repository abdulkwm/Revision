package interview.comparator;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeTreeMap {
    public static void main(String[] args) {
        Map<Employee, Object> employeeMap = new TreeMap<>(new EmployeeIdComparator());

        employeeMap.put(new Employee(1, "Abdu"), new Object());
        employeeMap.put(new Employee(3, "Sekina"), new Object());
        employeeMap.put(new Employee(5, "Zakir"), new Object());
        employeeMap.put(new Employee(2, "John"), new Object());

        System.out.println("Employee Stored in Tree Map");
        for (Employee employee : employeeMap.keySet()){
            System.out.println("Id: " + employee.id + ", Employee: " + employee.name);
        }

    }
}

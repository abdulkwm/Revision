package interview.comparator;

import java.util.TreeSet;

public class EmployeeTreeSetSorting {
    public static void main(String[] args) {
        TreeSet<Employee> employeeTreeSet = new TreeSet<>(new EmployeeIdComparator());
        employeeTreeSet.add(new Employee(1,"Abdu"));
        employeeTreeSet.add(new Employee(2,"John"));
        employeeTreeSet.add(new Employee(8,"Alex"));
        employeeTreeSet.add(new Employee(4,"Zakir"));
        for (Employee employee : employeeTreeSet){
            System.out.println(employee);
        }
    }
}

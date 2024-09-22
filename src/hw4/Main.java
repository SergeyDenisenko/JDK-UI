package hw4;

import hw4.Classes.Employee;
import hw4.Classes.EmployeeDirectory;
import hw4.Interfaces.iEmployee;
import hw4.Interfaces.iEmployeeDirectory;

public class Main {
    public static void main(String[] args) {
        iEmployeeDirectory employeeDirectory = new EmployeeDirectory(new Employee(345, "Николай", "89645413672", 10));

        iEmployee emp1 = new Employee(240, "Федор", "891845612378", 24);
        iEmployee emp2 = new Employee(1004, "Марина", "896596565650", 6);
        iEmployee emp3 = new Employee(105, "Нина", "89678543751", 50);
        iEmployee emp4 = new Employee(57, "Николай", "89003456565", 72);

        employeeDirectory.add(emp1);
        employeeDirectory.add(emp2);
        employeeDirectory.add(emp3);
        employeeDirectory.add(emp4);

        System.out.println("Сотрудники со стажем 6 месяцев: " + employeeDirectory.findByExperience(6));
        System.out.println("Сотрудник с табельным номером 240: " + employeeDirectory.findByServiceNumber(240));
        System.out.println("Номера телефонов сотрудников с именем Николай: " + employeeDirectory.getPhoneByName("Николай"));
        System.out.println("Номера телефонов сотрудников с именем Николай: " + employeeDirectory.getPhoneByName("Николай", true));
    }
}

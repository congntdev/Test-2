package Test;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EmployeeImplement employeeMain = new EmployeeImplement();

        List<Employee> employees = employeeMain.addEmployee();

        Map<Team, List<Employee>> company = employeeMain.deviceEmployeeToCompany(employees);

        System.out.println(employeeMain.getLate(company));

        System.out.println(employeeMain.getOver3Time(company));
    }
}

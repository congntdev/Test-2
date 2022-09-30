package Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeImplement implements IEmployee {

    @Override
    public List<Employee> addEmployee() {
        var employeeList = new LinkedList<Employee>();
        employeeList.add(new Employee("1", "Laura", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_2,
                List.of(Map.of(LocalDate.of(2022, 9, 25), LocalTime.of(7, 35)),
                        Map.of(LocalDate.of(2022, 9, 26), LocalTime.of(7,25)),
                        Map.of(LocalDate.of(2022, 9, 27), LocalTime.of(7, 20)),
                        Map.of(LocalDate.of(2022, 9, 28), LocalTime.of(7, 28)),
                        Map.of(LocalDate.of(2022, 9, 29), LocalTime.of(7, 25)),
                        Map.of(LocalDate.of(2022, 9, 30), LocalTime.of(7, 32)))));
        employeeList.add(new Employee("2", "Maya", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_3,
                List.of(Map.of(LocalDate.of(2022, 9, 25), LocalTime.of(7, 32)),
                        Map.of(LocalDate.of(2022, 9, 26), LocalTime.of(7,35)),
                        Map.of(LocalDate.of(2022, 9, 27), LocalTime.of(7, 30)),
                        Map.of(LocalDate.of(2022, 9, 28), LocalTime.of(7, 35)),
                        Map.of(LocalDate.of(2022, 9, 29), LocalTime.of(7, 33)),
                        Map.of(LocalDate.of(2022, 9, 30), LocalTime.of(7, 32)))));
        employeeList.add(new Employee("3", "James", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_1,
                List.of(Map.of(LocalDate.of(2022, 9, 25), LocalTime.of(7, 33)),
                        Map.of(LocalDate.of(2022, 9, 26), LocalTime.of(7,25)),
                        Map.of(LocalDate.of(2022, 9, 27), LocalTime.of(7, 20)),
                        Map.of(LocalDate.of(2022, 9, 28), LocalTime.of(7, 28)),
                        Map.of(LocalDate.of(2022, 9, 29), LocalTime.of(7, 25)),
                        Map.of(LocalDate.of(2022, 9, 30), LocalTime.of(7, 32)))));
        employeeList.add(new Employee("4", "Jay", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_4,
                List.of(Map.of(LocalDate.of(2022, 9, 25), LocalTime.of(7, 25)),
                        Map.of(LocalDate.of(2022, 9, 26), LocalTime.of(7,25)),
                        Map.of(LocalDate.of(2022, 9, 27), LocalTime.of(7, 20)),
                        Map.of(LocalDate.of(2022, 9, 28), LocalTime.of(7, 28)),
                        Map.of(LocalDate.of(2022, 9, 29), LocalTime.of(7, 25)),
                        Map.of(LocalDate.of(2022, 9, 30), LocalTime.of(7, 32)))));
        employeeList.add(new Employee("5", "Jessica", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_5,
                List.of(Map.of(LocalDate.of(2022, 9, 25), LocalTime.of(7, 28)),
                        Map.of(LocalDate.of(2022, 9, 26), LocalTime.of(7,25)),
                        Map.of(LocalDate.of(2022, 9, 27), LocalTime.of(7, 20)),
                        Map.of(LocalDate.of(2022, 9, 28), LocalTime.of(7, 28)),
                        Map.of(LocalDate.of(2022, 9, 29), LocalTime.of(7, 25)),
                        Map.of(LocalDate.of(2022, 9, 30), LocalTime.of(7, 32)))));
        employeeList.add(new Employee("6", "Lulu", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_6,
                List.of(Map.of(LocalDate.of(2022, 9, 25), LocalTime.of(7, 31)),
                        Map.of(LocalDate.of(2022, 9, 26), LocalTime.of(7,25)),
                        Map.of(LocalDate.of(2022, 9, 27), LocalTime.of(7, 20)),
                        Map.of(LocalDate.of(2022, 9, 28), LocalTime.of(7, 28)),
                        Map.of(LocalDate.of(2022, 9, 29), LocalTime.of(7, 25)),
                        Map.of(LocalDate.of(2022, 9, 30), LocalTime.of(7, 32)))));
        employeeList.add(new Employee("7", "Philip", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_7,
                List.of(Map.of(LocalDate.of(2022, 9, 25), LocalTime.of(7, 35)),
                        Map.of(LocalDate.of(2022, 9, 26), LocalTime.of(7,25)),
                        Map.of(LocalDate.of(2022, 9, 27), LocalTime.of(7, 34)),
                        Map.of(LocalDate.of(2022, 9, 28), LocalTime.of(7, 28)),
                        Map.of(LocalDate.of(2022, 9, 29), LocalTime.of(7, 33)),
                        Map.of(LocalDate.of(2022, 9, 30), LocalTime.of(7, 32)))));
        employeeList.add(new Employee("8", "Johnson", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_8,
                List.of(Map.of(LocalDate.of(2022, 9, 25), LocalTime.of(7, 28)),
                        Map.of(LocalDate.of(2022, 9, 26), LocalTime.of(7,24)),
                        Map.of(LocalDate.of(2022, 9, 27), LocalTime.of(7, 20)),
                        Map.of(LocalDate.of(2022, 9, 28), LocalTime.of(7, 28)),
                        Map.of(LocalDate.of(2022, 9, 29), LocalTime.of(7, 25)),
                        Map.of(LocalDate.of(2022, 9, 30), LocalTime.of(7, 32)))));
        employeeList.add(new Employee("9", "Rick", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_9,
                List.of(Map.of(LocalDate.of(2022, 9, 25), LocalTime.of(7, 15)),
                        Map.of(LocalDate.of(2022, 9, 26), LocalTime.of(7,25)),
                        Map.of(LocalDate.of(2022, 9, 27), LocalTime.of(7, 20)),
                        Map.of(LocalDate.of(2022, 9, 28), LocalTime.of(7, 28)),
                        Map.of(LocalDate.of(2022, 9, 29), LocalTime.of(7, 25)),
                        Map.of(LocalDate.of(2022, 9, 30), LocalTime.of(7, 32)))));
        employeeList.add(new Employee("10", "Ben", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_10,
                List.of(Map.of(LocalDate.of(2022, 9, 25), LocalTime.of(7, 15)),
                        Map.of(LocalDate.of(2022, 9, 26), LocalTime.of(7,15)),
                        Map.of(LocalDate.of(2022, 9, 27), LocalTime.of(7, 20)),
                        Map.of(LocalDate.of(2022, 9, 28), LocalTime.of(7, 28)),
                        Map.of(LocalDate.of(2022, 9, 29), LocalTime.of(7, 25)),
                        Map.of(LocalDate.of(2022, 9, 30), LocalTime.of(7, 32)))));
        return employeeList;
    }

    @Override
    public Map<Team, List<Employee>> deviceEmployeeToCompany(List<Employee> company) {
        return company.stream()
                .collect(Collectors.groupingBy(
                        Employee::getTeam,
                        HashMap::new,
                        Collectors.mapping(Function.identity(), Collectors.toList())));
    }

    @Override
    public Map<Team, List<Employee>> getLate(Map<Team, List<Employee>> company) {
        var employeeLate = new HashMap<Team, List<Employee>>();
        company.forEach((team, employees) -> {
            employeeLate.put(team,
                    employees.forEach(employee -> {
                        employee.getTimeKeeping().forEach(dateTime -> {
                            dateTime.values().stream()
                                    .filter(localTime -> localTime.isAfter(LocalTime.of(7,30)))
                                    .count() > 3
                                    .collect(Collectors.toList());
                        });
                    });
            )

        });
        return employeeLate;
    }

    @Override
    public Map<Team, List<Employee>> getOver3Time(Map<Team, List<Employee>> company) {
        var employeeOver3Time = new HashMap<Team, List<Employee>>();
        company.forEach((team, employees) -> {
            employeeOver3Time.put(team,
                    employees.stream()
                            .filter(employee -> employee.getTimeKeeping().stream()
                                    .skip(2).isParallel())
                            .collect(Collectors.toList()));
        });
        return employeeOver3Time;
    }


}

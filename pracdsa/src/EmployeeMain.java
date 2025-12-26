import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {


    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Alice", "IT", 90000),
                new Employee(2, "Bob", "IT", 85000),
                new Employee(3, "Charlie", "IT", 95000),
                new Employee(4, "David", "IT", 80000),
                new Employee(5, "Eve", "HR", 70000),
                new Employee(6, "Frank", "HR", 75000),
                new Employee(7, "Grace", "HR", 72000),
                new Employee(8, "Hank", "HR", 68000)
        );

        Map<String,List<Employee>>  departWiseEmp=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(departWiseEmp);
//        Map<String, List<Employee>> top3HeighestSalary=departWiseEmp.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,entry->entry.getValue().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList())));
//
//        System.out.println(top3HeighestSalary);

        departWiseEmp.replaceAll((dept,list)->

            list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).limit(1).collect(Collectors.toList())
        );
        System.out.println(departWiseEmp);
//        departWiseEmp.forEach((dept,empl)->
//        {
//            System.out.println("depart name"+ dept);
//            empl.
//        });
        departWiseEmp.forEach((depat,emp)->
        {
            System.out.println("department "+ depat);
            emp.forEach(e-> {
                System.out.println(e.getName());
                System.out.println(e.getSalary());
            });
        });

        Map<String, Optional<Employee>> heighestSalary=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));


        System.out.println(heighestSalary);

        Map<String,Double> averageSalaryDept=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Department wise Average Salary "+ averageSalaryDept);
        Map<String,Double> sumDeptWiseSalary=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
        System.out.println("Department wise total salary "+ sumDeptWiseSalary);

    }
}

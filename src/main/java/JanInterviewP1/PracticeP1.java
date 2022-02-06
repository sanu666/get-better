package JanInterviewP1;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class PracticeP1 {

    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();

        // group employees by dept
        Map<String, List<Employee>> mapDeptWiseEmployees = employeeList.stream().collect(groupingBy(x -> x.empDept));

        //each dept highest sal employee
        employeeList.stream().collect(groupingBy(x->x.empDept,collectingAndThen(maxBy(comparingInt(x->x.salary)),Optional::get)));

        //Second highest sal emp
        employeeList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst();

//        employeeList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst();
//        employeeList.stream().collect(groupingBy(x->x.empDept,collectingAndThen(maxBy(comparingInt(x->x.salary)),Optional::get)))

    }
}

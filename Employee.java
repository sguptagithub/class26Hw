package class26Hw;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
    John Smith=$100000
     */
        public static void main(String[] args) {
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Jim Smith", 140000);
        employeeMap.put("John Williams", 120000);
        employeeMap.put("Frank Taylor", 170000);

        String highestPaidEmployee = "";
        int highestSalary = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()){
            String employee = entry.getKey();
            int salary = entry.getValue();

            if(salary> highestSalary){
                highestSalary = salary;
                highestPaidEmployee = employee;
            }
        }
        System.out.println(highestPaidEmployee + "=$" + highestSalary);
    }
}

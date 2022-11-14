package class28;

import java.util.HashMap;
import java.util.Map;

public class HW5 {
    /*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000  */
    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Joe", 55000);
        employees.put("Mary", 90000);
        employees.put("John Smith", 100000);
        employees.put("Mike", 60000);
        // we can create a TreeSet from the values and the last number will be the highest
      /*  TreeSet <Integer> salary= new TreeSet<>(employees.values());
        int maxSalary=salary.last();
        System.out.println(maxSalary);  */
        int maxSalary = 0;
        for (var sal : employees.entrySet()) {
            if (sal.getValue() > maxSalary) {
                maxSalary = +sal.getValue();
                System.out.println(sal.getKey() + " = $" + sal.getValue());
            }



        }
    }
}


package class26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HW6 {
    /*Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
     Each student object should have name and studentID. Display name of each student.
     */
    public static void main(String[] args) {
        Map <String, Integer> students= new HashMap<>();
        students.put("John", 12345);
        students.put("Mary", 32145);
        students.put("Amjad", 78945);
        students.put("Bill", 94215);

        System.out.println(students);

        System.out.println("***************");

        Collection<String> student= students.keySet();
        System.out.println(student);







    }
}

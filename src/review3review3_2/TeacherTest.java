package review3review3_2;

import review3.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher t= new Teacher("John","Smith");
        Teacher.work();  // we can call only work method from Teacher class because work method is public
    }
}

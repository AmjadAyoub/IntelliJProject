package class19;

public class HW3 {

    //Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
    //ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
}
    class Teacher {
        String subject;
        String gender;
        int noOfYearsExp;

        public Teacher(String subject, String gender, int noOfYearsExp) {
            this.subject = subject;
            this.gender = gender;
            this.noOfYearsExp = noOfYearsExp;
        }


        void printInfo() {
            System.out.println(subject + " " + gender + " " + noOfYearsExp);

        }
    }

    class MathTeacher extends Teacher {
        MathTeacher(String subject, String gender, int noOfYearsExp) {

            super(subject, gender, noOfYearsExp);
        }
    }

    class ChemistryTeacher extends Teacher {
        ChemistryTeacher(String subject, String gender, int noOfYearsExp) {
            super(subject, gender, noOfYearsExp);
        }
            void teachChem(){
                System.out.println("teaching chemistry");
            }
        }


    class PianoTeacher extends Teacher {

    String pianoType;
        PianoTeacher(String subject, String gender, int noOfYearsExp, String pianoType) {
            super(subject, gender, noOfYearsExp);
            this.pianoType=pianoType;

        }
    }

    class TeacherTester {
        public static void main(String[] args) {
            Teacher teacher = new Teacher("which subject", "male or female", 10);
            teacher.printInfo();
            MathTeacher mathteacher = new MathTeacher("Mathematics", "male ", 7);
            mathteacher.printInfo();
            ChemistryTeacher chemistryteacher = new ChemistryTeacher("Chemistry", "female", 5);
            chemistryteacher.printInfo();
            PianoTeacher pianoteacher = new PianoTeacher("Piano", "female", 9, "canon");
            pianoteacher.printInfo();

        }
    }






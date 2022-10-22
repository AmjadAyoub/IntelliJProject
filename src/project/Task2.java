package project;

public class Task2 {
    /*We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code */


    public static void main(String[] args) {
        A a = new A(95,80,96);
        a.getPercentage();

        B b = new B(94,89,90,86);
        b.getPercentage();

    }

   }
   abstract class Marks {
    abstract void getPercentage();


        }

        class A extends Marks {

    A(double score1, double score2, double score3) {

        System.out.println((score1+score2+score3)/3);
    }

            void getPercentage() {

            }
        }

        class B extends Marks{
            B(double score4, double score5, double score6,double score7) {

                System.out.println((score4+score5+score6+score7)/4);
            }

            @Override
            void getPercentage() {

            }
        }

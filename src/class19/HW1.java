package class19;

public class HW1 {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

    public static class Neighborhood1 {
        String house;
        String room1;
        String room2;
        int noOfBaths;

        public Neighborhood1(String house, String room1, String room2, int noOfBaths) {
            this.house = house;
            this.room1 = room1;
            this.room2 = room2;
            this.noOfBaths = noOfBaths;
        }

        void printInfo() {
            System.out.println(house + " " + room1 + " " + room2 + " " + noOfBaths);
        }


    }


    public static class Neighborhood2 extends Neighborhood1 {
        Neighborhood2(String house, String room1, String room2, int noOfBaths) {
            super(house, room1, room2, noOfBaths);
        }


    }

    public static class Neighborhood3 extends Neighborhood2 {
        Neighborhood3(String house, String room1, String room2, int noOfBaths) {
            super(house, room1, room2, noOfBaths);

        }
    }


    static class Test1 {
        public static void main(String[] args) {
            Neighborhood2 neighborhoood2 = new Neighborhood2("towson", "master room", "Lina room", 2);
            neighborhoood2.printInfo();

            Neighborhood3 neighborhoood3 = new Neighborhood3("baltimore", "master room1", "Lina room1", 3);
            neighborhoood3.printInfo();

        }

    }
}

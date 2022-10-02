package class14;

public class HW5DifferentWay {

    //Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete
    //email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    String createEmail(String firstName,String lastName,String emailType) {

        return (firstName+lastName+"@"+emailType+".com").toLowerCase();


    }

    public static void main(String[] args) {
        HW5DifferentWay task5=new HW5DifferentWay();

        String fullEmail=task5.createEmail("John","Snow","gmail");
        System.out.println(fullEmail);
    }



}

package class14;

public class HW5 {
    //Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete
    //email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    void eMail(String firstName, String lastName, String eMailType) {
        System.out.println(firstName + "_" + lastName + "@" + eMailType + ".com");

    }

    public static void main(String[] args) {
        HW5 emailAddress = new HW5();
        emailAddress.eMail("amjad", "ayoub", "hotmail");
    }

}

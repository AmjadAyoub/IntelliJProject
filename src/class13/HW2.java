package class13;

public class HW2 {
    public static void main(String[] args) {
        // Create a String that should be combination of letters, numbers and special characters.
        //Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
        String str = "ahgsjdZVTJftjf1257503@%*!$$";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("str = " + str);
        System.out.println(str.length());

        System.out.println("-----------------");
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        System.out.println("The total number of alphanumerical characters is " + count);






    }
}
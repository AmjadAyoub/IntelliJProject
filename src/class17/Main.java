package class17;

public class Main {

    static String mixString(String s1, String s2) {

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j <= i; j++) {
                char[] charArray1 = s1.toCharArray();
                char[] charArray2 = s2.toCharArray();
                System.out.print(charArray1[i]);
                System.out.print(charArray2[j]);

            }
        }

        return "";
    }

    public static void main(String[] args) {
        Main obj = new Main();
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);

    }

}



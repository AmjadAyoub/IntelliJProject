package class17;

public  class Main1 {
    static int countVowels(String s) {
        int count=0;
        String str=s.replaceAll("[^aouieAOUIE]","");
        char[] charArray=str.toCharArray();
        for (int i=0; i<str.length(); i++) {
            count ++;
        }


        return count;
    }




    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}





package class17;

class Test {
      String spaceOut(String s) {
          for (int i = 0; i < s.length(); i++) {
              System.out.print(s.charAt(i)+ " ");

          }
          return s;

      }

      public static void main(String[] args) {
          Test space = new Test();
          space.spaceOut("hello");


      }
  }




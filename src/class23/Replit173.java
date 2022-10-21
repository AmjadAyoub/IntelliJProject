package class23;

public class Replit173 {

    public static void main(String[] args) {


        Tea obj = new LemonTea("LemonTea");
        obj.addSugar();

        Tea obj1 = new ChaiTea("ChaiTea");
        obj1.addSugar();


    }
}
abstract class Tea {
    String teaType;

    public Tea(String teaType) {
        this.teaType = teaType;
    }
    abstract void addSugar();
}
class LemonTea extends Tea {
    public LemonTea(String teaType) {
        super(teaType);
    }

    void addSugar () {
      System.out.println("For Lemon Tea we need 2 spoons of sugar");
}

}

class ChaiTea extends Tea {
    public ChaiTea(String teaType) {
        super(teaType);
    }

    void addSugar() {
        System.out.println("For Chai Tea we need 1 spoon of sugar");
    }


}

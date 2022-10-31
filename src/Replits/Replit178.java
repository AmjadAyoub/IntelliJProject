package Replits;

public class Replit178 {
  public static void main(String[] args) {
    EncapsulationDemo obj = new EncapsulationDemo("John", 30);
    System.out.println("Employee Name: "+ obj.getEmpName());
    System.out.println("Employee Age: "+obj.getEmpAge());

  }
}

  class EncapsulationDemo {
    private String empName;
    private int empAge;

    public EncapsulationDemo(String empName, int empAge) {
     setEmpName(empName);
      setEmpAge(empAge);
    }

    public String getEmpName() {
      return empName;
    }

    public void setEmpName(String empName) {
      this.empName = empName;
    }

    public int getEmpAge() {
      return empAge;
    }

    public void setEmpAge(int empAge) {
      this.empAge = empAge;
    }


  }

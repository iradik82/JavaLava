package repls;
class EncapsulationDemo{
    private String empName;
    private int empAge;

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
   }
}
public class repl178 {
    public static void main(String[] args) {
        EncapsulationDemo bob=new EncapsulationDemo();
        bob.setEmpName("John");
        bob.setEmpAge(30);
        System.out.println("Employee Name: "+bob.getEmpName());
        System.out.println("Employee Age: "+bob.getEmpAge());
    }
}

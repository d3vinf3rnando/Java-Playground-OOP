package Company;

public class Employee {
    String name; //instance varaibles
    int age;

    private int empId;
    private String empEmail;


    public void ageFinder(){

        String a="adult"; //local variables (example)
        if(age>18){
            System.out.println("Adult");
        }else {
            System.out.println("child");
        }

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
}

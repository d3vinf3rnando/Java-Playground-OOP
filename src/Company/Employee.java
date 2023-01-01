package Company;

public class Employee {
    String name; //instance varaibles
    int age;

    public void ageFinder(){

        String a="adult"; //local variables (example)
        if(age>18){
            System.out.println("Adult");
        }else {
            System.out.println("child");
        }
    }
}

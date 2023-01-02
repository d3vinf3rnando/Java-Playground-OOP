package Company;

public class Main {
    public static void main(String[] args) {
    Employee E1 = new Employee();
    E1.name="sunil";
    E1.age=12;

    E1.setEmpId(2001);
    E1.setEmpEmail("test@gmail.com");
    E1.ageFinder();

        System.out.println( E1.getEmpId());
        System.out.println(E1.getEmpEmail());
    }
}

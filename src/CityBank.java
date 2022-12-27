public class CityBank {
    String employee;
    String Customer;
     void EmpName(){
         System.out.println(employee);
     }

     void CusName(){
         System.out.println(Customer);
     }

    public static void main(String[] args) {
        CityBank Saman = new CityBank();
        Saman.employee="Saman edirimuni";
        Saman.EmpName();

    }
}

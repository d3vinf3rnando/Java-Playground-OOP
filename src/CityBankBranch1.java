public class CityBankBranch1 extends CityBank{

    void Delivery(){
        System.out.println(employee);
    }

    public static void main(String[] args) {
        CityBankBranch1 KasunCUS = new CityBankBranch1();
        KasunCUS.Customer="Kasun Malinda";
        KasunCUS.CusName();
    }
}

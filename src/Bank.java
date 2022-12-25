public class Bank{
    int vibeAccount;
    int savingsAccount;
    int lkr;

    Bank(int vibeAccNo){
        vibeAccount=vibeAccNo;
    }

    Bank(int savingsAccNo,int value){
        savingsAccount=savingsAccNo;
        lkr=value;

    }

    public static void main(String[]args){
        Bank SamanAccount = new Bank(1);
        Bank SunilAccount =new Bank(4,1000);


        System.out.println(SamanAccount.vibeAccount);
        System.out.println(SunilAccount.savingsAccount+","+SunilAccount.lkr);



    }
}
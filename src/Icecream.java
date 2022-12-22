public class Icecream{

    String name;
    String flavor;
    String toppings;
    int price;

    public void iceName(){
        System.out.println("Ice Cream Name: "+name);
    }

    public void invoice(){
        System.out.println(name);
        System.out.println(flavor);
        System.out.println(toppings);
        System.out.println(price);
    }

    public static void main(String[]args){
        Icecream vanila = new Icecream();
        vanila.name="vanila shake";
        vanila.flavor="vanila flavor";
        vanila.toppings="cashew, chocolate syrup";
        vanila.price=100;

        vanila.invoice();
        vanila.iceName();
    }


}
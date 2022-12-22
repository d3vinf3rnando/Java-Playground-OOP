public class StudentCall {
    public void Call(String name){
        System.out.println("Calling "+name+ "'s home");
    }

    public static void main(String [] args){
        StudentCall student1 = new StudentCall();
        student1.Call("sunil");

        StudentCall student2= new StudentCall();
        student2.Call("Mahinda");

        //update
    }
}

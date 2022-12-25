public class ConstTest {
    //java constructor testing

    String stuName;
    ConstTest(){
        stuName="kamala";
        System.out.println("im form constructer class.");
    }

    public static void main(String[]args){
        ConstTest student1 = new ConstTest();
        System.out.println(student1.stuName);
    }
}

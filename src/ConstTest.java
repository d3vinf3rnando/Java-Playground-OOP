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

        int num = 0;
        while(num<5){
            System.out.print(num+" ");
            num++;
        }

        System.out.println();

        //lists java
        String [] nameList={"nimal","kamal","sunil"};
        System.out.println(nameList[0]);

        int [][][] numbers={{{1,3,5},{2,4,6}},{{1,2,3,4,5,6}}};
        System.out.println(numbers[1][0][1]);
    }
}

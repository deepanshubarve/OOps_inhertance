package Variable;


class VariableTest{

    int a =10; //instance variable
    static int b = 2121;

    public  void RadhaRadha(){
        System.out.println("Jai shree krishna");
        System.out.println(a);
        System.out.println(b);

        //instance variable not able to use in static area
        //static variable can be use in instance area
    }


}

public class VariableDemo {
    public static void main(String[] args) {

        String s = "Heelo dosto";

        VariableTest variableTest1 = new VariableTest();
        variableTest1.RadhaRadha();
        variableTest1.a = 1000;

        variableTest1.b = 999;

        System.out.println("____________________________");


        VariableTest variableTest2 = new VariableTest();
        variableTest2.RadhaRadha();

    }
}

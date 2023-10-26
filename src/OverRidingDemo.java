
class OverRiding{

    public void printRam(){
        System.out.println("Ram");
    }
}

class OverridingTest extends OverRiding{

    public void printRam(){
        System.out.println("Lakshman");
    }

}

public class OverRidingDemo {
    public static void main(String[] args) {


        OverridingTest overridingTest = new OverridingTest();
        overridingTest.printRam(); //child method

        OverRiding overRiding = new OverRiding();
        overRiding.printRam(); //parent method

         OverRiding test = new OverridingTest();
         test.printRam();
    }
}

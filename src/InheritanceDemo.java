class Dhani{

    //Parent class
    //papa


     int a = 5;
    public void house(){
        System.out.println("Normal house");
    }


}

class DhaniKaBeta extends Dhani {
    //child class

    public void ModifiedHouse(){
        System.out.println("new house of ldka ");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Dhani dhani = new Dhani();
        dhani.house();



        DhaniKaBeta dhaniKaBeta = new DhaniKaBeta();
        dhaniKaBeta.ModifiedHouse();
        System.out.println(dhaniKaBeta.a);

    }

}

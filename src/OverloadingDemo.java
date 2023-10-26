class PolyTest{

    public void print(int a){
        System.out.println("house a " + a);

    }

    public void print(int a,int b){
        System.out.println("hello a"+ a+ " , "+b);
    }
}



public class OverloadingDemo {

    public static void main(String[] args) {

        PolyTest test = new PolyTest();
        test.print(10);
        test.print(20,10);

    }

}

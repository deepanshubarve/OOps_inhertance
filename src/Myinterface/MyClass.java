package Myinterface;


interface Myinterface2{
    void print();
}
interface Myinterface{

    int MAX_VALUE = 100;

    void hello1();//Abstract Method
    int hello2();//Abstract Method

    void hello3();

    //after Java 1.8
    default void m2(){
        System.out.println("demo do humko....");
    }
}

 class DemoAbs implements Myinterface,Myinterface2{

     @Override
     public void hello1() {
         System.out.println("Ram");
     }

     @Override
     public int hello2() {
         System.out.println("Site");
         return 0;
     }

     @Override
     public void hello3() {
         System.out.println("Ram Lakshman janki");
     }

     @Override
     public void print() {

     }
 }
public class MyClass {
    public static void main(String[] args) {

        DemoAbs demoAbs = new DemoAbs();
        System.out.println(demoAbs.MAX_VALUE);
        System.out.println(Myinterface.MAX_VALUE);
        demoAbs.hello1();
        demoAbs.hello2();
        demoAbs.hello3();

    }
}

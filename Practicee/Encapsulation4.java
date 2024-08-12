package Practicee;

class Test{
    //static variable
    static int a,b;

    //static block
    static {
        System.out.println("inside static block");
        a = 10;
        b = 20;
    }

    //static method
    static void fun(){
        System.out.println("inside static method");
    }

    //instance variable
    int x,y;

    //instance block
    {
        System.out.println("inside instance block");
    }

    //instance method
    void fun2(){
        System.out.println("inside instance method");
    }

    //constructor
    Test(){
        System.out.println("inside constructor");
        x = 30;
        y = 40;
    }
}

public class Encapsulation4 {
    public static void main (String[] args){
        Test.fun();
        Test t = new Test();
        t.fun2();
    }
}

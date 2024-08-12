package Practicee;

public class Exception2 {
    class Demo1{
        void fun1(){
            System.out.println("conn 1 is estd");
            Demo1 d1 = new Demo1();
            d1.fun1();
            System.out.println("conn 1 is ended");
        }
    }

    class Demo2{
        void fun1(){
            System.out.println("conn 2 is estd");
            Demo2 d1 = new Demo2();
            d1.fun1();
            System.out.println("conn 2 is ended");
        }
    }

    class Demo3{
        void fun(){
            System.out.println("conn 3 is estd");
            Demo2 d2 = new Demo2();
            d2.fun1();
            System.out.println("conn 3 is ended");
        }
    }

    public void main(String[] args){
        System.out.println("connection 1 is estd");
        Demo3 d3 = new Demo3();
        d3.fun();
        System.out.println("connection is ended");
    }
}







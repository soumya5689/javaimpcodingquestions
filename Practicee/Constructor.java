package Practicee;

class object1{

}
class Test3 extends object1{
    int x,y;
    Test3(){
        super();
        x = 100;
        y = 200;
    }
    Test3(int x, int y){
        //super();
        this.x = x;
        this.y = y;
    }
}

class Test4 extends Test3{
    int a,b; 
    Test4(){
        super();
        a = 300;
        b = 400;
    }

    Test4(int a , int b){
        //super();
        this.a = a;
        this.b = b;
    }
    void disp(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}

public class Constructor {
    public static void main(String[] args){
        Test4 t = new Test4();
        t.disp();
    }
}

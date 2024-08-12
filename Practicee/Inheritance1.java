package Practicee;

class Account{
    int accNum = 28700;
    int pin = 4852;
}
class Hacker extends Account{
    void disp(){
        System.out.println(accNum);
        System.out.println(pin);
    }
    void changeData(){
        accNum = 6789;
        pin = 2580;
    }
}
public class Inheritance1 {
    public static void main(String[] args){
        Hacker h = new Hacker();
        h.disp();
        h.changeData();
        h.disp();
    }

}

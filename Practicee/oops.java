package Practicee;

class BankAccount{
    private float bal;
    private long acc;


    public BankAccount(){

    }
    public void setData(float x){
        bal = x;
    }
    public float getData(){
        //return the value of the private variable bal
        return bal;
    }
}

public class oops {
    public static void main(String[] args){

        //create an object of bank acc class
        BankAccount ba = new BankAccount();
        //set value of the balance to 1000
        ba.setData(1000);
        //get  the value of the balance

        System.out.println(ba.getData());
    }

}

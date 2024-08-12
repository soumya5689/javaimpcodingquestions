package Practicee;

class Customer{
    private int cID;
    private String cName;
    private long cNum;

    public void setData(int cID, String cName, long cNum){
       this.cID = cID;
       this.cName = cName;
       this.cNum = cNum;
    }
    public int getcID(){
        return cID;
    }
    public String getcName(){
        return cName;
    }
    public long getcNum(){
        return cNum;
    }
}

public class Encpasulation{
    public static void main(String[] args){
        Customer c = new Customer();
        c.setData( 1,"rohit",91178133513L);

        System.out.println(c.getcID());
        System.out.println(c.getcName());
        System.out.println(c.getcNum());

    }

}

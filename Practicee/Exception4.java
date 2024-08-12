package Practicee;

class Studen{
    private int sID;
    private String sName;
    private Long sNum;
    public Studen(){
        sID = 1;
        sName = "rinku";
        sNum = 6371649387l;
    }
    public Studen(String sName){
        this();
        this.sName = sName;
    }
    public Studen(int sID, String sName,long sNum ){
        this(sName);
    }
    public int getsID(){
        return sID;
    }
    public String getsName(){
        return sName;
    }
    public long getsNum(){
        return sNum;
    }
}

public class Exception4 {
    public static void main(String[] args){
        Studen c = new Studen(1,"arul",7682995656L);
        System.out.println(c.getsID());
        System.out.println(c.getsName());
        System.out.println(c.getsNum());
    }



}


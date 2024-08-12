package Practicee;

class Student{
    private int sID;
    private String sName;
    private Long sNum;
    public Student(){
        sID = 1;
        sName = "rinku";
        sNum = 6371649387l;
    }

    public Student(int sID, String sName,long sNum ){
        this();
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

public class Exception3 {
    public static void main(String[] args){
        Student c = new Student(1,"arul",7682995656L);
        System.out.println(c.getsID());
        System.out.println(c.getsName());
        System.out.println(c.getsNum());
    }



}


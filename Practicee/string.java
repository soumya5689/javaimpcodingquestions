package Practicee;

public class string {

    public static void main(String[] args){
        String s1 = "JAVA";
        String s2 = new String("JAVA");

        if(s1 == s2){
            System.out.println("reference are eqal");
        }else{
            System.out.println("Refernece are unequal");
        }


        if(s1.equals(s2)){
            System.out.println("values are equal");
        }else{
            System.out.println("values are not equal");
        }

    }
}

package String;

public class NonRepString {

    static void nonRepString(String s){
        String res = "";
        String temp = "";
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if (temp.indexOf(s.charAt(i))==-1){
                    temp = temp + s.charAt(i);
                }
                else{
                    break;
                }
            }
            if (temp.length() > res.length()){
                res = temp;
            }
        }
        System.out.print(res);
    }

    public static void main(String[] args){
       String s = "tapacademy";
       nonRepString(s);

    }
}

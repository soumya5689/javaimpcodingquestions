package String;

public class nonRepatSubString {

static String NonRepSubstring(String s){
    String res = " ";
    for(int i=0;i<s.length();i++) {
        String temp = " ";
        for (int j = i; j < s.length(); j++) {
            if(temp.indexOf(s.charAt(j))== -1){
                temp = temp + s.charAt(j);
            } else {
                break;
            }
        }
        if (temp.length() > res.length()) {
            res = temp;
        }
    }
return res;
}

public static void main (String[]args){
    String s = "tapacademy";
    System.out.println(NonRepSubstring(s));
}
}

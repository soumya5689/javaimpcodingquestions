package Daily5;

public class CountNumberOfString {

    public static void main(String[] args) {
        String s = "Hello world plz come with loop";
        System.out.println(Count(s));
    }

    public static int Count(String s){
        int count =0;
        if(s.charAt(0)!=' '){
            count++;
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count++;
            }
        }
      return count;
    }

}

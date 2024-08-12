package Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExpression {

        public static void main(String[] args) {
            String s = "codexxcode";
            String word = "code";

            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(s);

            int count = 0;
            while (matcher.find()) {
                count++;
            }

            System.out.println(count);
        }
    }


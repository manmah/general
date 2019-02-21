package stringMethods;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringMethods {
    public static void main(String[] args) {
        String pie = "apple , Apple and more orange";

        StringJoiner joiner = new StringJoiner(";" , "{", "}");
        joiner.add(pie);
        System.out.println(joiner.toString());

        String cake = String.format("hallo %s add %d Or %d orange", "man",5,6);
        System.out.println(cake);

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(pie);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

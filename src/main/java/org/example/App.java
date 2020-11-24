package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String str = "http://127.0.0.1:8080?pagepk=1te-2545-sgga&token=123test&usename=testName";
        Pattern compile = Pattern.compile("pagepk=.*?&");
        Matcher matcher = compile.matcher(str);
        if(matcher.find()) {
            String group = matcher.group();
            System.out.println(group.substring(0, group.length()-1));
        }
    }
}

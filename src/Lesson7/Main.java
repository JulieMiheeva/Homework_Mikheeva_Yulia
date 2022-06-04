package Lesson7;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = new String("testtest");
        String s1 = "testtest";
        String s2 = s1;
        String s3 = new String(new char[]{'a', 'b'});
        String s4 = new String(new byte[]{97, 98});
        String s5 = new String(new byte[]{97, 98}, StandardCharsets.UTF_8);
        System.out.println(s3 + " " + s4 + " " + s5);

        String helloMessage = "hello";
        String worldMessage = "world";
        String result = helloMessage + worldMessage;
        System.out.println(result);


        StringBuilder stringBuilder = new StringBuilder("");
        // 14:37
        long firstTime = System.currentTimeMillis();

        String test = "";
        for(int i = 0; i < 1000000; i++) {
                stringBuilder.append("hello");
        }

        //14:42
        long secondTime = System.currentTimeMillis();

        //14:42 - 14:37
        System.out.println(secondTime-firstTime);
    }
}

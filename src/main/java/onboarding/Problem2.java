package onboarding;

import java.util.*;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = replaceMethod(cryptogram);
        System.out.println(cryptogram);
        return answer;
    }

    private static String replaceMethod(String cryptogram) {
        String result = cryptogram.replaceAll("(.)\1+", "");
        return result;
    }
}

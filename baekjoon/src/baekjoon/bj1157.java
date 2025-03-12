package baekjoon;
import java.util.*;

public class bj1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toUpperCase(); // 대소문자 구분 없이 처리

        int[] alpha = new int[26]; // 알파벳 빈도수 배열

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            alpha[ch - 'A']++; // 해당 알파벳 개수 증가
        }

        int max = -1;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                result = (char)(i + 'A');
            } else if (alpha[i] == max) {
                result = '?'; // 가장 많이 사용된 문자가 여러 개일 때
            }
        }

        System.out.println(result);
    }
}

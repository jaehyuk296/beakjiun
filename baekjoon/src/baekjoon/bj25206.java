package baekjoon;

import java.util.Scanner;

public class bj25206 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subject = new String[20];
        float[] score = new float[20];
        String[] classs = new String[20];

        for (int i = 0; i < 20; i++) {
            subject[i] = scanner.next();
            score[i] = scanner.nextFloat();
            classs[i] = scanner.next();
        }

        float totalScore = 0.0f;
        float totalCredit = 0.0f;

        for (int i = 0; i < 20; i++) {
            if (classs[i].equals("P")) continue;

            float grade = 0.0f;

            switch (classs[i]) {
                case "A+":
                    grade = 4.5f;
                    break;
                case "A0":
                    grade = 4.0f;
                    break;
                case "B+":
                    grade = 3.5f;
                    break;
                case "B0":
                    grade = 3.0f;
                    break;
                case "C+":
                    grade = 2.5f;
                    break;
                case "C0":
                    grade = 2.0f;
                    break;
                case "D+":
                    grade = 1.5f;
                    break;
                case "D0":
                    grade = 1.0f;
                    break;
                case "F":
                    grade = 0.0f;
                    break;
            }

            totalScore += score[i] * grade;
            totalCredit += score[i];
        }

        System.out.printf("%.6f", totalScore / totalCredit);
    }
}

package baekjoon;

import java.util.Scanner;

public class bj10811 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int box = scanner.nextInt();
		int line = scanner.nextInt();
		int [] boxes = new int [box];
		for(int i=0;i<box;i++) {
			boxes[i]=i+1;
		}
		
		for(int i=0;i<line;i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			for(int j = 0; j < (y - x + 1) / 2; j++) {
			    int tmp = boxes[x - 1 + j];
			    boxes[x - 1 + j] = boxes[y - 1 - j];
			    boxes[y - 1 - j] = tmp;
			}
		}

		for(int i=0;i<box;i++)
			System.out.print(boxes[i]+" ");
	}

}

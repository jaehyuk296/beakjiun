package baekjoon;

import java.util.Scanner;

public class bj10813 {

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
			
			int tmp = boxes[x-1];
			boxes[x-1]=boxes[y-1];
			boxes[y-1]=tmp;
		}

		for(int i=0;i<box;i++)
			System.out.print(boxes[i]+" ");
	}

}

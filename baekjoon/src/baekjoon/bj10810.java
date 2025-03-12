package baekjoon;

import java.util.Scanner;

public class bj10810 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int box = scanner.nextInt();
		int line = scanner.nextInt();
		
		int [] boxes = new int [box];
		int x,y,num;
		for(int i=0; i<line;i++) {
			x=scanner.nextInt();
			y=scanner.nextInt();
			num = scanner.nextInt();
			
			for(int j=x-1;j<=y-1;j++) {
				boxes[j]=num;
			}
		}
		for(int i=0;i<box;i++)
		System.out.print(boxes[i]+" ");
	}

}

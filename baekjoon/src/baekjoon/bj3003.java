package baekjoon;

import java.util.Scanner;

public class bj3003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] chess = {1,1,2,2,2,8};
		int [] dh = new int [6];
		
		for(int i=0;i<6;i++) {
			dh[i] = scanner.nextInt();
		}
		
		for(int i=0;i<6;i++) {
			chess[i]-=dh[i];
		}
		
		for(int i=0;i<6;i++)
			System.out.print(chess[i]+" ");
	}

}

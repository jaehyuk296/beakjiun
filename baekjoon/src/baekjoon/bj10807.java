package baekjoon;

import java.util.Scanner;

public class bj10807 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		int [] numArr = new int [size];
		
		for(int i=0;i<size;i++) {
			int num = scanner.nextInt();
			numArr[i] = num; 
		}
		
		int want = scanner.nextInt();
		int sum =0;
		int i=0;
		while(i<size) {
			if(numArr[i]== want)
				sum++;
			i++;
		}
		System.out.println(sum);
	}

}

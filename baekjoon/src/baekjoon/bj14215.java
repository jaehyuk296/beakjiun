package baekjoon;

import java.util.Scanner;

public class bj14215 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		
		int max= Math.max(a, Math.max(c, b));
		int sum = a+b+c-max;
		
		if(max<sum)
			System.out.println(sum+max);
		else
			System.out.println(sum*2-1);
	}

}

import java.util.Scanner;

public class PrintRecursion {
	static void printDec(int n) {
		if(n == 0) return;
		System.out.print(n + " ");
		printDec(n-1);
	}
	static void printInc(int n) {
		if(n == 0) return;
		printInc(n-1);
		System.out.print(n + " ");
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		printDec(n);
		System.out.println();
		printInc(n);
	}

}
	
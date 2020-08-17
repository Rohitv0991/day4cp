import java.util.Scanner;

public class IncDecRecursion {
	
	static void oddEven(int n) {
		if(n < 1) {
			System.out.print(n);
			return;
		}
		
		if(n % 2 == 1) System.out.print(n);
			
		oddEven(n-1);
		
		if(n % 2 == 0) System.out.print(n);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		oddEven(n);
	}
}

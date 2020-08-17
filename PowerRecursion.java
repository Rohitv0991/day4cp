import java.util.Scanner;

public class PowerRecursion {
	
	static int power(int n, int p) {
		//if(p == 1) return n;
		if(p == 0) return 1;
		
		return n*power(n,p-1);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int no = scan.nextInt();
		int po = scan.nextInt();
		scan.close();
		System.out.println(power(no,po));
		
	}
}

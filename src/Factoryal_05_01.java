import java.util.Scanner;

public class Factoryal_05_01 {

	public static void main2(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� �Է�:");
		int num = stdIn.nextInt();
		
		int result = 1;
		for(int i=num; i > 0; i--) {
			// 2 > 0, 1 
			// 2 * 1
			result = result * i;
		}
		
		System.out.println(result);
		
		
	}
	
	static int factorial(int n) {
		int fact = 1;
	
		while (n > 1) {
			fact *= n--;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		System.out.println("���Է� : ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "�� ���丮�� : " + factorial(x));
		
		
	}
	
	
	
	
}

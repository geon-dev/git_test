
public class EuclidGCD_05_02 {

	static int euclid(int x, int y) {
		if(y == 0) {
			return x;
		}else {
			return euclid(y, x % y);
		}
		
	}
	
	public static void main(String[] args) {
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		System.out.println("�� ���� �Է�");
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		System.out.println("�ִ������� : " + euclid(x, y));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

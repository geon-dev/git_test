
public class Gstack<E> {

	private int max; // ������ �뷮
	private int ptr; // ���� ������
	private E [] stk; // ���� ��ü
	
	// ������
	public Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max];
		} catch (Exception e) {
			
		}
		
	}
	
	// ���ÿ� x�� Ǫ��
	// ���ÿ��� �����͸� �� (������� �����͸� ����)

	
}

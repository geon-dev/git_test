
public class Gstack<E> {

	private int max; // 스택의 용량
	private int ptr; // 스택 포인터
	private E [] stk; // 스택 본체
	
	// 생성자
	public Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max];
		} catch (Exception e) {
			
		}
		
	}
	
	// 스택에 x를 푸시
	// 스택에서 데이터를 팝 (꼭대기의 데이터를 꺼냄)

	
}

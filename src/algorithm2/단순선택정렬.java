package algorithm2;

import java.util.Arrays;

public class 단순선택정렬 {

	static int getMin(int[] a, int nx) {
		int min = nx;
		int temp = a[nx];
		
		for(int i=nx; i < a.length; i++) {
			if(temp > a[i]) {
				temp = a[i];
				min = i;
			}
		}
		
		return min;
	}
	
	static void sort(int[] a) {
		
		int nx = 0;
		
		for(int i=0; i < a.length-1; i++) {
			System.out.println("패스 =" + i);
			nx = i;
			// 배열에서 가장 작은값 구하기
			// 배열시작값
			int min = getMin(a, nx);

			// 정렬되지 않은 배열의 첫값과 비교 후 교환
			if(a[i] > a[min]) {
				System.out.println("swap " + i + "<>" + min);
				swap(a, i, min);
			}
		}
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	public static void main(String[] args) {
		int a[] = {3,6,1,7,4,5};
		
		sort(a);
	
		System.out.println(Arrays.toString(a));
	}
}

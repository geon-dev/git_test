package algorithm2;

import java.util.Arrays;

public class 셸정렬 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void basicSort(int[] a) {
		for(int i=0; i < a.length; i++) {
			
			for(int j=i; j < a.length-1; j++) {
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
				}
			}
		}
	}
	
	static void sort(int[] a) {
		
		int n = 7;

		for (int h = n / 2; h > 0; h /= 2) {
			System.out.println("h = " + h);
			
			for (int i = h; i < n; i++) {
				System.out.println("i = " + i);
				
				int j;
				int tmp = a[i];
				
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
					a[j + h] = a[j];
				a[j + h] = tmp;
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
		int[] a = {22,5,11,32,120,68,70};
		
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	
	
}

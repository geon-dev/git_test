package algorithm2;

import java.util.Arrays;

public class BubbleSort {

	static void swap(int[] a, int idx1, int idx2) {
		//교환
		
		int tmp = 0;
		tmp = a[idx1];
		a[idx1] =a[idx2];
		a[idx2] = tmp;
	}
	
	static void bubbleSort(int[] a, int n) {
		// 패스
		
		// 맨오른쪽에서
		/*
		for(int i=0; i < n-1; i++) {
			for(int j=n-1; j>i; j--) {
				
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
				}
				
			}
		}
		*/
		
		// 왼쪽부터
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(a[j] > a[j+1]) {
					swap(a, j+1, j);
				}
				
			}
		}

		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) // 머리→꼬리로로 스캔
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
		}

	}

	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("요소수 :");
		int nx = sc.nextInt();
		int a[] = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.println(i + "값 :");
			a[i] = sc.nextInt();
		}
		
//		System.out.println(Arrays.toString(a));
//		swap(a, 0, 2);
		
		
		bubbleSort(a, nx);
		
		System.out.println("오름차순");
		System.out.println(Arrays.toString(a));
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

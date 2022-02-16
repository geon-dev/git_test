package algorithm2;

import java.util.Arrays;

public class CocktailSort {

	
	static void cockSort(int[] a) {
		
		// 기본
		for(int i=0; i < a.length - 1; i++) {
			// 3 2 1
			// 2 1 3 / 1
			// 1 2 3 / 2
			
			// 앞
			// a[1] a[0]
			// a[2] a[1]
			
			// 0 1 
			System.out.println("패스 " + i);
			

			int change = 0;
			for(int j=0; j < a.length -1 - i; j ++) {
				// i=0 > j=0,1,2 ... a.length
				if(a[j] > a[j+1]) {
					System.out.println("스왑 " + a[j] + "<>" + a[j+1]);
					swap(a, j, j+1);
					change++;
				}
				
			}

			if(change == 0) {
				System.out.println("break");
					break;
			}
			
			/*
			if((i+1)%2 == 0) {
				// 앞>>
				for(int j=0; j < a.length -1 - i; j ++) {
					// i=0 > j=0,1,2 ... a.length
					if(a[j] > a[j+1]) {
						System.out.println("스왑 " + a[j] + "<>" + a[j+1]);
						swap(a, j, j+1);
					}
				}
			}else {
				// 뒤>>
				for(int j=a.length-1; j > i; j--) {
					System.out.println("j=" + j);
					if(a[j] < a[j-1]) {
						swap(a, j, j-1);
					}
				}
			}
			*/
		}
		
		
		
	}
	
	static void swap(int[] a, int b, int c) {
		int temp = 0;
		temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}
	
	public static void main(String[] args) {
		
		// 9 1 3 4 6 7 8
		// 양방향 정렬
		// 홀수 = 작은걸 맨앞
		// 짝수 = 큰걸 맨뒤
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
//		int a[] = {9,1,3,4,6,7,8};
		int a[] = {1,3,4,5,6,8,7};
		
		cockSort(a);
		
		System.out.println(Arrays.toString(a));
		
		
	}
}

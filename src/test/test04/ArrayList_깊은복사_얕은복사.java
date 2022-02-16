package test.test04;

import java.util.ArrayList;

public class ArrayList_깊은복사_얕은복사 {
	// https://library1008.tistory.com/47
	
	static ArrayList<String> source = new ArrayList<String>();
	static ArrayList<String> destination = new ArrayList<String>();

	public static void initArrayList() {
		if (null != source) {
			source.clear();
			source.add("apple");
			source.add("banana");
			source.add("cherry");
		}
		if (null != destination) {
			destination.clear();
		}
	}

	public static void printArrayList() {
		System.out.println("====== source result ======");
		for (int i = 0; i < source.size(); i++) {
		System.out.println("source ["+i+"] : " +source.get(i));
		}
		System.out.println("====== destination result ======");
		for (int i = 0; i < destination.size(); i++) {
		System.out.println("destination ["+i+"] : " +destination.get(i));
		}
	}
	
	public static void main(String[] args) {
		initArrayList();
		// TODO : operation
		printArrayList();
	}

}

package chap09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {
	
	public static void main(String[] args) throws Exception{
		
		/*
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(1);
		list.add(8);
		list.add(4);
		list.add(10);
		
		Collections.sort(list);
		Collections.reverse(list);
		
		System.out.println(list);
		*/
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("a", 5));
		list.add(new Student("b", 10));
		list.add(new Student("c", 1));
		list.add(new Student("d", 22));
		
		Collections.sort(list, new Comparator<Student>() {

			/*
			 * 작으면 음수
			 * 같으면 0
			 * 크면 양수
			 */
			
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getSource() < o2.getSource()) {
					return -1;
				}else if(o1.getSource() > o2.getSource()) {
					return 1;
				}
				return 0;
			}
			
		});
		
		for(Student s : list) {
			System.out.println(s.getSource());
		}
		
	}
}


class Student {
	String name;
	int source;
	
	public Student(String name, int source) {
		this.name = name;
		this.source = source;
	}
	
	public String getName() {
		return name;
	}
	public int getSource() {
		return source;
	}
}

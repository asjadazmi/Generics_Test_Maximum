package com.generics;

public class TestCaseAll<E> {
	E e1;
	E e2;
	E e3;
	
	public <T extends Comparable<T>> void findmax(T t1,T t2,T t3) {
		if(t1.compareTo(t2)>0&&t1.compareTo(t3)>0) {
			System.out.println("T1 is maximum"+t1);
		}else if(t2.compareTo(t1)>0&& t2.compareTo(t3)>0) {
			System.out.println("T2 max="+t2);
		}
		else {
			System.out.println("T3 is max="+t3);
		}
	}
	public static void main(String[] args) {
		TestCaseAll genricobj=new TestCaseAll();
		genricobj.findmax(10, 120, 30);
		genricobj.findmax("syed", "asjad", "owais");
		genricobj.findmax(20.4, 40.5, 10.8);
	}
	

}

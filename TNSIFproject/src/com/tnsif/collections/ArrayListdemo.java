package com.tnsif.collections;
import java.util.*;

public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al = new ArrayList<>();
		al.add(101);
		al.add("Hello");
		al.add(23.4);
		System.out.println(al);

		al.remove(1);
		System.out.println(al);

		al.add(null);
		al.add(null);
		System.out.println(al);

		System.out.println(al.get(1));

	}

}

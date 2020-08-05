package com.corejava.collection;

import java.util.Hashtable;
import java.util.Vector;

public class Collection1 {

	public static void main(String[] args) {
		
		//creating instances of vector,array,HashTable
		int arr[]=new int[] {1,2,3,4};
		Vector<Integer> v=new Vector<Integer>();
		Hashtable< Integer,String> h=new Hashtable<Integer, String>();
		v.addElement(1);
		v.addElement(2);
		h.put(1, "geeks");
		h.put(2,"4geeks");
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
	}
}

/*
 * 1 1 geeks
 */
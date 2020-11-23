package com.ngocnh.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		int[] a = new int[10];

		a[0] = 1;
		a[1] = 9;
		a[2] = 6;
		a[3] = 7;
		a[4] = 8;
		a[5] = 7;
		a[6] = 8;
		a[7] = 9;
		a[8] = 0;
		a[9] = 5;
		
//		bai1(a);
		bai2(a);
		
	}
	
	
	public static void bai1(int[] a) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			map.put(a[i], count);
		}
		
		for (Map.Entry<Integer, Integer> item : map.entrySet()) {
			System.out.println("số " + item.getKey() + " xuất hiện " + item.getValue() + " lần");
		}
	}
	
	public static void bai2(int[] a) {
		int count = 0;
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (!lst.contains(a[i])) {
				lst.add(a[i]);
				System.out.println("số " + a[i] + " xuất hiện " + count + " lần");
			}
		}
	}
	
}

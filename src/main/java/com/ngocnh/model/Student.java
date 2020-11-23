package com.ngocnh.model;

public class Student {
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
		name(a);
	}

	public static void name(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(a[i]);
			}
		}
	}
}

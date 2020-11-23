package com.ngocnh;

import java.util.ArrayList;
import java.util.List;

public class test5 {
	public static void main(String[] args) {
		int[] a = new int[7];
		a[0] = 1;
		a[1] = 7;
		a[2] = 20;
		a[3] = 5;
		a[4] = 8;
		a[5] = 6;
		a[6] = 11;
	
		bai1a(a);
	}

	public static boolean bai1(int n) {
		int dem = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				dem++;
			}
		}
		if (dem == 1) {
			return true ;
		}
		return false;

	}
	public static void bai1a(int []a) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			if(bai1(a[i])) {
				list.add(a[i]);
			}
		}
		
		if(list.isEmpty()) {
			System.out.println("khong co so nguyen to");
		}else {
			int max = list.get(0);
			for(int i =0;i<a.length;i++) {
				if(bai1(a[i]) && a[i] > max) {
					max =a[i];
				}
			}
			System.out.println(max);
		}
	}
}

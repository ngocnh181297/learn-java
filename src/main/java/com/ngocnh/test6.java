package com.ngocnh;

import java.util.ArrayList;
import java.util.List;

public class test6 {
public static void main(String[] args) {
	int[] a = new int [6];
	a[0] = 1 ;
	a[1] = 2 ;
	a[2] = 3 ;
	a[3] = 9 ;
	a[4] = 10 ;
	a[5] = 4 ;
	SoCP(a);
}
public static boolean bai1( int n) {
	for (int i = 1; i <= n; i++) {
		if (n == i * i) {
			return true ;
		}
	}
	return false;	
}
public static void SoCP(int a[]) {
	List<Integer> list = new ArrayList<Integer>();
	for(int i = 0; i < a.length ; i++  ) {
		if(bai1(a[i])) {
			list.add(a[i]);
		}
	}if(list.isEmpty()) {
		System.out.println("hafm khoong co so chinh phuong");
	}else {
		int max = list.get(0);
		for( int i = 0; i < a.length; i++ ) {
			if (bai1(a[i]) && a[i] >  max ) {
				max = a[i];
			}
		}System.out.println(max);
	}
} 
}

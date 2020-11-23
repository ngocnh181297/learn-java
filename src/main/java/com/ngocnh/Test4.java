package com.ngocnh;

public class Test4 {
	public static void main(String[] args) {
		System.out.println(bai1(9));
		// bai2(8);
	
		//System.out.println(bai3(6));
        //boolean rs = bai3(9);
       // if(rs) {
       // 	System.out.println("la so chinh phuong");
       // }else {
       // 	System.out.println("khong la so chinh phuong");
      //  }
	}
     // kiểm tra n có phải là số nguyên tố hay không ??
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
      // in ra màn hingh n có phải là số nguyên tố hay không ??
	public static void bai2(int n) {
		int dem = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				dem++;
			}
		}
		if (dem == 1) {
			System.out.println(+n + "la so nguyen to");
		} else {
			System.out.println(+n + "khong la so nguyen to");
		}
	}
     // kiểm tra n có phải số chính phương hay không ?
	public static boolean bai3(int n) {

		for (int i = 1; i <= n; i++) {
			if (n == i * i) {
				return true ;
			}
		}
		return false;
	}
}
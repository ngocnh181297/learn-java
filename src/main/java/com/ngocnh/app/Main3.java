package com.ngocnh.app;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		arr[0] = 2;
		arr[1] = 5;
		arr[2] = 333;
		
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(2); // 0
		lst.add(5); // 1
		lst.add(7); // 2
		lst.add(8);
		lst.add(9);
		
		// xóa 1 phần tử trong mảng
//		lst.remove(1);
		
		// thêm 1 phần tử vào mảng theo vị trí index
//		lst.add(1, 99);
		
		// kiểm tra sự tồn tại của phần tử
//		System.out.println(lst.contains(5));
		
		// set lại giá trị ở vị trí index
//		lst.set(1, 99);
		
		// cắt mảng từ phần tử thứ 0 lấy 3 phần tử
//		lst = lst.subList(0, 3);
		
		// duyệt theo forEach
		for (Integer i : lst) {
			System.out.println(i);
		}
		
		// duyệt theo index
//		for (int i = 0; i < lst.size(); i++) {
//			System.out.println(lst.get(i));
//		}
		
		// SỬ DỤNG 3 COLLECTION CHÍNH : LIST (ArrayList) - MAP (HashMap) - SET (HashSet)
		
	}

}

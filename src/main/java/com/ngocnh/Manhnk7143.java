package com.ngocnh;

public class Manhnk7143 {

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
		
		// gọi trên main như này
		sumArr(a);
		// nhưng gọi như này thì không có ý nghĩa gì
		// vì hàm này có giá trị trả về nên phải hứng
		int ketqua = sumArr(a);
		// biến kết quả đang lưu giá trị tính tổng của tất cả các số trong mảng a
		// in kết quả ra check xem giá trị trả về có đúng ý mình hay chưa
		System.out.println(ketqua);
	}

	// hàm cộng tất cả các số trong mảng
	// đầu vào : 1 mảng số nguyên
	// đầu ra là 1 số nguyên
	public static int sumArr(int a[]) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
}

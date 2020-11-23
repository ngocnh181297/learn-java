package com.ngocnh.app;

public class Main2 {

	public static void main(String[] args) {
		String input = "manhnkngocnhhieunt";
		String rs = input.toUpperCase();
		System.out.println("rs = " + rs);

		String rs1 = input.toLowerCase();
		System.out.println("rs1 =" + rs1);

		int rs2 = input.indexOf("n");
		System.out.println("rs2 = " + rs2);

		boolean rs3 = input.isEmpty();
		System.out.println("rs3 = " + rs3);

		boolean rs4 = input.isBlank();
		System.out.println("rs4 = " + rs4);

		String rs5 = input.concat("123456789");
		System.out.println("rs5 = " + rs5);

		char rs6 = input.charAt(6);
		System.out.println("rs6 = " + rs6);

		boolean rs7 = input.equals("manhnkngocnhhieunt");
		System.out.println("rs7 = " + rs7);

		boolean rs8 = input.equalsIgnoreCase("ManhnkNgocnhHieunt");
		System.out.println("rs8 = " + rs8);

		byte[] rs9 = input.getBytes();
		System.out.println("rs9 = " + rs9);

		boolean rs10 = input.startsWith("ngoc");
		System.out.println("rs10 = " + rs10);

		boolean rs11 = input.endsWith("hieunt");
		System.out.println("rs11 = " + rs11);

		int rs12 = input.lastIndexOf("n");
		System.out.println("rs12 = " + rs12);

		String rs13 = input.replace("ngocnh", "nguyenhangoc");
		System.out.println("rs13 = " + rs13);

		String rs14 = input.replaceAll("ngoc", "NGOC");
		System.out.println("rs14 = " + rs14);

		boolean rs15 = input.contains("abc");
		System.out.println("rs15 = " + rs15);

		int rs16 = input.length();
		System.out.println("rs16 = " + rs16);

		String rs17 = input.substring(1, 10);
		System.out.println("rs17 = " + rs17);
		
		System.out.println("=====================================================");
		for (int i = 0; i < rs9.length; i++) {
			System.out.println(rs9[i]);
		}
		
		

	}

}

package com.kh.practice.func;

import java.util.Scanner;

public class CastingPractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		String str = sc.next();
		char ch = str.charAt(0);
		int a = ch;
		
		System.out.printf("%s unicode : %d", ch, a);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		float kor = sc.nextFloat();
		System.out.print("영어 점수 입력 : ");
		float eng = sc.nextFloat();
		System.out.print("수학 점수 입력 : ");
		float mat = sc.nextFloat();
		
		System.out.printf("총점 : %d\n평균 : %d ", (int)(kor + eng + mat), (int)(kor + eng + mat)/3);
		
	}
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println((int)dNum);
		System.out.println((float)iNum1);
		System.out.println(dNum);
		System.out.println((int)fNum);
		System.out.println(fNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

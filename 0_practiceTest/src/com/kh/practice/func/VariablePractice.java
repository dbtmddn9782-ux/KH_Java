package com.kh.practice.func;

import java.util.Scanner;

public class VariablePractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("성별을입력하세요(남/여) : ");
		String gender = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		double hi = sc.nextDouble();
		
		System.out.printf("키 %.1f인 %d살 %s자 %s님 반갑습니다.", hi, age, gender, name );
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : "+ (num1 + num2));
		System.out.println("빼기 결과 : "+ (num1 - num2));
		System.out.println("곱하기 결과 : "+ (num1 * num2));
		System.out.println("나누기 몫 결과 : "+ (num1 / num2));
	}
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		float ho = sc.nextFloat();
		System.out.print("세로 : ");
		float hi = sc.nextFloat();
		
		System.out.println("면적 : "+ ho*hi);
		System.out.println("둘레 : "+ (ho+hi)*2);
	}
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char fir = str.charAt(0);
		char sec = str.charAt(1);
		char thi = str.charAt(2);
		
		System.out.println("첫 번째 문자 : " + fir);
		System.out.println("두 번째 문자 : " + sec);
		System.out.println("세 번째 문자 : " + thi);
		
	}
}
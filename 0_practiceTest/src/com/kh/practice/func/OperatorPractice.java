package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("양수이다");
		} else {
			System.out.println("양수가 아니다");
		}
		
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0이다");
		} else if (num >0) {
			System.out.println("양수이다");
		} else 
			System.out.println("음수이다");
	}
	
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num %2 ==0) {
			System.out.println("짝수이다");
		} else {
			System.out.println("홀수이다");
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int count = sc.nextInt();
		System.out.print("사탕 수 : ");
		int num = sc.nextInt();
		
		if(count>num) {
			System.out.println("사람 수가 사탕수 보다 많습니다");
		}else {
			System.out.println("1인당 사탕 개수 :"+ num/count);
			System.out.println("남은 사탕 개수 :"+ num%count);
		}
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int ha = sc.nextInt();
		System.out.print("반 : ");
		int clas = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		sc.next();
		System.out.print("성별(M/F) : ");
		String gender = sc.nextLine();
		System.out.print("성적(소수둘째까지) : ");
		float grade = sc.nextFloat();
		
		if(gender =="M" || gender == "m") {
			System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %.2f이다", ha, clas, num, name, grade);
		}else {
			System.out.printf("%d학년 %d반 %d번 %s 여학생의 성적은 %.2f이다", ha, clas, num, name, grade);
		}
		
		
		
	}
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
		} else if(age<=19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
	}
	
	public void method7() {
		
	}
	
	

}

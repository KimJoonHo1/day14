package day14;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age;
		System.out.println("나이 입력");
		try {
			age = scanner.nextInt();
			if(age < 0) {
				throw new Exception("그런 나이는 없음");
			}
			System.out.println("당신의 나이는 : " + age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

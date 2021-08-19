package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String ageStr = "";
		System.out.println("인증 프로그램 입니다.");
		System.out.print("나이 입력 : ");
		try {
			ageStr = scanner.next();
			char[] ageStrArr = ageStr.toCharArray();
			if(ageStrArr.length != 6) {
				System.out.println("길이가 틀렸습니다.");
				return;
			}
			String checkAge = String.valueOf(ageStrArr[0]);
			checkAge += String.valueOf(ageStrArr[1]);;
			int age = Integer.parseInt(checkAge);
			
			if(21 < age && age < 90) {
				System.out.println("가입 가능");
			} else {
				System.out.println("가입 불가");
			}
			
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력하세요!!!");
		}
		
		
	}

}

package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x, y, result;
		System.out.println("수 입력");
		try {
			x = scanner.nextInt();
			y = scanner.nextInt();
			result = x/y;
			System.out.println("x / y = " + result);
		} catch(Exception e) {
			e.printStackTrace();
			return;
		} finally {
			System.out.println("마지막에 수행할 내용");
		}
		System.out.println("다음 문장들 실행~");
	}

}

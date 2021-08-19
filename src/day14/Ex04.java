package day14;

import java.io.IOException;

class A {
	public void test()throws IOException {
		ProcessBuilder b = new ProcessBuilder("calcss");
		
		b.start();
	}
	public void display() throws IOException {
		test();
	}
}

public class Ex04 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		A a = new A();
		a.display();
		System.out.println("다음 문장들 실행");
	}

}

package day14;

class BBB {

}
class AAA extends BBB {
	public void catch1(int a) {
		System.out.println("정수 : " + a);
	}
	public void catch1(String a) {
		System.out.println("문자열 : " + a);
	}
	public void catch1(Object a) {
		System.out.println("오브젝트 : " + a);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a = new AAA();
		Object ss = "test";
		AAA aa = new AAA();
		aa.catch1(11);
		aa.catch1("aaaa");
		aa.catch1(1.1111);
	}

}

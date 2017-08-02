package sample;

import java.awt.Frame;

public class MyFrame1 {
	private Frame frame;
	
	public MyFrame1() {
		frame = new Frame("포함 연습창");

		//display();
	}
	
	public void display(){
		frame.setSize(500, 300);
		frame.setLocation(200, 150);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame1 frame1= new MyFrame1(); // 응용 프로그램 실행을 위한 메소드
		frame1.display();  //<-없이 위에  display();로만 호출가능
	}

}

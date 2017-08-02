package sample;

import java.awt.Frame;

public class MyFrame2 extends Frame{
	public MyFrame2() {
		super("상속 연습창");
		//setTitle("상속 연습창");
		display();
	}
	
	public void display(){
		setSize(500, 300);
		setLocation(200, 150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		//MyFrame2 frame2 = new MyFrame2();
		//frame2.display();
		new MyFrame2();
	}

}

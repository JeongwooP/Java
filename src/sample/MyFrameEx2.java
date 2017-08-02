package sample;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;

public class MyFrameEx2 extends MouseAdapter{
	MyFrameEx a = new MyFrameEx();
	
	public MyFrameEx2(){
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		String [] name = {"홍길동", "한국인", "김치국", "김밥", "공기밥"}; 
		int show = (int)(Math.random()*5);
	}
	
}

package sample;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class MyFrameEx extends MouseAdapter{
	private Frame frame;
	
	public MyFrameEx(){
		frame = new Frame();
		frame.setSize(400, 300);
		frame.setLocation(200, 150);
		frame.setVisible(true);
		frame.addMouseListener(this);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		String [] name = {"홍길동", "한국인", "김치국", "김밥", "공기밥"}; 
		int show = (int)(Math.random()*5);
		frame.setTitle(name[show]);
		
	}
	
	
	public static void main(String[] args) {
		new MyFrameEx();
	}

}

package sample;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame6 extends Frame{
	public MyFrame6() {
		setTitle("내부 무명 클래스 사용");
		setSize(300, 200);
		setLocation(200, 150);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setBackground(Color.BLUE);
			}
		});
	}
	
	public static void main(String[] args) {
		new MyFrame6();
	}

}

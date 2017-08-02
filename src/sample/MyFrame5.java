package sample;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame5 extends Frame {
	private Wevent we;
	String[] ss = { "봄", "여름", "가을", "겨울" };
	int x, y;

	public MyFrame5() {
		setTitle("내부 클래스 사용");
		setSize(300, 200);
		setLocation(200, 150);
		setVisible(true);

		we = new Wevent();

		addWindowListener(we);
		addMouseListener(new Mevent());
	}

	class Wevent extends WindowAdapter { // 내부 클래스
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	class Mevent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// int x = e.getX();
			// int y= e.getY();
			x = e.getX();
			y = e.getY();

			setTitle("x=" + x + ",y=" + y);

			repaint(); // paint()를 호출
		}
	}

	@Override
	public void paint(Graphics g) {
		// g.drawString("good", 50, 50);
		// g.drawString("good", x, y);
		g.setColor(new Color((int)(Math.random() * 255),(int)(Math.random() * 255) , (int)(Math.random() * 255)));
		g.setFont(new Font("궁서", Font.BOLD, 50));
		
		int n = (int) (Math.random() * 4);
		g.drawString(ss[n], x, y);
	}

	public static void main(String[] args) {
		new MyFrame5();
	}

}

package sample;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//인터페이스 연습용
public class MyFrame3 extends Frame implements WindowListener, MouseListener{
	public MyFrame3(){
		setTitle("이벤트 있는 창");
		setBounds(200, 150, 500, 400);	//좌표, 너비, 높이를 한꺼번에
		setVisible(true);
	
		//종료 작업
		addWindowListener(this); //윈도우에 윈도우리스너 장착
		addMouseListener(this);	//윈오두에 마우스리스너 장착
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
	
	}
	
	int a = 0;
	@Override
	public void windowClosing(WindowEvent e) {
			//a += 1;
			//System.out.println(a + "번 종료 누르기");
			
			System.exit(0);
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("아이콘 처리");
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("창 크기 회복");
		
	}
	
	//Mouse 이벤트 처리
	@Override
	public void mouseClicked(MouseEvent e) {
		//setBackground(new Color(0, 0, 255));
		int r = (int)(Math.random() * 255);
		int g = (int)(Math.random() * 255);
		int b = (int)(Math.random() * 255);
		setBackground(new Color(r, g, b));
		String aa = "r: " + r + " ,g :" + g + " ,b: " + b;
		setTitle(aa);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new MyFrame3();

	}

}

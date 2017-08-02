package aa.bb.ff;
/*
 * 추상 메소드로 구성된 특별한 클래스
 * 멤버필드는 public static final이 된다.
 * 다중상속이 가능하다.	
 * implements 라는 키워드 사용
 * 인터페이스가 상속도 가능
 */

public interface Volume {	//public abstract class Volume 이랑 비슷하다.
	void volumeUp(int level);	//public abstract 메소드
	void volumeDown(int level);
	
	//public void aa(){} 일반메소드는 기술 불가
}


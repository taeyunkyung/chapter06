package echo.ex03;

public class DigitThread extends Thread {

	// 필드
	
	// 생성자
	
	// 메소드 g/s
	
	// 메소드 일반
	@Override
	public void run() {
		for (int cnt = 0; cnt <= 10; cnt++) {
			System.out.println(cnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

package echo.ex04;

public class UpperThread extends Thread {

	@Override
	public void run() {
		for (char up = 'A'; up <= 'Z'; up++) {
			System.out.println(up);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

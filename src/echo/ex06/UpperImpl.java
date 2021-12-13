package echo.ex06;

public class UpperImpl implements Runnable {

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

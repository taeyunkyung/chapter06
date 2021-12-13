package echo.ex06;

public class LowerImpl implements Runnable {

	@Override
	public void run() {
		for (char low = 'a'; low <= 'z'; low++) {
			System.out.println(low);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

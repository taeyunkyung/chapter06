package echo.ex05;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {

		// Runnable digit = new DigitRunnableImpl();
		// Thread thread = new Thread(digit);
		
		Thread thread = new Thread(new DigitRunnableImpl());
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
	}

}

import java.lang.Thread;

public class FizzBuzz implements Runnable{
	private int n;
	private int fizz;
	private int buzz;

	public FizzBuzz(String n) {
		this.n = Integer.parseInt(n);
		this.fizz = 3;
		this.buzz = 5;
		new Thread(this).start();
	}

	public FizzBuzz(String n, String fizz, String buzz) {
		this.n = Integer.parseInt(n);
		this.fizz = Integer.parseInt(fizz);
		this.buzz = Integer.parseInt(buzz);
		new Thread(this).start();
	}

	public void run() {
		String out;
		for (int i = 1; i <= n; i++) {
			out = "";
			if (i % fizz == 0) {
				out += "Fizz";
			}
			if (i % buzz == 0) {
				out += "Buzz";
			}
			if (out.equals("")) {
				out += i;
			} 
			System.out.println(out);
		}
	}
}
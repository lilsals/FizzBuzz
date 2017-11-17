public class Driver {
	public static void main(String[] args) {
		if(args.length == 1) {
			new FizzBuzz(args[0]);
		} 
		else if (args.length == 3) {
			new FizzBuzz(args[0], args[1], args[2]);
		} else {
			System.out.println("Usage: Driver [n]");
			System.out.println("\tOr Driver [n] [fizz] [buzz]");
			System.out.println("\twhere n, fizz, and buzz are integers.");
		} 

	}
}
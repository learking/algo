object Fib {

  private static long calc_fib(int n) {
    if (n <= 1) n
    calc_fib(n - 1) + calc_fib(n - 2);
  }

  	def main(args: Array[String]) {
   		val scanner = new java.util.Scanner(System.in)
		val n = scanner.nextInt()

		System.out.println(calc_fib(n));
	}
}
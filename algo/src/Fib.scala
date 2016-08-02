/**
  * Created by suningadmin on 8/2/16.
  */
object Fib {
/*
  private def calc_fib(n: Int): Int = {
    if (n <= 1) n
    else {calc_fib(n - 1) + calc_fib(n - 2)}
  }
  */

  private def calc_fib(n: Int): Int = {
    if (n <= 1) n
    else {
      val f_list = new Array[Int](n+1)
      f_list.update(0,0)
      f_list.update(1,1)
      for (i <- 2 to n){
        f_list.update(i, f_list.apply(i-2) + f_list(i-1))
      }
      f_list(n)
    }
  }

  def main(args: Array[String]) {
    val scanner = new java.util.Scanner(System.in)
    val n = scanner.nextInt()

    println(calc_fib(n))
  }
}
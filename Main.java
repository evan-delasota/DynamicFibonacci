class Main {
  public static void main(String[] args) {
    final long startTime = System.currentTimeMillis();
    System.out.println(dynamicFib(25));
    final long endTime = System.currentTimeMillis();
    
    System.out.println("Total execution time: " + (endTime - startTime));
  }

  public static int dynamicFib(int num) {
    int[] fib = new int[num + 1];

    fib[0] = 0;
    fib[1] = 1;

    for (int i = 2; i <= num; ++i) {
      fib[i] = fib[i - 1] + fib[i - 2];
    }

    return fib[num];
  }

}
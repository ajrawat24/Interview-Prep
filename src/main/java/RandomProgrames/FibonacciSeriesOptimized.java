package RandomProgrames;

public class FibonacciSeriesOptimized {
    public static void main(String[] args) {
        int n=10;
      System.out.println(fibonacci(n));
      for(int i=1;i<=n;i++)
      {
          System.out.println(fibonacci(i));
      }

    }

    public static int fibonacci(int n) {
        int[] farr = new int[n + 1];

        farr[0] = 0;
        farr[1] = 1;
        if (n <= 1) {
            return n;
        }
        for (int i = 2; i <= n; i++)
        {
            farr[i] = farr[i - 1] + farr[i - 2];
        }
        return farr[n];

    }
}

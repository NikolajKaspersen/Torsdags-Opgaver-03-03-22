void setup()
{
  Fibonacci(1,1);
}
 void Fibonacci( int a, int b)
  {
    int sum = a+b;
    a = b;
    System.out.print(sum + " ");
      if (sum < 10000)
      {
        Fibonacci(a, sum);
      }
    }
  

  

package week3.day1;

public class Calculator {
	
	public void add(int x, int y)
	{
		
     int sum=x+y;
     System.out.println("The sum of two num is " +sum);
	}

	public void add(int x, int y, int z)
	{
		
     int sum=x+y+z;
     System.out.println("The sum of two num is " +sum);
	}
	
	public void sub(int x, int y)
	{
		
     int sub=x-y;
     System.out.println("The subtraction of two num is " +sub);
     
	}
	public void sub(int x, double y, double z)
	{
		
     double  sub=x-y-z;
     System.out.println("The subtraction of two num is " +sub);
     
     }
	public void mul(int x, int y)
	{
		
     int  mul=x*y;
     System.out.println("The multiplication of two num is " +mul);
     
     }
	public void mul(int x, double y, double z)
	{
		
     double  mul=x*y*z;
     System.out.println("The multiplication of num is " +mul);
     
     }
	public void div(int x, int y)
	{
		
    int div=x/y;
    System.out.println("The sum of two num is " +div);

	}
	public void div(int x, double y)
	{
		
    double div=x/y;
    System.out.println("The division of two num is " +div);

	}
	
	

}

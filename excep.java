class excep
{
	public void m()
	{
		throw new ArithmeticException("sorry");

	}
	public void n()throws Exception
	{
       int a[]=new int[3];
       a[5]=56;
	}
	public static void main(String[]args)
	{
		excep obj=new excep();
		try
		{
          obj.m();

		}catch(ArithmeticException e)
		{
			System.out.println("throw statement executed"+e);
		}
		try
		{
			obj.n();

		}catch(Exception ex)
		{
			System.out.println("throws statement executed");
		}
		finally
		{
			System.out.println("finally block is always executed");
		}

	}

}
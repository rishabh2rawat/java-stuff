class fn
{
	public void show()
	{
		System.out.println("show without parenteses");

	}
	public void show(int n)
	{
		System.out.println("show with one parenthesis"+n);

	}
	public void show(int n,int m)
	{
		System.out.println("show with two parenthesis"+n+" "+m);
	}
	public static void main(String[] args)
	{
		fn obj=new fn();
		obj.show();
		obj.show(4);
		obj.show(4,5);
	}
}
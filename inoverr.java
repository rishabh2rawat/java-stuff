class abc
{
	public void show()
	{
		System.out.println("this is show in abc");
	}
	public void show(int a)
	{
		System.out.println("this is show() in abc"+a);
	}


}
class inoverr extends abc
{
	public static void main(String[]args)
	{
		inoverr obj=new inoverr();
		obj.show(5);
		obj.show();
	}
	public void show()
	{
		System.out.println("this is show in inoverr overridding ");
	}

}
class vehicle
{
	int now=0;
	public void show()
	{
		System.out.println("show types of vehicle");
	}

}
class twowheeler extends vehicle
{
	twowheeler()
	{
    now=2;
     }
    public void show()
    {
    	System.out.println("show two weeler class no of weeles ="+now);
    }
}
class threewheeler extends vehicle
{
	threewheeler()
	{
	now=3;
    }
	public void show()
	{
		System.out.println("show three weeler class no of weels ="+now);
	}
}
class fourwheeler extends vehicle
{   
	fourwheeler()
	{
	now=4;}
	public void show()
	{
		System.out.println("show four weeler class no of weels ="+now);
	}
}
class testvehicle
{
	public static void main(String []args)
	{
		vehicle o1=new twowheeler();
		vehicle o2=new threewheeler();
		vehicle o3=new fourwheeler();
		o1.show();
		o2.show();
		o3.show();

	}
}
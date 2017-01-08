class thiss
{
	static String name;
	static  int no;
	static int marks;

	public void setdata(String name,int no,int marks)
	{
       this.name=name;
       this.no=no;
       this.marks=marks;
	}
	public void show()
	{
		System.out.println(name+"  "+no+"  "+marks);
	}
	public static void main(String[]args)
	{
       thiss obj=new thiss();
       obj.setdata("rishabh rawat",5,50);
       obj.show();
       obj.setdata("richa rawat",6,100);
       obj.show();
	}

}
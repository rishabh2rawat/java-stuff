class cons
{
   static String name;
   static int no;
   static int mark;

   cons()
   {
   	 name= "null";
   	 no=0;
   	 mark=0;

   }
   cons(String name,int no,int marks)
   {
   	this.name=name;
   	this.no=no;
   	this.mark=marks;
   }
   public static void main(String []args)
   {
   	cons obj=new cons();
   	System.out.println(name+""+no+""+mark);
   	cons obj1=new cons();
   	System.out.println(name+""+no+""+mark);


   }
}
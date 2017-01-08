import java.util.*;
class xyz
{
 public static void main(String[]args)
 {
  Scanner scan=new Scanner(System.in);
  int t=scan.nextInt();
  for(int i=0;i<t;i++)
  {int sum=0;
   int l=scan.nextInt();
   int r=scan.nextInt();
   for(int j=l;j<=r;j++)
   {
   int re=0;
     while(j/10!=0)
     {
      re=re*10+j%10;
      j=j/10;
      }
      if(re==j)
      {
      sum=sum+r;
      }
      }
      System.out.println(sum);
      }
      
      }
      }
      
      
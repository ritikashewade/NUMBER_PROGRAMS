class Disarium_Number
{
	public static void main(String[] args)
	{
		int a=135;
		int a2=a;
		int a1=a;
		int count=0;
		int sum=0;
		
		while(a1>0)
		{
			count++;
			a1=a1/10;
		}//count=3
		
		while(a2>0)
		{
			int rem=a2%10;		//5
			int pro=1;
			for(int i=1;i<=count;i++)
			{
				pro=pro*rem;
			}
			count--;
			sum=sum+pro;	
			a2/=10;
		}
		if(sum==a)
		{
			System.out.println("disarium number "+sum+" = "+a);
		}
		else
		{
			System.out.println("not a disarium number "+sum+" != "+a);

		}
	}
}
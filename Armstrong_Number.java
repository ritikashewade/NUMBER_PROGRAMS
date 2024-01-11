class Armstrong_Number
{
	public static void main(String[] args)
	{
		int a=1634;
		int a1=a;
		int a2=a;
		int count=0;
		int sum=0;
		while(a2>0)
		{
			int r=a2%10;
			count++;
			a2/=10;
		}
	
		while(a1>0)
		{
			int rem=a1%10;
			int pro=1;
			for(int i=1;i<=count;i++)
			{
				pro=pro*rem;
			}
			sum=sum+pro;
			a1/=10;
		}
		if(a==sum)
		{
			System.out.println("armstrong number "+a+" = "+sum);
		}
		else
		{
			System.out.println("not armstrong number "+a+" != "+sum);
		}
	}
}
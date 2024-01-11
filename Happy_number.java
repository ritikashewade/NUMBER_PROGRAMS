class Happy_number
{
	public static void main(String[] args)
	{
		int a=24;
		int a1=a;
		int sum=0;
		while(a1>0 || sum>9)
		{
			if(a1==0)
			{
				a1=sum;
				sum=0;
			}
			int rem=a1%10;
			int pro=1;
			for(int p=1;p<=2;p++)
			{
				pro=pro*rem;
			}
			sum=sum+pro;
			a1/=10;
		}	
		if(sum==1)
		{
			System.out.println(sum+" happy number");
		}
		else if(sum==4)
		{
			System.out.println(sum +" not happy");
		}
		else
		{
			System.out.println("not happy");
		}
	}
}
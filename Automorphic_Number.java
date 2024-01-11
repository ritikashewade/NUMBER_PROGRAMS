class Automorphic_Number
{
	public static void main(String[] args)
	{
		int a=76;
		int a1=a;
		int sq=a*a;
		int count=0;
		while(a1>0)
		{
			count++;
			a1/=10;
		}			//count=4
		int div=1;
		for(int i=1;i<=count;i++)
		{
			div=div*10;
		}
		int rem = sq%div;
		if(rem==a)
		{
			System.out.println("automorphic num "+rem+" = "+a);
		}
		else
		{
			System.out.println("not automorphic num "+rem+" != "+a);
		}		
	}
}
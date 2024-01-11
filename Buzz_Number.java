class Buzz_Number
{
	public static void main(String[] args)
	{
		buzz_Number();
	}
	
	public static void buzz_Number()
	{
		int a=77;
		if(a%7==0 || a%10==7)
		{
			System.out.println("buzz number");
		}	
		else
		{
			System.out.println("not a buzz number");
		}
	}
}
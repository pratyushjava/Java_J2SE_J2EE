class Season
{
	int month;
	
	Season(int month)
	{
		this.month=month;
	}
	
	void checkseason()
	{
		if(month>=3 && month<=5)
		{
			System.out.println("this is summer season");
		}
		else if(month>=6 && month<=8)
		{
			System.out.println("this is rainy season");
		}
		else if(month>=9 && month<=11)
		{
			System.out.println("this is spring season");
		}
		else
		{
			System.out.println("this is winter season");
		}
	}
		public static void main(String args[])
		{
			Season s1= new Season(Integer.parseInt(args[0]));
			s1.checkseason();
		}
}			
	
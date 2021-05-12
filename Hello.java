public class Hello {

	public static void main(String[] args) 
	{
		int val = 17;
		int div = 2;
		boolean isPrimeNum = true;
		
		for (int i = 0; i < val - 2; i++)
		{
			if (0 == val % div)
			{
				isPrimeNum = false;
				System.out.println("Composite Number");
				break;
			}
			
			div++;
						
		}
		
		
		if (isPrimeNum == true)
			System.out.println("Prime Number");
		
		
	}

	

}


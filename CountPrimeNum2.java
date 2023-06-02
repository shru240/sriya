package array;

public class CountPrimeNum2 {

	public static void main(String[] args) {
		int []a={4,5,6,7,3,2};
		
		for(int i=0;i<a.length;i++) {
			
			if(isprime(a[i])) 
			{
				System.out.println(a[i]);
			}
		}
		
		}
	
	
	public static boolean isprime(int x)
	{
		
		int i =2;
		int count =0;
		while(i<=x/2) 
		{
			if(x%i==0)
			{
			 count++;
			}
	     i++;
			
		}
	 if(count==0)
	 {
		 
	 }
	}
	
	
	}


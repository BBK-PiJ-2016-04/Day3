public class Factorial 
{ 
	public static void main(String[] args) 
	{
        	Factorial factorial = new Factorial();
		factorial.launch();
	}

	private void launch() {
		System.out.println("Enter the number to calculate its factorial");
		int myInt = Integer.parseInt(System.console().readLine());
		System.out.println("Factorial of "+myInt+" is:"+factorial(myInt));
		
	}

	public void aMethod(){
	}

	public int factorial(int n) {
		if (n == 1){
		 	return 1;
		} else {
		 	 int fact = n * factorial(n-1);
			  return fact;					 	
		}
	}
}


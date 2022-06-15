import java.util.*;
class Factorial{
	
	public static void main(String[] args){
		Factorial fn=new Factorial();
		fn.findFactorial();
			
		
	}
	public void findFactorial(){
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number :");
		
		int number = sc.nextInt();
		int  factorialNumber=1;
		for(int i=number;i>0;i--){
			factorialNumber=factorialNumber*i;
		}
		System.out.println(number+" factorialNumber is :"+factorialNumber);
		}
		
		catch(InputMismatchException  e){
			System.out.println("please enter valid number");
			
		}	
	}
}
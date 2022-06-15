import java.util.*;

class  FibonacciNumbers{
	public static void main(String[] args){
		FibonacciNumbers fn=new FibonacciNumbers();
		fn.calculate();
			
		
	}	
	
	public void calculate(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number that you want to find the fabonaccinumber:");
		try{
			int number=sc.nextInt();
			int input1=0;
			int input2=1;
			int sum=0;
			int i=2;
			System.out.print(input1+","+input2);
			do{
				sum=input1+input2;
				System.out.print(","+sum);
				input1=input2;
				input2=sum;
				i++;
			}while(i<number);
		}
		
		catch(InputMismatchException  e){
			System.out.println("please enter valid number");
			calculate();
		}
		
	}
	
}
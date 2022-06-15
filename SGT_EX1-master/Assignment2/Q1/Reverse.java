class Reverse{
	public static void main(String[] args){
		int number=123456;
		int i=0;
		while(number!=0){
			int remainder=number%10;
			i=i*10+remainder;
			number=number/10;
		}
		System.out.println("Reverse numbers are : "+i);
	}	
}
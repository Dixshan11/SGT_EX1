public class StandardDeviation{
	public static void main(String [] args){
		double[] array={11,13,14,12,45,56,32,43,23,54};
	double sum=0;
		double average=0;
		double  total=0;
		
		for(int i=0;i<array.length;i++){
			sum=sum+array[i];
		}
		
		average=sum/array.length;
		
		
		for(int i=0;i<array.length;i++){
			total=total+((array[i]-average)*(array[i]-average));
		}
		
		System.out.println(total);
		
		
	}
}
public class LinearSearch{
	public static void main(String[] args){
		int[]array={11,23,44,66,77,40,33,34,90,34};
		int searchvalue=44;
		int i;
		for( i=0;i<array.length;i++){
			
			if(array[i]==searchvalue){
				System.out.println("element "+searchvalue+" is founded in "+i+" index");
				break;
			}
			
		}
		
		if(i==array.length){
			System.out.println("element  is not founded ");
		}
	}
}
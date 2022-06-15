public class SelectionSort{
	public static void main(String[]args){
		int[]array={11,23,44,66,77,40,33,34,90,34};
		int min=0;
		int temp;
		for(int i=0;i<array.length-1;i++){
			min=i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[min]){
					min=j;
				}
				
				if(min!=i){
					temp=array[i];
					array[i]=array[min];
					array[min]=temp;
				}
			}
			
		}
		
		for(int i=0;i<array.length;i++){
				System.out.println(array[i]);
			}
	}
}
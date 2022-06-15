public class BubbleSort{
	public static void main(String [] args){
		int[]array={11,23,44,66,77,40,33,34,90,34};
		int temp=0;
		int flag;
		for(int i=0;i<array.length-1;i++){
		flag=0;
			for(int j=0;j<array.length-1;j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag=1;
				}
				
				
			}
			if(flag==0){
					break;
				}
			
			
		}
		
		for(int i=0;i<array.length;i++){
				System.out.println(array[i]);
			}
	}
}
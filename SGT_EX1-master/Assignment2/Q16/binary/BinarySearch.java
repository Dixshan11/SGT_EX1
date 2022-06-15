public class BinarySearch{
	public static void main (String [] args){
		int[]array={11,23,44,66,77,40,33,34,90,34};
		int searchvalue=44;
		int startvalue=0;
		int endvalue=array.length-1;
		int mid=(startvalue+endvalue)/2;
		
		 while( startvalue <= endvalue ){
			 
				 if(array[mid]<searchvalue){
					startvalue=mid+1;
				
				}
					else if(searchvalue==array[mid]){
					System.out.println("searchvalue value is found at : "+mid+" index");
					break;
				}
				else{
					endvalue=mid-1;
				}
				
				 mid=(startvalue+endvalue)/2; 
			
			}
				if ( startvalue > endvalue ){  
					System.out.println("Element is not found!");  
					
				}  
				
			
		
		
	}
}
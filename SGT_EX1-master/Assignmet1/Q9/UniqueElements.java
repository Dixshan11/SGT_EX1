

public class UniqueElements {
    public static void main(String[] args) {
        int[] numbers=new int[]{9,2,1,4,5,2,1,9,3,4};
        int flag=0;
        for(int i=0;i<numbers.length;i++){

            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    flag=1;
                    break;
                }
                else{
                   flag=0;
                }
            }
                if(flag==0){
                    System.out.println(numbers[i]);
                }
        }
    }
}

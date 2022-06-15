


public class CountUnique {
    public static void main(String[] args) {
        int[] numbers={1,1,1,1,2,2,3,4,5,5,6,6,3};
        int ArraySize=0;
        int count=0;
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
                count=0;
                ArraySize=ArraySize+1;

                for(int j=0;j<numbers.length;j++ ){
                    if(numbers[i]==numbers[j]){
                        count=count+1;
                    }
                }
                System.out.println("number "+numbers[i]+" repeated "+count+" times");


            }


        }


    }
}


// using collections
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class CountUnique {
//    public static void main(String[] args) {
//        int arrayWithDuplicates[] = { 1,1,1,1,2,2,3,4,5,5,6,6 };
//
//        //create a hashmap having integer type of key-value
//        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
//
//        //use for loop to pull the elements of array to hashmap's key
//        for (int j = 0; j < arrayWithDuplicates.length; j++) {
//            hashmap.put(arrayWithDuplicates[j], j);
//        }
//        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method
//        System.out.println(hashmap.keySet());
//int count;
//        for (int i : hashmap.keySet()) {
//            count=0;
//          for(int j=0;j<arrayWithDuplicates.length;j++){
//
//              if(arrayWithDuplicates[j]==i){
//                  count=count+1;
//              }
//          }
//          System.out.println(" number "+i+"  repeated "+count +" times");
//        }
//    }
//
//
//
//}
//


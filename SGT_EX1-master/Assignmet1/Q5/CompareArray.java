

public class CompareArray {
    public static void main(String[] args) {
        String word1="asdfg";
        String word2="asdfg";
        if(check(word1,word2)){
                System.out.println("same arrays");
        }else{
                 System.out.println("difference arrays");
        }

    }

    public  static boolean check(String word1,String word2){
        boolean flag=false;
        if(word1.length()==word2.length()){
            char[] Word1Array = new char[word1.length()];
            char[] Word2Array = new char[word2.length()];

            for(int i=0;i<Word1Array.length;i++){
                Word1Array[i]=word1.charAt(i);
                Word2Array[i]=word2.charAt(i);
            }

            for(int i=0;i<Word1Array.length;i++){
                Word1Array[i]=word1.charAt(i);
                Word2Array[i]=word2.charAt(i);
                if(Word1Array[i]==Word2Array[i]){
                   flag=true;
                }
                else{
                   return flag=false;

                }

                return flag;
            }
        }
        else{
            System.out.println("Words length are difference");
        }
return flag;
    }
}

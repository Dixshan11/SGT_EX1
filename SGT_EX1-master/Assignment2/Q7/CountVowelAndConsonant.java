package Assignment2;

public class CountVowelAndConsonant {
    public static void main(String[] args) {
        String letter="ALPHABET";
        char[] vowel={'A','E','I','O','U'};
        int vowelCount=0;
        int conCount=0;
        for(int i=0;i<letter.length();i++){
            for(int j=0;j<vowel.length;j++){
                if(vowel[j]==letter.charAt(i)){
                    vowelCount+=1;
                }

            }
            conCount=letter.length()-vowelCount;
        }

        System.out.println("Vowel count is "+vowelCount);
        System.out.println("Consonant count is "+conCount);
    }
}

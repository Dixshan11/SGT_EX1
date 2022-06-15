
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {

        char letter;

        Scanner sc= new Scanner(System.in);

        System.out.println("Please Enter any Character ");
        letter = sc.next().toUpperCase().charAt(0);

        System.out.println("using if ");
        char[] vowel={'A','E','I','O','U'};
        int flag=0;
        for(int i=0;i<vowel.length;i++){

            if(letter==vowel[i]){
                System.out.println(letter+" is vowel");
                flag=1;
            }
        }
        if(flag==0){
            System.out.println(letter+" is not vowel");
        }
        System.out.println("");
        System.out.println("using switch case");

        switch(letter) {
            case 'A':
                System.out.println(letter+" is vowel");
                break;
            case 'E':
                System.out.println(letter+" is vowel");
                break;
            case 'I':
                System.out.println(letter+" is vowel");
                break;
            case 'O':
                System.out.println(letter+" is vowel");
                break;
            case 'U':
                System.out.println(letter+" is vowel");
                break;
            default:
                System.out.println(letter+" is not vowel");
        }


    }
}

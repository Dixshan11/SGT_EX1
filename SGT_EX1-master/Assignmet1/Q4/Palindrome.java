
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a word");
        String name=scan.nextLine();
       System.out.println(checkPalindrome(name));
    }

    public static boolean checkPalindrome(String name){
        boolean flag=false;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==name.charAt(name.length()-(i+1))){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }
}

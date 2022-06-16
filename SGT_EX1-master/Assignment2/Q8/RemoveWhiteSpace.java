package Assignment2;
import java.util.ArrayList; // import the ArrayList class
public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String letter="some extra space";
        ArrayList<String> removedSpace = new ArrayList<String>();
        char space=' ';
        for(int i=0;i<letter.length();i++){
            if(space!=letter.charAt(i)) {

                removedSpace.add(Character.toString(letter.charAt(i)));

            }
            }

        for(int i=0;i< removedSpace.size();i++){
            System.out.print(removedSpace.get(i));
        }

        }
    }


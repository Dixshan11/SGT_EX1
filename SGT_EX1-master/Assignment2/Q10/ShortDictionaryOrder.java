
import java.util.Arrays;
public class ShortDictionaryOrder {

    // with out inbuild functions
    public static void shortWithoutInbuildFunction(String element[])
    {
        for (int i = 0; i < element.length; i++) {
            for (int j = i + 1; j < element.length; j++) {
                if (element[i].compareToIgnoreCase(element[j]) > 0) {
                    String temp = element[i];
                    element[i] = element[j];
                    element[j] = temp;
                }
            }
        }
        for (String string : element)
            System.out.print(string + " ");
             System.out.println();
    }


    //with inbuild functions
    public static void shortUsingInbuildFunction(String elements[]) {
        Arrays.sort(elements,
                String.CASE_INSENSITIVE_ORDER);

        // printing String array after sorting.
        for (String string : elements)
            System.out.print(string + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {

        String elements[] = { "Apple",    "Banana", "yellow",
                "Zebra", "Boolean", "Anger" };

        System.out.println("with out inbuild functions");
        shortWithoutInbuildFunction(elements);
        System.out.println("");
        System.out.println("with  inbuild functions");
        shortUsingInbuildFunction(elements);
    }
}

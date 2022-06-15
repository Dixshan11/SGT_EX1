

public class TowDynArray {
    public static void main(String[] args) {
        String[] Details = {"Name", "Age", "Address"};
        String[][] DetailsVal = {
                {"dix", "26", "chankanai"},
                {"lux", "27", "colombo",},
                {"kiri", "25", "kandy",}

        };

        System.out.println("...................................");
        for(int i=0; i<Details.length;i++){
            System.out.print(Details[i]+"          ");
        }
        System.out.println();
        System.out.println("...................................");
        for (int row = 0; row < DetailsVal.length; row++) {
            for (int col = 0; col < DetailsVal[row].length; col++) {
                System.out.print(DetailsVal[row][col]+"           ");
            }
            System.out.println();
        }

        System.out.println("...................................");

    }
}

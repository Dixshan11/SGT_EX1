
import java.util.Scanner;
public class PrintPatterns {
    public static void main(String[] args) {
        System.out.println("..........Menu.............");
        System.out.println("1 Print square");
        System.out.println("2 Print rectangle");
        System.out.println("3 Print cross");
        System.out.println("4 Print plus");
        System.out.println("5 Print DIAMOND");
        System.out.println("6 To exit application");

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter ");
        int val=scan.nextInt();
        if(val==1){
            square();
        }
        if(val==2){
            rectangle();
        }
        if(val==3){
            cross();
        }
        if(val==4){
           plus();
        }
        if(val==5){
            DIAMOND();
        }
        if(val==6){
               exit();
        }

    }

    public static void square(){
        for(int i=0;i<5;i++)
            System.out.println("***** ");
    }

    public static void rectangle(){
        for(int i=0;i<5;i++)
            System.out.println("********** ");
    }

    public static void cross(){

        for (int i = 1; i < 5 + 1; i++) {
            for (int j = 1; j < 5 + 1; j++) {
                if (i == j || i + j == 5 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void plus(){

        int i = 1 ;
        while( i <= 4 * 2 - 1 )
        {
            if (i != 4)
            {
                int j = 1 ;
                while(j <= 4)
                {
                    if(j == 4) {
                        System.out.print("*");
                    }
                    System.out.print(" ");
                    j++;
                }
            }
            else
            {
                int k = 1;
                while(k <= 4 * 2 - 1 )
                {
                    System.out.print("*");
                    k++;
                }
            }
            System.out.println();
            i++;
        }
    }


    public static void DIAMOND(){

        int i,j;

        for(i=1;i<=5;i++)
        {
            for(j=i;j<5;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=5;i>=1;i--)
        {
            for(j=i;j<=5;j++)
            {
                System.out.print(" ");
            }
            for(j=2;j<(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }



    public static void exit(){


    }

}

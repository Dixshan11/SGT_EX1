

public class Factors {
    public static void main(String[] args) {
        double num=60;

        for(int i=1;i<=num;i++){
            double x=num/i;


            if(x%1==0){
              System.out.print(i+"  ");
            }
        }
    }
}

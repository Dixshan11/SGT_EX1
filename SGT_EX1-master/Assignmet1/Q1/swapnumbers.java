

public class swapnumbers {
    public static void main(String[] args) {
        int a=10;
        int b=30;

        System.out.println("before swap numbers are a= "+a+"   b="+b);

        a=a+b;//40
        b=a-b;//10
        a=a-b;//30

        System.out.println("after swap numbers are a= "+a+"   b="+b);
    }
}
